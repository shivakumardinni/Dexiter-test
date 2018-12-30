package com.dexiter.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataHandlers {
public static String readDataFromExcel(String filename,String sheetName,int rowIndex,int cellIndex)
{
	String data=null;
	try
	{
		File f=new File("./test-data/+filename+.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook w=WorkbookFactory.create(fis);
		Sheet s=w.getSheet(sheetName);
		Row r=s.getRow(rowIndex);
		Cell c=r.getCell(cellIndex);
		data=c.toString();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return data;
}
public static void WriteDataToExcel(String fileName, String sheetName, int rowIndex,int cellIndex,String data)
{
	
	try {
		File f=new File("./test-data+fileName+.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook w=WorkbookFactory.create(fis);
		Sheet s=w.getSheet(sheetName);
		Row r=s.getRow(rowIndex);
		Cell c=r.getCell(cellIndex);
		c.setCellValue(data);
		FileOutputStream fos=new FileOutputStream(f);
		w.write(fos);
		
	} 
	catch (Exception e) 
	{
		e.printStackTrace();
	}
}
public static String getDataFromPropertyFile(String fileName,String key)
{
	String data=null;
	File f=new File("./test-data+fileName+.properties");
	try {
		FileInputStream fis=new FileInputStream(f);
		Properties prop=new Properties();
		prop.load(fis);
		data=(String)prop.get(key);
		
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	return data;
	
}
public static void WriteDataToPropertyFile(String fileName, String key, String value, String comment)
{
	try
	{
	File f=new File("./test-data/+fileName+.properties");
	FileInputStream fis=new FileInputStream(f);
	Properties prop=new Properties();
	prop.setProperty(key, value);
	FileOutputStream fos=new FileOutputStream(f);
	prop.store(fos,comment);
}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
