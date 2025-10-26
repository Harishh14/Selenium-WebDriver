package Apache_poi;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDynamicData {

	public static void main(String[] args) throws IOException {

		FileOutputStream file = new FileOutputStream(
				System.getProperty("user.dir") + "\\test data\\DynamicWriteData.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("dynamicdata");

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many rows?");
		int noOfrows = sc.nextInt();

		System.out.println("Enter how many rows?");
		int noOfcells = sc.nextInt();

		for (int r = 0; r <= noOfrows; r++) {

			XSSFRow row = sheet.createRow(r);
			for (int c = 0; c < noOfcells; c++) {
				XSSFCell cell = row.createCell(c);
				cell.setCellValue(sc.next());
			}
		}
		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("file is created......");

	}

}
