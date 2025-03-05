package com.crm.generic.fileUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	
	public String getDtaFromExcel(String sheetname, int rownum, int cellnum) throws EncryptedDocumentException, IOException  {
		FileInputStream fiswk = new FileInputStream("./resource/credentials.xlsx");
		Workbook wk =WorkbookFactory.create(fiswk);
		wk.close();
		return wk.getSheet(sheetname).getRow(rownum).getCell(cellnum).toString();
		
	}
	
	public void setDataintoExcel(String value, String sheetname, int rownum, int cellnum) throws EncryptedDocumentException, IOException {
		FileInputStream fiswk = new FileInputStream("./resource/credentials.xlsx");
		Workbook wk =WorkbookFactory.create(fiswk);
		wk.getSheet(sheetname).getRow(rownum).createCell(cellnum).setCellValue(value);
		
		FileOutputStream fos = new FileOutputStream("./resource/credentials.xlsx");
		wk.write(fos);
		wk.close();
	}
	
	public int getRowcount(String sheetname) throws EncryptedDocumentException, IOException {
		FileInputStream fiswk = new FileInputStream("./resource/credentials.xlsx");
		Workbook wk =WorkbookFactory.create(fiswk);
		wk.close();
		return wk.getSheet(sheetname).getLastRowNum();
		
	}
}
