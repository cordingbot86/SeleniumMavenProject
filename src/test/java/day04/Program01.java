package day04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Program01 {
	
	public static void main(String[]arg) throws Exception {
		getXpath("lastName");
		getXpath("firstName");
		getXpath("showPassword");
	}
			
	
	

	public static void getXpath(String fieldName) throws Exception {
		File src =new File("rc\\test\\resources\\Datasheet.xlsx");
		FileInputStream stream =new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(stream);
		XSSFSheet sh = wb.getSheet("Test2");
		DataFormatter data = new DataFormatter();
		for (int i=0;i<=sh.getLastRowNum();i++)
		{
			
			{
				if(fieldName.equals(data.formatCellValue(sh.getRow(i).getCell(0))))
				{
					System.out.println(data.formatCellValue(sh.getRow(i).getCell(i)));
					break;
				}
			}
		}

	}

}
