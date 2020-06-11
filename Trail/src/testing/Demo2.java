package testing;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo2 {
	@Test
	public void f() throws InterruptedException{
		
	  String Product = "Bentonite Cat Litter Apple Flavour";
	  System.setProperty("webdriver.chrome.driver", "D:\\DubaiPoC\\Eclipse_mars\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.marshallspetzone.com/");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//*[@id=\"iqitmegamenu-horizontal\"]//li[@id=\"cbp-hrmenu-tab-13\"]")).click();
	  driver.findElement(By.xpath("//*[@class=\"custom-checkbox\"]//input[@data-search-url=\"https://www.marshallspetzone.com/14-Cat?q=Categories-Accessories\"]")).click();
	  Thread.sleep(3000);
	  String Productname = driver.findElement(By.xpath("//*[@class=\"products row products-grid\"]//article[@data-id-product=\"7185\"]//h3//a")).getText();
      System.out.println(Productname);
  	  assertEquals(Productname,Product);
  	   
	}
}
      
	  
