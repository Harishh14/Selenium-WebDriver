package Apache_poi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_ExcelFileData {

	public static void main(String[] args) throws IOException   {
		 
		//this is for writing the data into new excel file.
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\test data\\WriteData.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet();
		
		XSSFRow row0=sheet.createRow(0);
		row0.createCell(0).setCellValue("Welcome");
		row0.createCell(1).setCellValue("Harish");
		row0.createCell(2).setCellValue("In Java");
		row0.createCell(3).setCellValue("Selenium");
		row0.createCell(4).setCellValue("Course");
		
		XSSFRow row1=sheet.createRow(1);
		row1.createCell(0).setCellValue("Welcome");
		row1.createCell(1).setCellValue("Jayant");
		row1.createCell(2).setCellValue("In Java");
		row1.createCell(3).setCellValue("Selenium");
		row1.createCell(4).setCellValue("Course");
		
		XSSFRow row2=sheet.createRow(2);
		row2.createCell(0).setCellValue("Welcome");
		row2.createCell(1).setCellValue("Shivam");
		row2.createCell(2).setCellValue("In Java");
		row2.createCell(3).setCellValue("Selenium");
		row2.createCell(4).setCellValue("Course");
		
		XSSFRow row3=sheet.createRow(3);
		row3.createCell(0).setCellValue("Welcome");
		row3.createCell(1).setCellValue("Priya");
		row3.createCell(2).setCellValue("In Java");
		row3.createCell(3).setCellValue("Selenium");
		row3.createCell(4).setCellValue("Course");
		
		workbook.write(file);
		workbook.close();
		file.close();
	}

}
