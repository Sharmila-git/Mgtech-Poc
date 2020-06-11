package testing;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dynamic {
	@Test
	public void f(){
	  System.setProperty("webdriver.chrome.driver", "D:\\DubaiPoC\\Eclipse_mars\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	
	  driver.get("http://demo.guru99.com/test/web-table-element.php");         
      //No.of Columns
      List  col = driver.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
      System.out.println("No of cols are : " +col.size()); 
      //No.of rows 
      List  rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]")); 
      System.out.println("No of rows are : " + rows.size());
      String Value= driver.findElement(By.xpath("(//tr//td//font)[4]")).getText();
      System.out.println(Value);
    //To locate table.
  	WebElement mytable = driver.findElement(By.xpath("//html//body//table//tbody"));
  	//To locate rows of table. 
  	List < WebElement > rows_table = mytable.findElements(By.tagName("tr"));
  	//To calculate no of rows In table.
  	int rows_count = rows_table.size();
  	//Loop will execute till the last row of table.
  	for (int row = 0; row < rows_count; row++) {
  	    //To locate columns(cells) of that specific row.
  	    List < WebElement > Columns_row = rows_table.get(row).findElements(By.tagName("td"));
  	    //To calculate no of columns (cells). In that specific row.
  	    int columns_count = Columns_row.size();
  	    System.out.println("Number of cells In Row " + row + " are " + columns_count);
  	    //Loop will execute till the last cell of that specific row.
  	    for (int column = 0; column < columns_count; column++) {
  	        // To retrieve text from that specific cell.
  	        String celtext = Columns_row.get(column).getText();
  	        System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext);
  	    }
  	    System.out.println("-------------------------------------------------- ");
  	}
//      driver.close();
  	}


}
