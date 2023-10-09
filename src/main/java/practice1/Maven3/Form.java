package practice1.Maven3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Form {
	
 public WebDriver driver ;
 public Form(WebDriver driver) {
	 this.driver = Launch.driver ;
 }
 
  By firstname =  By.xpath("//input[@id='vfb-5']");
  By lastname =  By.xpath("//input[@id='vfb-7']");
  By malebutton = By.xpath("//input[@name='vfb-31']");
  By femalebutton = By.xpath("//input[@id='vfb-31-2']");
  By address = By.xpath("//input[@id='vfb-13-address']");
  By street = By.xpath("//input[@id='vfb-13-address-2']");
  By apt = By.xpath("//input[@id='vfb-13-city']");
  By city = By.xpath("//input[@id='vfb-13-zip']");
  By mail  = By.xpath("//input[@id='vfb-14']");
  By date = By.xpath("//input[@id='vfb-18']");
  By mobile = By.xpath("//input[@id='vfb-19']");
  By testng = By.xpath("//input[@id='vfb-20-2']");
  By query = By.xpath("//textarea[@name='vfb-23']");
  By verify = By.xpath("//input[@name='vfb-3']");
  By submit = By.xpath("//input[@type='submit']");
  By countrybtn = By.xpath("//span[@class='selection']");
  By tmhr = By.xpath("//span[@id='select2-vfb-16-hour-container']");
  By tmhm =  By.xpath("//span[@id='select2-vfb-16-min-container']");
  
  public void firstName() {
	  driver.findElement(firstname).sendKeys("abc");
  }
  
  public void lastName() {
	  driver.findElement(lastname).sendKeys("xyz");
  }
  
  public void maleBtn() {
	  driver.findElement(malebutton).click();
  }
  
  public void address() {
	  driver.findElement(address).sendKeys("#1111");
  }
  
  public void street() {
	  driver.findElement(street).sendKeys("pqr");
  }
  
  public void apt() {
	  driver.findElement(apt).sendKeys("qa");
  }
  
  public void city() {
	  driver.findElement(city).sendKeys("awesome");
  }
  
  public void country() {
	 
  }
  
  public void email() {
	  driver.findElement(mail).sendKeys("xyz@gmail.com");
  }
  
  public void date(String enter) {
	  driver.findElement(date).sendKeys(enter);
  }
  
  
  public void mobile() {
	  driver.findElement(mobile).sendKeys("00000000");
  }
  
  public void course() {
	  driver.findElement(testng).click();
  }
  
  public void query() {
	  driver.findElement(query).sendKeys("hello");
  }
  
  public void verify() {
	  driver.findElement(verify).sendKeys("11");
  }
  
  
  
  
}
