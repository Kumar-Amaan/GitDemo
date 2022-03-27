//package testCases;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//public class A {
//	public static void main(String[] args) throws FileNotFoundException, Exception {
//
////		File f = new File("D:\\TestData1.xlsx");
//
//		FileInputStream fs = new FileInputStream("./Excel/TestData1.xlsx");
//
////		Create Workbook class object
////		XSLX- Class name will start from XSSF and in case of XLS, Class name start by HSSF
//
////		XSSFWorkbook wk = new XSSFWorkbook(fs);
//		@SuppressWarnings("resource")
//		XSSFWorkbook wk = new XSSFWorkbook(fs);
//		XSSFSheet s1 = wk.getSheet("Sheet1");
//
//		XSSFRow r1 = s1.getRow(0);
//		XSSFCell c1 = r1.getCell(1);
//
//		System.out.println(c1.getStringCellValue());
//
//	}
//}
