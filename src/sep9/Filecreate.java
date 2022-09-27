package sep9;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Filecreate {

	public static void main(String[] args)throws Throwable {
	//read path of Excel
		FileInputStream fi = new FileInputStream("D://Book.xlsx");
  // get work book from file
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		// get sheet from wb
		XSSFSheet ws = wb.getSheet("Admin");
		//get first row from sheet
		XSSFRow row = ws.getRow(0);
		// count no of cells in first row
		int cc = row.getLastCellNum();
	System.out.println("no of rows are::"+    "no of cell are::"+cc);
	System.out.println(" no of cells are::"+  "no of rows are::"+cc);
	fi.close();
	wb.close();
	}

}
