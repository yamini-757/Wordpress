package cts.miniprjct.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
	public WebDriver driver;
	@BeforeMethod
	public void setup() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\yamini\\eclipse-workspace\\Sample-java-project\\src\\test\\resources\\Binaries\\chromedriver.exe");
	driver=new ChromeDriver();

	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();

	Reporter.log("---Application started----",true);
	}

	@AfterMethod
	public void teardown() {
	driver.quit();
	Reporter.log("Browser session End",true);
	}
}
