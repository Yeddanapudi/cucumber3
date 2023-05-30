package externaldata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writingdata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f=new FileInputStream("D://READING1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet3");
		Row r=null;
		Cell c=null;
		r=ws.createRow(2);
		r.createCell(3).setCellValue("welcome");
		
		r=ws.createRow(3);
		r.createCell(4).setCellValue("java");
		
		r=ws.createRow(4);
		r.createCell(5).setCellValue("tutorials");
		
		FileOutputStream f1=new FileOutputStream("D://READING1.xlsx");
		wb.write(f1);
		f1.close();
			
	}
	

}
