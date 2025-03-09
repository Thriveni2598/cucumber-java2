package io.cucumber.cucumber_java2;

//import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pages.pagevalidation;
import utils.Commonnew;


import org.openqa.selenium.WebDriver;

public class StepDefinitions {
	
	static WebDriver driver;
	String browser = "chrome";
	String url = "https://www.amazon.in";
	Commonnew common;

	@Before
	public void setup() {
		common = new Commonnew();
		common.setupBrowser(browser, url);
		driver = common.getDriverObject();
	}

//	@After
//	public void tearDown() {
//		common.quitBrowser();
//	}

	public void compareResults(String expectedResult, String actualResult) {
		assert (actualResult.equals(expectedResult));
	}


	@Given("I am on the Amazon homepage")
	public void i_am_on_the_amazon_homepage() {
	    driver.navigate().to(url);
	}

	@When("I search for {string}")
	public void searchFor(String string) {
	 pagevalidation pageValid = new pagevalidation(driver);
	 pageValid.searchProduct(string);

	}

	@Then("I should see the list of search result")
	public void searchResultList() {
		
	   
	}

	@When("I select the first serach result")
	public void search_result() {
		pagevalidation pageValid = new pagevalidation(driver);
		 pageValid.selectProduct();
	   
	}

	@Then("I should see the product details page")
	public void i_should_see_the_product_details_page() {
		pagevalidation pageValid = new pagevalidation(driver);
		 pageValid.switchWindow();
	}


}
