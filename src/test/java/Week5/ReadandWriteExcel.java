package Week5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadandWriteExcel {
	
	static WebDriver driver ;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//getCellValues();
		//getExcel();
		setExcel();
	}
	
	public static void getCellValues() throws IOException
	{
		
		 
		  // Specify the path of file
		  File src=new File("./Resource/Read_Write.xlsx");
		 
		   // load file
		   FileInputStream fis=new FileInputStream(src);
		 
		   // Load workbook
		   XSSFWorkbook wb=new XSSFWorkbook(fis);
		   
		   // Load sheet- Here we are loading first sheetonly
		   XSSFSheet sh1= wb.getSheetAt(0);
		   
		   //Total number of Rows
		   int Row = sh1.getLastRowNum();
		   System.out.println("totalNoOfRowss--"+Row); 
		 
		   
		   
		   //column count 
		   int Column = sh1.getLastRowNum();
		   System.out.println("Total Number of C in the excel is : "+Column);
		   
		   System.out.println("Value1-->"+sh1.getRow(0).getCell(0).getStringCellValue());
		   System.out.println("Value2-->"+sh1.getRow(1).getCell(0).getStringCellValue());
		   //System.out.println("Values-->"+sh1.getRow(0).getCell(1).getStringCellValue());
		   //System.out.println("Values-->"+sh1.getRow(0).getCell(2).getStringCellValue());
		   
//		   for()
//		   {
//			   for()
//			   {
//				   
//			   }
//		   }
	}
	
	
	public static void getExcel()
	{
		try {
			 String exePath = "./Resource/chromedriver.exe";
			  System.setProperty("webdriver.chrome.driver", exePath);				
			  driver = new ChromeDriver();
			  
			  driver.get("https://opensource-demo.orangehrmlive.com/");
			 
			 
			  // Specify the path of file
			  File src=new File("./Resources/Read_Write.xlsx");
			 
			   // load file
			   FileInputStream fis=new FileInputStream(src);
			 
			   // Load workbook
			   XSSFWorkbook wb=new XSSFWorkbook(fis);
			   
			   // Load sheet- Here we are loading first sheetonly
			   XSSFSheet sh1= wb.getSheetAt(0);			   
			   
			   		   			   
			  //Total number of Rows
			   int Row = sh1.getLastRowNum();
			   System.out.println("totalNoOfRowss--"+Row);
			   
			   //Total number of Column
			   XSSFRow Row_Excel = sh1.getRow(0);
			   int Column = Row_Excel.getLastCellNum();
			   System.out.println("Total Number of C in the excel is : "+Column);
			    
			    for(int p=0;p<=Row;p++)
			    {
			    	//for(int j=0;j<Column;j++)
			    	{
			    		 //System.out.println("**Values inside loop---**"+"p-->"+p+"+j--->"+j+"--"+sh1.getRow(p).getCell(j).getStringCellValue());
			    		 String str_ScenarioName;
			    		 
			    		 //
			    		 str_ScenarioName = sh1.getRow(p).getCell(0).getStringCellValue();
			    		 
			    		    System.out.println("*Debug0*"+str_ScenarioName);
							if(str_ScenarioName.contentEquals("Login"))
							{
								System.out.println("*Debug1*"+str_ScenarioName);
								 driver.findElement(By.cssSelector("[name='txtUsername']")).sendKeys(sh1.getRow(1).getCell(1).getStringCellValue());
								  //Make independent of Locator								 
								 driver.findElement(By.cssSelector("[name='txtPassword']")).sendKeys(sh1.getRow(1).getCell(2).getStringCellValue());
								 driver.findElement(By.cssSelector("[id='btnLogin']")).click();
								
							} else if(str_ScenarioName.contentEquals("Landingpagevalidation"))
							{
								System.out.println("*Debug3*"+str_ScenarioName);
							}

			    	}
			    }	
			 
			  } catch (Exception e) {
			 
			   System.out.println(e.getMessage());
			 
			  }
	}
	public static void setExcel()
	{
		try {
			 
			  // Specify the file path which you want to create or write
			 
			  File src=new File("./Resources/Read_Write.xlsx");
			 
			  // Load the file
			 
			  FileInputStream fis=new FileInputStream(src);
			 
			   // load the workbook
			 
			   XSSFWorkbook wb=new XSSFWorkbook(fis);
			 
			  // get the sheet which you want to modify or create
			 
			   XSSFSheet sh1= wb.getSheetAt(1);
			 
			 // getRow specify which row we want to read and getCell which column
			 
//			 System.out.println("---1"+sh1.getRow(0).getCell(0).getStringCellValue());
//			 
//			 System.out.println("---2"+sh1.getRow(0).getCell(1).getStringCellValue());
//			 
//			 System.out.println("---3"+sh1.getRow(1).getCell(0).getStringCellValue());
//			 
//			 System.out.println("---4"+sh1.getRow(1).getCell(1).getStringCellValue());
//			 
//			 System.out.println("---5"+sh1.getRow(2).getCell(0).getStringCellValue());
//			 
//			 System.out.println("---6"+sh1.getRow(2).getCell(1).getStringCellValue());
			 
			// here createCell will create column
			 
			// and setCellvalue will set the value
			 
//			 sh1.getRow(0).createCell(2).setCellValue("Melbourne");
//			   for(int p=0;p<=Row;p++)
//			    {
//			    	//for(int j=0;j<Column;j++)
//			    	{
//			    		 //System.out.println("**Values inside loop---**"+"p-->"+p+"+j--->"+j+"--"+sh1.getRow(p).getCell(j).getStringCellValue());
//			    		 String str_ScenarioName;
//			    		 
//			    		 //
//			    		 str_ScenarioName = sh1.getRow(p).getCell(0).getStringCellValue();
//			    		 
//			    		    System.out.println("*Debug0*"+str_ScenarioName);
//							if(str_ScenarioName.contentEquals("Login"))
//							{
//								sh1.getRow(1).createCell(2).setCellValue("Texas");
//								
//							} else if(str_ScenarioName.contentEquals("Landingpagevalidation"))
//							{
//								System.out.println("*Debug3*"+str_ScenarioName);
//							}
//
//			    	}
//			 
//			 sh1.getRow(1).createCell(2).setCellValue("Texas");
//			 
//			 sh1.getRow(2).createCell(2).setCellValue("Frankfurt");
			 
			 
			// here we need to specify where you want to save file
			 
			 FileOutputStream fout=new FileOutputStream(new File("./Resources/Read_Write.xlsx"));
			 
			 
			// finally write content 
			 
			 wb.write(fout);
			 
			// close the file
			 
			 fout.close();
			 
			  } catch (Exception e) {
			 
			   System.out.println(e.getMessage());
			 
			  }
	}

}
