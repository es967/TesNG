 package sep9;

import java.io.FileInputStream;

import javax.jws.soap.SOAPBinding.Style;

import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFFontFormatting;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class FontColor {

	private static XSSFCellStyle XSSFCellStyle;

	@SuppressWarnings("deprecation")
	public static void main(String[] args)throws Throwable {
	FileInputStream fi = new FileInputStream("D://Book.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook(fi);
	XSSFSheet ws = wb.getSheet("Admi");
	int rc = ws.getLastRowNum();
	System.out.println("no of rows are::"+rc);
	for (int i = 1; i <=rc;i++) {
	String username = ws.getRow(i).getCell(0).getStringCellValue();
	String password = ws.getRow(i).getCell(i).getStringCellValue();
	System.out.println(username+"     "+password);
	ws.getRow(i).createCell(2).setCellValue("pass");
	XSSFCellStyle =wb.createCellStyle();
	XSSFFont Font = wb.createFont();
	// color text
	Font.setColor(IndexedColors.DARK_GREEN.getIndex());
 
	

	
	

	}

}
