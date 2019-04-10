package Test3;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewTest3 {
  @Test
  public void f() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_b3a.00.39\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://www.cleartrip.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  WebElement from = driver.findElement(By.id("FromTag"));
	  Actions act1 =new Actions(driver);
	  Thread.sleep(2000);
	  act1.sendKeys("Bangalore").click().perform();
  }
}
