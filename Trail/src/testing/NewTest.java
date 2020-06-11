package testing;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
//import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.Screenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver.Window;
//import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
//import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.apache.commons.io.FileUtils;

public class NewTest {
  @Test
  public void f()  {
	  //String PetName = "Pawzone Anti-Slip Spliced Flooring For Pets";
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  JavascriptExecutor js = (JavascriptExecutor) driver;  
	  driver.get("https://www.marshallspetzone.com/");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//*[@id=\"iqitmegamenu-horizontal\"]//li[@id=\"cbp-hrmenu-tab-13\"]")).click();
	  driver.findElement(By.xpath("//*[@class=\"custom-checkbox\"]//input[@data-search-url=\"https://www.marshallspetzone.com/14-Cat?q=Categories-Accessories\"]")).click();
	//  Thread.sleep(3000);
	  js.executeScript("window.scrollBy(0,500)");
	  driver.findElement(By.xpath("//*[@id='js-product-list-top']/div/div[3]/div[1]")).click();
	//  Thread.sleep(10000);
	  driver.findElement(By.xpath("//a[contains(text(),'low to high')]")).click();
	//  Thread.sleep(10000);
	  driver.findElement(By.xpath("//i[@class='fa fa-th-list']")).click();
	  //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//  Thread.sleep(10000);
	  Screenshot screenshot = new AShot().takeScreenshot(driver);
	  String currentDirectory = System.getProperty("user.dir");
//	  ImageIO.write(screenshot.getImage(), "jpg", new File(currentDirectory + "\\fullimage.jpg")); 
	//  Thread.sleep(1000);
	  js.executeScript("window.scrollBy(0,-500)");
	 //js.executeScript("arguments[0].scrollIntoView();", Element); 
	//  Thread.sleep(20000);
	  driver.findElement(By.id("header-search-btn")).click();
	//  Thread.sleep(5000);
	  driver.close();
  }

}
