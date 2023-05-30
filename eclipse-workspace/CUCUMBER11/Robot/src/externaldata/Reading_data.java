package externaldata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reading_data {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream f=new FileInputStream("D://READING1.xlsx");
XSSFWorkbook wb=new XSSFWorkbook(f);
XSSFSheet ws=wb.getSheet("Sheet2");
Row r;
Cell c;

Iterator<Row>row=ws.iterator();
while(row.hasNext())
{
	r=row.next();
Iterator<Cell>cell=r.iterator();
while (cell.hasNext())
{
	c=cell.next();
	/*if(c.getCellType()==c.CELL_TYPE_NUMERIC)
	{
		System.out.println(c.getNumericCellValue());
	
		}
	else if(c.getCellType()==c.CELL_TYPE_STRING)
	{
		System.out.println(c.getStringCellValue());
		
	}*/
	if(c.getCellType() == c.CELL_TYPE_STRING) {  
	//	   c.getStringCellValue();
		   System.out.println(c.getStringCellValue());    					
		}
else if(c.getCellType() == c.CELL_TYPE_NUMERIC) {  
	//	double cellValue = c.getNumericCellValue();
		System.out.println(c.getNumericCellValue());
}
}
}
	}
}

	


