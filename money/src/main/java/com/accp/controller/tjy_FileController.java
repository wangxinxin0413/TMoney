package com.accp.controller;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.accp.domain.Good;
import com.accp.domain.Goodcolor;
import com.accp.domain.Gooddetails;
import com.accp.domain.Goodsize;
import com.accp.domain.Goodtype;
import com.accp.domain.good_spgl_sqlall;
import com.accp.service.tjy_spgl_service;
import com.accp.service.tjy_spib_service;

@Controller
@RequestMapping("/sfile")
public class tjy_FileController {
	@Autowired
	tjy_spib_service service;
	
	@Autowired
	tjy_spgl_service service1;
	
	
    @RequestMapping("/toPage")
	public String Page() {
		return "good_spgl";
	}
    
    
    @RequestMapping("/upload")
	public String upload(MultipartFile [] files) {
		File directory = new File("/Users/tangyong/upload");
		if(!directory.exists()) {
			directory.mkdirs();
		}
		try {
			for(MultipartFile l : files) {
				String url = "/Users/tangyong/upload/";
				url = url+"/"+l.getOriginalFilename();
				File f = new File(url);
				l.transferTo(f);
			}
			System.out.println("to成功了");
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/file/toPage";
	}
    
    @RequestMapping("/uploadAjax")
	@ResponseBody
	public String uploadAjax(MultipartFile [] files) {
		File directory = new File("/Users/tangyong/upload");
		if(!directory.exists()) {
			directory.mkdirs();
		}
		try {
			for(MultipartFile l : files) {
				String url = "/Users/tangyong/upload/";
				url = url+"/"+l.getOriginalFilename();
				File f = new File(url);
				l.transferTo(f);
			}
			System.out.println("to成功了");
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "success";
	}
    //模板导入
	@RequestMapping("/download")
	public ResponseEntity<byte []> download(){
		System.out.println("模板下载");
		try {
			FileInputStream is = new FileInputStream("C:/Users/Dell/Pictures/Screenshots/elscdxlsx.xlsx");
			byte[] bytes = new byte[is.available()];
			is.read(bytes);
			HttpHeaders headers = new HttpHeaders();
			headers.setContentDispositionFormData("attachment", new String("学生导入模版.xlsx".getBytes("utf-8"),"iso-8859-1"));
			headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
			return new ResponseEntity<byte[]>(bytes, headers, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
 
   	//文件上传
   	@RequestMapping("/excelUpload")
	public String excelUpload(MultipartFile file,Integer shopname) {
		try {
			Workbook wb = new XSSFWorkbook(file.getInputStream());
			//获取sheet业的个数
			int sheets = wb.getNumberOfSheets();
			for(int i=0;i<sheets;i++) {
				//根据下标获取sheet页
				Sheet sheet = wb.getSheetAt(i);
				//获取当前sheet页的行数
				int rows = sheet.getPhysicalNumberOfRows();
				System.out.println("长度="+rows);
				for(int j=1;j<rows;j++) {
					//根据下标获取行
					Row row = sheet.getRow(j);

					Cell GoodtypenameCell = row.getCell(0);//类别
					Cell GoodnameCell = row.getCell(1);//品名
					Cell GoodtiaoxinmaCell = row.getCell(2);//货号/条码
					Cell GoodsizenameCell = row.getCell(3);//规格
					Cell GooddetailscountCell = row.getCell(4);//库存
					Cell GoodTagpriceCell = row.getCell(5);//销售价
					Cell GoodCostpriceCell = row.getCell(6);//成本价
					Cell Goodcolorname = row.getCell(7);//颜色
					
					Goodtype y=new Goodtype();//商品类型
				    Gooddetails s=new Gooddetails();//商品详情表
					Goodcolor r=new Goodcolor();//颜色
					Goodsize e=new Goodsize();//尺码
					//根据名字看看有没有这个类型有就拿id没有就添加
					if(service1.selecttype(GoodtypenameCell.getStringCellValue())==null) {
						Goodtype yy=new Goodtype();
						yy.setGoodtypename(GoodtypenameCell.getStringCellValue());
						service1.indestype(yy);
						y.setGoodtypeid(yy.getGoodtypeid());
					}else{
						y=service1.selecttype(GoodtypenameCell.getStringCellValue());
					}
					
					System.out.println("类型id="+y.getGoodtypeid());
					//根据名字查看商品主表有没有这个物品有就不新增没有就新增
					Good g=new Good();//商品
					
					if(service1.selectname(GoodnameCell.getStringCellValue())==null){
						Good gg=new Good();
						gg.setGoodtypeid(y.getGoodtypeid());//类型id
						gg.setGoodname(GoodnameCell.getStringCellValue());//名字
						String huohao=service1.seleclimit();//查询到最后一条货号
						System.out.println("之前的货号"+huohao);
						String huo=huohao.substring(0,huohao.length()-5);//获取减少4个字符的字符串
						System.out.println(huo);
						String haos=huohao.substring(huohao.length()-5);//获取字符串最后4位
						System.out.println(haos);
						int hao=Integer.parseInt(haos)+1; 
						huohao=huo+hao;
						System.out.println("现在的货号"+huohao);
						gg.setGoodcode(huohao);//货号
						gg.setGoodtagprice(GoodTagpriceCell.getNumericCellValue());//吊牌价格
						gg.setGoodcostprice(GoodCostpriceCell.getNumericCellValue());//成本价格
						service1.indesgood(gg);//新增商品
						g.setGoodid(gg.getGoodid());
					}else {
						g=service1.selectname(GoodnameCell.getStringCellValue());
					}
					System.out.println("店铺id="+shopname);
					service1.insershop(shopname,g.getGoodid());
					System.out.println("新商品id="+g.getGoodid());
					//判断是什么颜色
						if(service1.selectcolor(Goodcolorname.getStringCellValue())==null){
							Goodcolor rr=new Goodcolor();//颜色
							rr.setGoodcolorname(Goodcolorname.getStringCellValue());
							service1.insertcolor(rr);
							r=rr;
						}else {
							r=service1.selectcolor(Goodcolorname.getStringCellValue());
						}
						//判断是什么尺码
							
						if(service1.selectsize(GoodsizenameCell.getStringCellValue())==null){
							Goodsize ee=new Goodsize();//尺码
							ee.setGoodsizename(GoodsizenameCell.getStringCellValue());
							service1.insertsize(ee);
							e=ee;
						}else {
							e=service1.selectsize(GoodsizenameCell.getStringCellValue());
						}
						System.out.println("颜色id="+r.getGoodcolorid());
						System.out.println("尺码id="+e.getGoodsizeid());
						//判断子表是否有
						
						if(service1.selectdeta(r.getGoodcolorid(),e.getGoodsizeid(),g.getGoodid())==null) {
							Gooddetails ss=new Gooddetails();//商品详情表
							ss.setGoodid(g.getGoodid());//商品id
							ss.setGoodcolorid(r.getGoodcolorid());//颜色id
							ss.setGoodsizeid(e.getGoodsizeid());//尺码id
							Date d=new Date();
							SimpleDateFormat t=new SimpleDateFormat("yyyyMMddHHmmss");
							String ds=t.format(d)+j;
							System.out.println("时间="+ds);
							//条形码这列还没有明天搞
							ss.setGoodtiaoxinma(ds);//条形码
							ss.setGooddetailscount(5);//库存
							System.out.println("条形码="+ss.getGoodtiaoxinma());
							System.out.println("新商品id="+ss.getGoodid());
							System.out.println("颜色id="+ss.getGoodcolorid());
							System.out.println("尺码id="+ss.getGoodsizeid());
							System.out.println("库存="+ss.getGooddetailscount());
							service1.insertdeta(ss);//新增子表
						}
						
					//g.setGoodname();m名字
					/*g.get(nameCell.getStringCellValue());
					Double age = ageCell.getNumericCellValue();
					stu.setAge(age.intValue());
					stu.setBirthday(birthdayCell.getDateCellValue());*/
					//service1.insert(g);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:toPage";
	}
    /*导出*/
    @RequestMapping("/excelchu")
   	public ResponseEntity<byte []> toPage(Integer goodtypeid,String goodname,Integer shopid) {
   		System.out.println("sssss");
    	//查询出需要导出的商品信息
   		List<good_spgl_sqlall> sqgl=service1.spglsqlAlls(goodtypeid, goodname, shopid);
    			//导出商品信息为excel
    			Workbook wb = new XSSFWorkbook();
    			Sheet sheet = wb.createSheet();
    			
    			Row titleRow = sheet.createRow(0);
    			titleRow.createCell(0).setCellValue("序号");
    			titleRow.createCell(1).setCellValue("类别");
    			titleRow.createCell(2).setCellValue("品名");
    			titleRow.createCell(3).setCellValue("货号/条码");
    			titleRow.createCell(4).setCellValue("规格");
    			titleRow.createCell(5).setCellValue("库存");
    			titleRow.createCell(6).setCellValue("销售价");
    			titleRow.createCell(7).setCellValue("成本价");
    			titleRow.createCell(8).setCellValue("颜色");
    			SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
    			for(int i=0;i<sqgl.size();i++) {
    				Row row = sheet.createRow(i+1);
    				
    				/*Cell idCell = row.createCell(0);
    				idCell.setCellValue(i);//序号
*/    				
    				Cell GoodtypenameCell = row.createCell(0);
    				GoodtypenameCell.setCellValue(sqgl.get(i).getGoodtypename());//类别
    				
    				Cell GoodnameCell = row.createCell(1);
    				GoodnameCell.setCellValue(sqgl.get(i).getGoodname());//品名
    				
    				Cell GoodtiaoxinmaCell = row.createCell(2);
    				GoodtiaoxinmaCell.setCellValue(sqgl.get(i).getGoodtiaoxinma());//货号/条码
    				
    				Cell GoodsizenameCell = row.createCell(3);
    				GoodsizenameCell.setCellValue(sqgl.get(i).getGoodsizename());//规格
    				
    				Cell GooddetailscountCell = row.createCell(4);
    				GooddetailscountCell.setCellValue(sqgl.get(i).getGooddetailscount());//库存
    				
    				Cell GoodTagpriceCell = row.createCell(5);
    				GoodTagpriceCell.setCellValue(sqgl.get(i).getGoodTagprice());//销售价
    				
    				Cell GoodCostpriceCell = row.createCell(6);
    				GoodCostpriceCell.setCellValue(sqgl.get(i).getGoodCostprice());//成本价
    				
    				Cell Goodcolorname = row.createCell(7);
    				Goodcolorname.setCellValue(sqgl.get(i).getGoodcolorname());//颜色
    				
    				//Cell birtydayCell = row.createCell(2);
    				/*if(sqgl.get(i).getBirthday()!=null) {
    					birtydayCell.setCellValue(f.format(list.get(i).getBirthday()));
    				}*/
    				
    			}
    			HttpHeaders headers = new HttpHeaders();
    			ByteArrayOutputStream bot = new ByteArrayOutputStream();
    			try {
    				wb.write(bot);
    				headers.setContentDispositionFormData("attachment", new String("导出的学生信息.xlsx".getBytes("utf-8"),"iso-8859-1"));
    				headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
    			} catch (IOException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
    			return new ResponseEntity<byte[]>(bot.toByteArray(), headers, HttpStatus.OK);
   	}
}
