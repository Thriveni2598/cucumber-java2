package pages;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pagevalidation {
	
   private WebDriver driver;
   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
   
   @FindBy(name = "field-keywords")
   private WebElement srchbox;
   
   @FindBy(id = "nav-search-submit-button")
   private WebElement srchbtn;
   
   @FindBy(xpath = "(//span[text()=\"Apple iPhone 15 (128 GB) - Black\"])[1]")
   private WebElement product;
   
   
   public pagevalidation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
   
   public void searchProduct(String string) {
	   
	   srchbox.click();
	   srchbox.sendKeys("Apple iPhone");
	   srchbtn.click();
	   
   }
   public void selectProduct() {
	   product.click();
   }
   
   public void switchWindow() {
	   ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
	   driver.switchTo().window(tab.get(1));
	   System.out.println(driver.getCurrentUrl());
   }
   
   
}
