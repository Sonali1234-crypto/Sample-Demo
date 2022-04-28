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

}
