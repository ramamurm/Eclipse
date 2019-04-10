package Test5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest3Test {
	WebDriver driver;
	@BeforeTest
	public void beforeTest()	
	{
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://demowebshop.tricentis.com/login");
	  driver.manage().window().maximize();
	}
	  @AfterTest
	  public void afterTest()
	  {
		  driver.close();
	  }
	  @Test(dataProvider ="dp1")
	  public void testValidatUsersDemoWebShop(String username,String password)
	  {
		  driver.findElement(By.id("Email")).sendKeys(username);
		  
	  }
	  @DataProvider(name="dp1")
	  public Object[][] provideData()
	  {
		  //to connect to excel & convert to object 2d array
		  return ReadExcel.testExtractDataExcel();
	  }
}
