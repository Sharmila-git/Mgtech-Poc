package junitdemo;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitrail {
	    private File output; 
	    @BeforeMethod
		public void createOutputFile() 
	    { 
	       output = new File("test");
	    }
	  
		@AfterMethod
		public void deleteOutputFile() 
	    {
	        //output.delete();
			output.getPath();
	    } 
	     
	    @Test public void testFile1() 
	    {
	       // code for test case objective
	    System.setProperty("webdriver.chrome.driver", "D:\\DubaiPoC\\Eclipse_mars\\chromedriver_win32\\chromedriver.exe");
	  	WebDriver driver = new ChromeDriver();
	  	driver.get("https://www.marshallspetzone.com/");
	  	driver.manage().window().maximize();
	  	driver.close();
	    } 
		@Test public void testFile2() 
	    {
	       // code for test case objective
		String str= "JUnit is working fine";					
		assertEquals("JUnit is working fine",str);	
		System.out.print(str);
	    }
		
	}
