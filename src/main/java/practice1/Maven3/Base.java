package practice1.Maven3;

import java.io.File;

import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;

public class Base {
	
	public static WebDriver driver ;
	
	
	@Parameters("browser")
	public void setup(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver-win64\\chromedriver.exe");
		     
		     ChromeOptions op = new  ChromeOptions();
		     op.addArguments("--remote-allow-origins=*");
		     op.setBinary("C:\\Users\\ASUS\\Downloads\\chrome-win64\\chrome.exe");
		     WebDriver driver = new  ChromeDriver(op);
		    driver.manage().window().maximize();
		    this.driver = driver ;
	}
	}
	public void shot(String methodname) throws IOException {
		String path = System.getProperty("user.dir")+"\\screenshots\\"+methodname+".jpg";
		File f = ((TakesScreenshot)Base.driver).getScreenshotAs(OutputType.FILE);
		File d = new File(path);
		FileUtils.copyFile(f, d);
	}
	
	

}
