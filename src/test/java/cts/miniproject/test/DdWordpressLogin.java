package cts.miniproject.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DdWordpressLogin {
	WebDriver driver;
	//we get data from @Dataprovider wordpress is the variable name
	@Test(dataProvider="wordpress")
  public void LoginToWordpress(String username,String password) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\yamini\\eclipse-workspace\\Sample-java-project\\src\\test\\resources\\Binaries\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.manage().window().maximize();
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
		Assert.assertEquals("http://demosite.center/wordpress/wp-admin/", driver.getCurrentUrl());
		System.out.println(driver.getCurrentUrl());
	}
	//This is executed after each method
		@AfterMethod
		public void tearDown()
		{
		driver.quit();
		}
		@DataProvider(name="wordpress")
		public Object[][] passData() {

		Object[][] data=new Object[3][2];

		data[0][0]="admin1";
		data[0][1]="demo1";

		data[1][0]="admin";
		data[1][1]="demo123";

		data[2][0]="admin2";
		data[2][1]="demo1234";

		return data;
		}
	
}
