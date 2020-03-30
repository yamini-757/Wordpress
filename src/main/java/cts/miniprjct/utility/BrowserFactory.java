package cts.miniprjct.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	public WebDriver driver;
	public WebDriver startBrowser(String browserName,String url) {
	if(browserName.equalsIgnoreCase("chrome")) {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\yamini\\eclipse-workspace\\Sample-java-project\\src\\test\\resources\\Binaries\\chromedriver.exe");
	driver=new ChromeDriver();
	}
	else if(browserName.equalsIgnoreCase("firefox")){
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\yamini\\eclipse-workspace\\Sample-java-project\\src\\test\\resources\\Binaries\\geckodriver.exe");
	driver=new FirefoxDriver();
	}

	driver.manage().window().maximize();
	driver.get(url);
	return driver;
	}

}
