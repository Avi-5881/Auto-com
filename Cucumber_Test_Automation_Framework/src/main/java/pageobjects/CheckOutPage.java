package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//span[text()='Place Order']")
	private WebElement placeOrder;
	
//	@FindBy(xpath = "//input[@value='Proceed to checkout']")
	//private WebElement proceedCheckPOut;
	
	public CheckOutPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickSoppingCart(){
		placeOrder.click();
	}
	
	//public void clicksOnProceedCheckPOut(){
		//proceedCheckPOut.click();
	}
