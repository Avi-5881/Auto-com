package stepdefinition;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.AddToCartPage;
import pageobjects.CheckOutPage;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.ProductsPage;


public class Steps {
	public String parent;
	public String child_window;
	static WebDriver driver;
	TestContext testContext;
	HomePage homePage;
	ProductsPage productsPage;
	AddToCartPage addToCartPage;
	CheckOutPage checkOutPage;
	LoginPage loginPage;

	public Steps(TestContext context) {
		testContext = context;
		homePage = testContext.getPageObjectManager().getHomePage();
		productsPage = testContext.getPageObjectManager().getProductListingPage();
		addToCartPage = testContext.getPageObjectManager().getAddToCartPage();
		checkOutPage = testContext.getPageObjectManager().getCheckoutPage();
		loginPage = testContext.getPageObjectManager().getLoginPage();
		
	}
	
	@Given("^user is on Home Page$")
	public void userIsOnHomePage() throws InterruptedException{
		Thread.sleep(2000);
		homePage.navigateTo_HomePage();
	}
 
	@When("^he search for \"(.*)\"$")
	public void heSearchFor(String product) throws InterruptedException  {
		Thread.sleep(2000);
		homePage.enterProduct(product);
		homePage.clickOnSearchButton();
	}
 
	@When("^choose to buy the first item$")
	public void chooseToBuyTheFirstItem() throws InterruptedException {
		Thread.sleep(2000);
		productsPage.clickOnHeadFirstJava();		
	}
	
	@When("^Add product to shopping cart$")
	public void addsProductToShoppingCart() throws InterruptedException{
		Thread.sleep(2000);
		addToCartPage.addTocart();
		}


	@When("^Cliks on proceed to check out$")
	public void userClicksOnProceedCheckOut() throws InterruptedException{
		Thread.sleep(2000);
		checkOutPage.clickSoppingCart();
	}
	
	@Then("^User should be asked to login before checkout$")
	public void enterPersonalDetailsOnLoginPage() throws InterruptedException {
		Thread.sleep(2000);
		loginPage.loginToCheckOut();
		homePage.closeBrowser();
	}
	@When("^he submit username and password$")
	public void he_submit_username_and_password() throws InterruptedException {
		Thread.sleep(2000);
		loginPage.loginToCheckOut();
	}
}