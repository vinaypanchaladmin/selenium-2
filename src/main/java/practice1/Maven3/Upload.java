package practice1.Maven3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
@Listeners(comut.Mylisten.class)
public class Upload extends Base {
	
	public WebDriver driver ;
	
	@Test
	public void check() {
		setup("chrome");
		this.driver = Base.driver ;
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
  		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\ASUS\\Downloads\\New Text Document.txt");
  		driver.findElement(By.xpath("//input[@type='submit']")).click();
  		String actual =driver.findElement(By.tagName("p")).getText();
  		String expect = "You've uploaded a file. Your notes on the file were:";
  		Assert.assertEquals(actual, expect);
  	
	}

}
