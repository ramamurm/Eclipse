package Test2;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewTest2 {
  @Test
  public void testDragandDrop() 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_b3a.00.39\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx");
	  driver.manage().window().maximize();
	  WebElement from = driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceholder1_RadTreeView1']/ul/li/ul/li[3]/ul/li[1]/div/div"));
	  WebElement to = driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceholder1_Label1']"));
	  Actions act1 =new Actions(driver);
	  act1.dragAndDrop(from, to).perform();
	  
  }
}
