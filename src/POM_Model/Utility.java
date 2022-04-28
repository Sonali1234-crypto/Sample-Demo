package POM_Model;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

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

}
