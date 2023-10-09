package practice1.Maven3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import comut.Mylisten;
@Listeners(Mylisten.class)
public class Drag extends Base {
	public WebDriver driver ;
	public WebDriverWait wait ;
	
	@Test
	public void drop() {
		setup("chrome");
		this.driver= Base.driver;
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     WebElement iframe =  driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		  driver.switchTo().frame(iframe);
		 WebElement we = driver.findElement(By.xpath("//img[@src='images/high_tatras_min.jpg']"));
		WebElement us =driver.findElement(By.xpath("//div[@id='trash']"));
		Actions act = new Actions(driver);
		act.doubleClick().dragAndDrop(we, us).build().perform();
		
		
		
	   	}

	@Test
	public void tooltip() {
		setup("chrome");
		this.driver= Base.driver;
		driver.get("https://www.globalsqa.com/demo-site/tooltip/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement iframe2 =driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe2);
	WebElement we =	driver.findElement(By.xpath("//img[@src='images/st-stephens.jpg']"));
		Actions act = new Actions(driver);
		act.moveToElement(we).build().perform();
		Assert.assertEquals(true, true);
		
		
		
	}
	
}
