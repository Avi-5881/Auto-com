package pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ProductsPage {
	
	WebDriver driver;
	
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/a[2]")
	private WebElement firsthp;
	
//	@FindBy(xpath = "//h2[@data-attribute='Head First Python: A Brain-Friendly Guide']")
//	private WebElement headFirstPython;

	
	public ProductsPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnHeadFirstJava(){
		firsthp.click();
	}
	
//	public void clickOnHeadFirstPython(){
//		headFirstPython.click();
//	}
}
