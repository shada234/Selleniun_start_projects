package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class passwordTest {
	static WebDriver  browser;
	 
	 @Before
	  public void setup() {
	 
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\Shada\\OneDrive\\Pictures\\Desktop\\geckodriver-v0.35.0-win64\\geckodriver.exe");
	      browser = new FirefoxDriver();
	    browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	  String url="https://testpages.eviltester.com/styled/apps/7charval/simple7charvalidation.html";
	      browser.get(url);

	  }

	 @Test
	public void Tests1() {
	 
	 browser.findElement(By.name("characters")).sendKeys("shadana");

	 browser.findElement(By.name("validate")).click();
	 String result = browser.findElement(By.name("validation_message")).getAttribute("value");
	 String  Expected="Valid Value";
	 assertEquals(Expected,result);
	 }
	 @Test
	public void Tests2() {
	 
	 browser.findElement(By.name("characters")).sendKeys("sha");

	 browser.findElement(By.name("validate")).click();
	 String result = browser.findElement(By.name("validation_message")).getAttribute("value");
	 String  Expected="Invalid Value";
	 assertEquals(Expected,result);
	 }
}
