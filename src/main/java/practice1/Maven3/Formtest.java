package practice1.Maven3;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Formtest {

	WebDriver driver ;
	
	@Test
	public void formApp() throws InterruptedException {
		Launch l= new Launch(driver);
		l.setup();
		this.driver =  Launch.driver ;
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		
		Form f =new Form(driver);
		f.firstName();
		f.lastName();
		f.maleBtn();
		
		f.apt();
		f.city();
		f.country();
		f.email();
		f.date("01/01/2023");
		f.mobile();
		f.course();
		f.query();
		f.verify();
		
		
	}
}
