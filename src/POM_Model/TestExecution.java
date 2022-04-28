package POM_Model;

import org.testng.annotations.Test;

public class TestExecution extends Utility {
	
	@Test(priority=0)
	public void verify_browser() {
		
		Launch_Browser();
	}
	
	@Test(priority=1)
	public void verify_Search() {
		
		SearchFromTo_to();
	}
	
	@Test(priority=2)
	public void verify_date() {
		
		select_date();
	}
	@Test(priority=3)
	public void verify_book() {
		
		bookNow();
	}
	@Test(priority=4)
	public void verify_continue() {
		
      continueFor();
	}

}
