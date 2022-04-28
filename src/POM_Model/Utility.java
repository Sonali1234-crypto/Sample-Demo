package POM_Model;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Utility extends TestBase {
	
	
	
	
	public void Launch_Browser() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSoftwares\\New folder\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/flights/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	public void SearchFromTo_to() {
		
		
		
		PageFactory.initElements(driver, Flights.class);
		
		Actions a=new Actions(driver);
		
		a.moveToElement(Flights.loginPage).click().build().perform();
		
		Flights.Menu_Fights.click();
		
		Flights.From_Search.click();
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Flights.from.sendKeys("A");
		
		searchFormCity("Pune, India");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Flights.closeButton.click();
		searchFormCity("Goa, India");
	}
	
	public void select_date() {
		
		dataSelect("May 2022","29");
		Flights.clickSearch.click();
		//Flights.close.click();
	}
	
	public void bookNow() {
		Flights.ViewPrices.click();
		Flights.bookNow.click();
		windowHandle();
		String Actualtext=explicitwait(Flights.bookingcomplete);
		if(Actualtext.contains("Complete your booking")) {
			
			Assert.assertEquals(Actualtext, "Complete your booking");
		}else {
			
			Assert.fail("there is no window opened to book the ticket");
		}
	}
	
	public void continueFor() {
		
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",Flights.continueButton);
		if(Flights.continueButton.isDisplayed()) {
			Assert.assertTrue(true);
			System.out.println("enter mobile Number");
			Flights.mobileNo.sendKeys("8105326640");
			Flights.Email.sendKeys("sonalisargam114@gmail.com");
//			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",Flights.continueButton);
//			Flights.continueButton.click();
		}
	}
	
	

}
