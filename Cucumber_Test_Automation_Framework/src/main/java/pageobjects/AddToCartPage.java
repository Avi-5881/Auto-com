package pageobjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartPage {
	
	WebDriver driver;
	String baseUrl;
	private String child_window;
	private String parent ;
	

	@FindBy(xpath = "//button[text()='ADD TO CART']")
	private WebElement addToCart;
	

	public AddToCartPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void addTocart(){
		String parent = driver.getWindowHandle(); 
		Set<String>s=driver.getWindowHandles();
		  
		  Iterator<String> I1= s.iterator();

		  while(I1.hasNext())
		  {

		  child_window = I1.next();
		
		if(!parent.equals(child_window))
		  {
		  driver.switchTo().window(child_window);

		  System.out.println(driver.switchTo().window(child_window).getTitle());
		  WebDriverWait wait=new WebDriverWait(driver, 20);
		//  WebElement AddtoCart = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww'][text()='ADD TO CART']"));
		  Actions action=new Actions(driver);
		  action.moveToElement(addToCart).build().perform();
		  wait.until(ExpectedConditions.elementToBeClickable(addToCart)).click();
		  }
		  }
		  System.out.println("Hp Laptop successfully add into cart");
	}
}
