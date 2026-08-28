package Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven_01 {

	public static void main(String[] args) throws IOException {
		FileInputStream file= new FileInputStream("F:\\Eclipse\\Url_Shortner_Testing\\TestDataExcel\\dataReading.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int totalRows = sheet.getLastRowNum();
		int totalCells = sheet.getRow(1).getLastCellNum();
		System.out.println("Total Number of Rows: "+ totalRows);
		System.out.println("Total Number of CellS: "+ totalCells);
		
		for(int r=0;r<=totalRows;r++) {
			
			XSSFRow Row = sheet.getRow(r);
			
			for(int c=0;c<totalCells;c++) {
				
				XSSFCell Cell= Row.getCell(c);
			 System.out.print(Cell.toString()+ "    \t");
			}
			System.out.println();
		}
workbook.close();
file.close();
	}

}
