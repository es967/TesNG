package sep9;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CellData  {

	public static void main(String[] args) throws Throwable{
	FileInputStream fi = new FileInputStream("D://Book.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook(fi);
	XSSFSheet ws = wb.getSheet("Admin");
	int rc = ws.getLastRowNum();
	System.out.println("no of row are::"+rc);
	//read user name cell data
	String user = ws.getRow(2).getCell(0).getStringCellValue();
	String pass = ws.getRow(2).getCell(1).getStringCellValue();
	System.out.println(user+"       "+pass);
	fi.close();
	wb.close();
}

}
