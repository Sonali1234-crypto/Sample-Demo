package POM_Model;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

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
	
	public static void dataSelect(String month,String date) {
	
		boolean flag=false;
		
		while(true)
		{
			Flights.nextMonth.click();
			String monthAndYear=Flights.month.getText();
			System.out.println(monthAndYear);
			if(monthAndYear.contains(month))
			{
			  List<WebElement> columns=driver.findElements(By.xpath("(//*[@class='DayPicker-Body'])[1]/div//p"));
			  
			  for(WebElement col:columns) {
				  
				  if(col.getText().contains(date)) {
					  
					  col.click();
					  flag=true;
					  break;
				  }
			  }
			  if(flag==true) {
				  break;
			  }
				
			}
		}
	}
    public void windowHandle() {
		
		String parent=driver.getWindowHandle();

		Set<String>s=driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{

		String child_window=I1.next();


		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);
			
			
		}
		}
	}	
	public String explicitwait(WebElement element) {
		
	 String text = null;
     WebDriverWait wait=new WebDriverWait(driver, 20);
     
     boolean flag=wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
     
     if(flag) {
    	 
    	 text= element.getText();
     }
     else {
    	 System.out.println("element is not found");
     }
     
     return text;
	}
		
		
	

}
