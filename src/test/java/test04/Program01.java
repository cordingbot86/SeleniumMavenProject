package test04;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Program01 {
	public static void main(String[] args) throws Exception {
		getXpath("lastName");
		getXpath("firstName");
		getData("lastName");
		getData("firstName");
		
		}
	public static void getXpath(String fieldName) throws Exception {
		File src=new File(".\\src\\test\\resources\\DataSheet.xlsx");
		FileInputStream stream = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(stream);
		XSSFSheet sh = wb.getSheet("demo");
		DataFormatter data = new DataFormatter();
		for(int i=1;i<sh.getLastRowNum();i++)
		{
			if(fieldName.equals(data.formatCellValue(sh.getRow(i).getCell(0))))
			{
				System.out.println(data.formatCellValue(sh.getRow(i).getCell(1)));
				break;
			}
		}
			
		}
		public static void getData(String fieldName) throws Exception {
			File src=new File(".\\src\\test\\resources\\DataSheet.xlsx");
			FileInputStream stream = new FileInputStream(src);
			XSSFWorkbook wb = new XSSFWorkbook(stream);
		
			XSSFSheet sh = wb.getSheet("demo");
			DataFormatter data = new DataFormatter();
			for(int i=1;i<sh.getLastRowNum();i++)
			{
				if(fieldName.equals(data.formatCellValue(sh.getRow(i).getCell(0))))
					
				{
					System.out.println(data.formatCellValue(sh.getRow(i).getCell(2)));
					break;
				}
			}
		
	}

}
