package usecases;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;


public class Imagecomparision {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\DubaiPoC\\Eclipse_mars\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/");		
		driver.manage().window().maximize();
		takescreenshot("logo");
	}

	public static void takescreenshot(String filename) throws IOException{
		
		WebElement logoImage= driver.findElement(By.id("logo"));
		File file= ((TakesScreenshot)logoImage).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("D:\\DubaiPoC\\Eclipse_mars\\Mars-workspace\\Trail\\Images" + filename + ".jpg"));
//		Screenshot screenshot=new AShot().takeScreenshot(driver, logoImage);
//		ImageIO.write(screenshot.getImage(), "jpg", new File(System.getProperty("user.dir")+"/Trail/Images/logoimg.jpg"));
//		Thread.sleep(2000);
		driver.close();

	}

}
