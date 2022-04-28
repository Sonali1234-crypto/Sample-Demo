package POM_Model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestBase {
	
	public static WebDriver driver;
	public static void searchFormCity(String cityname) {
		
		List<WebElement> From_options=Flights.lists;
		
		for(WebElement element:From_options) {
			
			System.out.println(element.getText());
			if(element.getText().contains(cityname)) {
				
				
				   element.click();
				   break;
			}
		}
		
	}

}
