package practice1.Maven3;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Launchtest {
	
	WebDriver driver ;
	@Test
	public void search() {
		
		Launch l = new Launch(driver) ;
		l.setup();
		this.driver = Launch.driver ;
		driver.get("https://www.google.com");
		
	}

}
