package POM_Model;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

public class Flights {

	
	@FindBy(xpath = "//input[@id = 'fromCity']")
	public static WebElement From_Search;
	
	@FindBy(xpath = "//input[@id = 'toCity']")
	public static WebElement tocity_search;	
	
	@FindBy(xpath="//*[@class='menu_Flights']")
	public static WebElement Menu_Fights;
	
	@FindBy(xpath="//*[@class='landingSprite myIconWhite']")
	public static WebElement loginPage;
	
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@class='react-autosuggest__suggestions-list']/li//p"))
	public static List<WebElement> lists;
	
	@FindBy(xpath="//*[@class='react-autosuggest__input react-autosuggest__input--open']")
	public static WebElement from;
	
	@FindBy(xpath="//*[@class='langCardClose']")
	public static WebElement closeButton;
	
}
