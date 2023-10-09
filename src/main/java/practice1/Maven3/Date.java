package practice1.Maven3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Date {
	
	WebDriver driver ;
	
	@Test
	public void check() {
		String d = "22";
		String m = "December";
		String y = "2023";
		
		Launch l = new Launch(driver);
		l.setup();
		this.driver = Launch.driver ;
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.findElement(By.tagName("input")).click();
		
		while(true) {
		
		WebElement we =driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
		  String month = we.getText();
		
		 WebElement us = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
		String year = us.getText();
		
		if(m.equals(month)&&y.equals(year)) {
			
			List<WebElement> li =driver.findElements(By.xpath("//tbody/tr/td/a"));
			for(WebElement s : li) {
				String day  =s.getText();
				if(d.equals(day)) {
					s.click();
					break ;
				}
			}
			 
			
			
			
			
			
		}
		else {
			driver.findElement(By.xpath("//a[@data-handler='next']")).click();
		}
			
		}
		
		
		
		
	}

}
