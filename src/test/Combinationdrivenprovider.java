package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Combinationdrivenprovider 

{

	@Test(dataProvider="drivendata")
	public void print(String greeting, String communication, String id)
	{
		System.out.println(greeting + communication + id);
		
	}
	
	
	@DataProvider(name="drivendata")
	public Object[][] getdata() throws IOException
	{
		DataFormatter formatter = new DataFormatter();
		FileInputStream file = new FileInputStream("C://Users//MANU//Downloads//Data.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheets = workbook.getSheetAt(0);
		int rowscount = sheets.getPhysicalNumberOfRows();
		Iterator<Row> rowit = sheets.iterator();
		Row firstrow = rowit.next();
		short columncount = firstrow.getLastCellNum();
		Object[][] data= new Object[rowscount-1][columncount];
		
		for(int i=0;i<rowscount-1;i++)
		{
			XSSFRow row = sheets.getRow(i+1);
			
			for(int j=0;j<columncount;j++)
			{
				XSSFCell cell = row.getCell(j);
				formatter.formatCellValue(cell);
				data[i][j]=formatter.formatCellValue(cell);
			}
		}
		return data;
			
	}
	
}
