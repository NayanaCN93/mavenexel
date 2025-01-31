package com.obsqura.Mavenexel;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {
	static FileInputStream fi;
	static XSSFWorkbook wb;
	static XSSFSheet sh;
	 
	public static String readString(int i,int j) throws Exception{
		fi=new FileInputStream("C://Users//nayan//OneDrive//Documents//Name detail.xlsx");
		wb=new XSSFWorkbook(fi);
		sh=wb.getSheet("Sheet1");
		XSSFRow row=sh.getRow(i);
		XSSFCell cell=row.getCell(j);
		return cell.getStringCellValue();
		
	}

public static double readNumber(int i,int j) throws Exception{
	fi= new FileInputStream("C://Users//nayan//OneDrive//Documents//Name detail.xlsx");
	wb= new XSSFWorkbook(fi);
	sh= wb.getSheet("Sheet1");
	XSSFRow row=sh.getRow(i);
	XSSFCell cell=row.getCell(j);
	return cell.getNumericCellValue();
	
}
public static void main(String[] args) throws Exception{
	String Name= ExcelCode.readString(1, 0);
	System.out.println(Name);
	double age= ExcelCode.readNumber(1,1);
	System.out.println(age);
	
	
	
}
}
