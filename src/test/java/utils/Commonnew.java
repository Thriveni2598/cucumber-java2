package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.Before;

public class Commonnew {
	private WebDriver driver;

	public void setupBrowser(String browser, String url) {
		if(browser.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if(browser.equalsIgnoreCase("edge"))
			driver = new EdgeDriver();
		else {
			System.out.println("valid browser is not provided, hence quitting the automation run");
			System.exit(0);
		}

		if(!url.isBlank())
			driver.get(url);
		else
			driver.get("about:blank");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public WebDriver getDriverObject() {
		return this.driver;
	}
	
	public void closeTab() {
		driver.close();
	}

	public void quitBrowser() {
		driver.quit();
	}

	
	
	
}

