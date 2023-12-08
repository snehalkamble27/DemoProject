package com.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class WriteExcelFile {
	/*
	@Test
	public void test01()throws Exception{
		Sheet sh=null;
		Row row=null;
		Cell c=null;
		
		FileInputStream fis=new FileInputStream("Test.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		
		if(wb.getSheet("JBK")==(null)){
			sh=wb.createSheet();
		}
		
			else{
				sh=wb.createSheet();
				}
		if (sh.getRow(3)==null)
		row=sh.createRow(3);
		else
			sh.getRow(3);
		
		if(row.getCell(5)==null)
			c=row.createCell(5);
		else
			c=row.getCell(5);
		
	c.setCellValue("The Kiran Academy");
	FileOutputStream fos=new FileOutputStream("Test.xlsx");
	wb.write(fos);
	wb.close();
	fos.close();
	}}
	*/
	 @Test
	 public void test02(){
	 }
			
		
		
		
	}


