package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

	WebDriver driver;
	@FindBy(xpath = "//*[@id='twotabsearchtextbox']")
	private WebElement searchfield;
	
	@FindBy(xpath = "//*[@id='nav-search-submit-button']")
	private WebElement searchbutton;
	
	
	public SearchPage(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void searchProduct(String text)
	{
		searchfield.sendKeys(text);
	
		
	}
	
	public void clickOnSearch()
	{
		searchbutton.click();
	}
	
}
