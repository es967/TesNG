package sep9;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFile {

	public static void main(String[] args)throws Throwable {
	//read path of file 
		FileInputStream fi = new FileInputStream("D://Book.xlsx");
		// get wb from file
		  XSSFWorkbook wb = new XSSFWorkbook(fi);
		  //get ws from wb
		  XSSFSheet ws =wb.getSheetAt(0);
		  //get first anyrow from sheet
		  XSSFRow row =ws.getRow(5);
		  //count no of rows in sheet
		  int rc = ws.getLastRowNum();
		  System.out.println("No of rows are::"+rc);
		  // get first cell
		  XSSFCell c1 =row.getCell(1);
		  //get second cell
		  XSSFCell c2=row.getCell(0);
		  String user =c1.getStringCellValue();
		  String pass =c2.getStringCellValue();
		  System.out.println(pass);
         fi.close();
		  wb.close();
}
}
