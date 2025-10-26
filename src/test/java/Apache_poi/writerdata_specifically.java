package Apache_poi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writerdata_specifically {

	public static void main(String[] args) throws IOException {

		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\test data\\SpecificData.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("specific");

		XSSFRow row = sheet.createRow(3);
		XSSFCell cell = row.createCell(3);
		cell.setCellValue("himanshu");
		
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("file is created....");

	}

}
