package com.Facebook.GenericLibrary;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLib {
	
	public String getExceldata(String shname,int rownum,int colnum) throws EncryptedDocumentException, InvalidFormatException, IOException 
	{	
		
		FileInputStream fis=new FileInputStream(Constants.filePath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(shname);
		Row r=sh.getRow(rownum);
		String data=r.getCell(colnum).getStringCellValue();
		wb.close();
		return data;
	
	}
	public int getRowcount(String shname) throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
		FileInputStream fis=new FileInputStream(Constants.filePath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(shname);
		int r1=sh.getLastRowNum();
		wb.close();
		return r1;
	}
	public void setRowData(String shname,int rownum,int colnum,String data) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream(Constants.filePath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(shname);
		Row row=sh.getRow(rownum);
		Cell cel=row.createCell(colnum);
		cel.setCellValue(data);
		FileOutputStream fos=new FileOutputStream(Constants.filePath);
		
		wb.write(fos);
		wb.close();
}
}


