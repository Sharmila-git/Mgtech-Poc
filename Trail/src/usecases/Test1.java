package usecases;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.excel.utility.Xls_Reader;

public class Test1 {
	
			 public static void main(String[] args)  {
				Xls_Reader reader= new Xls_Reader("./src/com/excel/utility/Usecase1.xlsx");
				String sheetName= "ExampleData";  
				String xdata = reader.getCellData(sheetName, 1, 2);
				System.out.println(xdata);				 
				// reader.addSheet("Testing");
				System.setProperty("webdriver.chrome.driver", "D:\\DubaiPoC\\Eclipse_mars\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.marshallspetzone.com/");
				driver.manage().window().maximize();
		  String Product = "Bentonite Cat Litter Apple Flavour";
		  driver.findElement(By.xpath("//*[@id=\"iqitmegamenu-horizontal\"]//li[@id=\"cbp-hrmenu-tab-13\"]")).click();
		  driver.findElement(By.xpath("//*[@class=\"custom-checkbox\"]//input[@data-search-url=\"https://www.marshallspetzone.com/14-Cat?q=Categories-Accessories\"]")).click();
	
		  //String Productname= driver.findElement(By.xpath("//*[@class=\"products row products-grid\"]//article[@data-id-product=\"7185\"]//h3//a")).getText();
		  String Productname= driver.findElement(By.xpath(xdata)).getText();
		  System.out.println(Productname);
	  	  assertEquals(Productname,Product);
	}
}

