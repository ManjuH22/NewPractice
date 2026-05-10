package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		 FileInputStream file = new FileInputStream("E://Majunath Resume//Driventes.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		int sheets = workbook.getNumberOfSheets();
		System.out.println(sheets);
		
		for(int i=0;i<sheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("testdata"))
			{
				XSSFSheet sheet = workbook.getSheetAt(i);
				Iterator<Row> firstrow = sheet.iterator();
				Row row = firstrow.next();
				Iterator<Cell> c = row.cellIterator();
				
				int k=0;
				int column=0;
				while(c.hasNext())
				{
					Cell cell = c.next();
					
					
					
					if(cell.getStringCellValue().equalsIgnoreCase("Testcases"))
					{
						column=k;
					}
					k++;
				}
				
				while(firstrow.hasNext())
				{
					Row r = firstrow.next();
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase("Purchase"))
					{
						Iterator<Cell> c1 = r.cellIterator();
						while(c1.hasNext())
						{
					
							System.out.println(c1.next().getStringCellValue());
						}
					}
				}
				
			}
			
			
			
		}
		
		

	}

}
