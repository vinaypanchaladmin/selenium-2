package practice1.Maven3;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import comut.Mylisten;


public class Table {

	public WebDriver driver ;
	public WebDriverWait wait ;
   
	
	public void tabledata() {
		Launch l = new Launch(driver);
		l.setup();
		this.driver =Launch.driver ;
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		List<WebElement>we = driver.findElements(By.xpath("//tbody/tr"));
		int n =we.size() ;
		List<WebElement> us =driver.findElements(By.xpath("//tbody/tr[1]/td"));
		int m= us.size();
		
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
			WebElement p= 	driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[" + j + "]"));
			String t =p.getText();
			System.out.print(t);
			System.out.print(" || ");
				
			}
			System.out.println();
		}
		
		
		
	}
	
        
     public void brokenlink()  {
    	 
    	 Launch l = new Launch(driver);
 		l.setup();
 		this.driver =Launch.driver ;
 		driver.get("http://www.deadlinkcity.com/");
 		List<WebElement> we =driver.findElements(By.tagName("a"));
 		
 		try {
 		for(WebElement s : we) {
 			String ul =s.getAttribute("href");
 			
 			
 			URL url =  new URL(ul);
 			HttpURLConnection huc = (HttpURLConnection)url.openConnection();
 			huc.setRequestMethod("HEAD");
 		     huc.connect();
 		   int rescode =  huc.getResponseCode();
 		   
 		   if(rescode>400) {
 			   System.out.println("broken link :"+ ul);
 			   
 		   }
 		   else {
 			   System.out.println(ul);
 		   }
 		   
 		   
 		   
 		}
 		}
 		catch(Exception e) {
 			
 		}
		
		
	}
	
  @Test
    public void upload() {
    	 Launch l = new Launch(driver);
  		l.setup();
  		this.driver =Launch.driver ;
  		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
  		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\ASUS\\Downloads\\New Text Document.txt");
  		driver.findElement(By.xpath("//input[@type='submit']")).click();
  		String actual =driver.findElement(By.tagName("p")).getText();
  		String expect = "You've uploaded a file. Your notes on the file were:";
  		Assert.assertEquals(actual, expect);
  	
    }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
  }
