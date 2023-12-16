package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {

	public FileLib() {
		// TODO Auto-generated constructor stub
	}

	public String readDataFromProperty1(String key) throws IOException{
		FileInputStream fis=new FileInputStream("./data/commondata.proprties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String data=pobj.getProperty(key);
		return data;
	}
	
	public String readDataFromExcel(String sheet,int row,int cell) throws IOException{
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String data=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return data;
		
	}
	
	public void writeDataIntoExcel(String sheet,int row,int cell, String value) throws IOException{
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		wb.getSheet(sheet).getRow(row).getCell(cell).setCellValue(value);
		FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
	    wb.write(fos);
	    wb.close();
		
	}
	
}
