package Apache_poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_ExcelFileData {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\test data\\BookData.xlsx");
//this command is for reading the excel file's data.
		
//		workbook-sheet-row-cell
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		// count last row or total rows.
		int totalrow = sheet.getLastRowNum();

		// count total cells.
		int totalcells = sheet.getRow(0).getLastCellNum();

		System.out.println(totalrow);
		System.out.println(totalcells);

		// using for loop to read the data.
		// enhanced for loop doesn't work here because we are dealing with index

		for (int r = 0; r <= totalrow; r++) {

			XSSFRow row = sheet.getRow(r);
			for (int c = 0; c < totalcells; c++) {
				XSSFCell cell = row.getCell(c);
				System.out.print(cell.toString()+"\t");

			}
			System.out.println();
		}
		workbook.close();
		file.close();
	}

}
