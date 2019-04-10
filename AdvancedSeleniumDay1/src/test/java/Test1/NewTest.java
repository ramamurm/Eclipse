package Test1;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void Test1() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_b3a.00.39\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://www.hdfcbank.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  Actions act1 =new Actions(driver);
	  act1.moveToElement(driver.findElement(By.xpath("//a[text() ='Products'][1]"))).perform();
	  act1.moveToElement(driver.findElement(By.xpath("//a[@href ='/personal/products/cards'][1]"))).perform();
	  act1.moveToElement(driver.findElement(By.xpath("//a[@href ='/personal/products/cards/credit_cards']"))).click().perform();	  
  }
}
