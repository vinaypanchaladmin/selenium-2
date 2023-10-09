package practice1.Maven3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Launch {

	public static WebDriver driver ;
	public Launch(WebDriver driver) {
	   
	}
	
	public void setup () {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver-win64\\chromedriver.exe");
		     
		     ChromeOptions op = new  ChromeOptions();
		     op.addArguments("--remote-allow-origins=*");
		     op.setBinary("C:\\Users\\ASUS\\Downloads\\chrome-win64\\chrome.exe");
		     WebDriver driver = new  ChromeDriver(op);
		    driver.manage().window().maximize();
		    this.driver = driver ;
	}
}
