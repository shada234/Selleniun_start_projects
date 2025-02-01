package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class triangleTest {
	static WebDriver  browser;
	 
	 @Before
	  public void setup() {
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\Shada\\OneDrive\\Pictures\\Desktop\\geckodriver-v0.35.0-win64\\geckodriver.exe");
		  browser = new FirefoxDriver();
		  	  browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			  String 	  url="https://testpages.eviltester.com/styled/apps/triangle/triangle001.html";	
		  browser.get(url);
		
	 }
	 @Test
	 public void Tests1() {
	 browser.findElement(By.id("side1")).sendKeys("10");
	 browser.findElement(By.id("side2")).sendKeys("3");
	 browser.findElement(By.id("side3")).sendKeys("2");
	 try {
	   Thread.sleep(1000);
	 } catch (InterruptedException e) {
	   Thread.currentThread().interrupt();
	 }

	 browser.findElement(By.id("identify-triangle-action")).click();
	 String result= browser.findElement(By.id("triangle-type")).getText();
	 System.out.println(result);
	 String Expected="Error: Not a Triangle";
	 assertEquals(Expected,result);
	 }
	 @Test
	 public void Tests2() {
	 browser.findElement(By.id("side1")).sendKeys("5");
	 browser.findElement(By.id("side2")).sendKeys("22");
	 browser.findElement(By.id("side3")).sendKeys("15");
	 try {
	   Thread.sleep(1000);
	 } catch (InterruptedException e) {
	   Thread.currentThread().interrupt();
	 }

	 browser.findElement(By.id("identify-triangle-action")).click();
	 String result= browser.findElement(By.id("triangle-type")).getText();
	 System.out.println(result);
	 String Expected="Error: Not a Triangle";
	 assertEquals(Expected,result);
	 }
	 @Test
	 public void Tests3() {
	 browser.findElement(By.id("side1")).sendKeys("4");
	 browser.findElement(By.id("side2")).sendKeys("6");
	 browser.findElement(By.id("side3")).sendKeys("12");
	 try {
	   Thread.sleep(1000);
	 } catch (InterruptedException e) {
	   Thread.currentThread().interrupt();
	 }

	 browser.findElement(By.id("identify-triangle-action")).click();
	 String result= browser.findElement(By.id("triangle-type")).getText();
	 System.out.println(result);
	 String Expected="Error: Not a Triangle";
	 assertEquals(Expected,result);
	 }
	 
	 @Test
	 public void Tests4() {
	 browser.findElement(By.id("side1")).sendKeys("6");
	 browser.findElement(By.id("side2")).sendKeys("6");
	 browser.findElement(By.id("side3")).sendKeys("6");
	 try {
	   Thread.sleep(1000);
	 } catch (InterruptedException e) {
	   Thread.currentThread().interrupt();
	 }

	 browser.findElement(By.id("identify-triangle-action")).click();
	 String result= browser.findElement(By.id("triangle-type")).getText();
	 System.out.println(result);
	 String Expected= "Equilateral";
	 assertEquals(Expected,result);
	 }
	 @Test
	 public void Tests5() {
	 browser.findElement(By.id("side1")).sendKeys("10");
	 browser.findElement(By.id("side2")).sendKeys("10");
	 browser.findElement(By.id("side3")).sendKeys("8");
	 try {
	   Thread.sleep(1000);
	 } catch (InterruptedException e) {
	   Thread.currentThread().interrupt();
	 }

	 browser.findElement(By.id("identify-triangle-action")).click();
	 String result= browser.findElement(By.id("triangle-type")).getText();
	 System.out.println(result);
	 String Expected="Isosceles";
	 assertEquals(Expected,result);
	 }
	 
	 @Test
	 public void Tests6() {
	 browser.findElement(By.id("side1")).sendKeys("10");
	 browser.findElement(By.id("side2")).sendKeys("7");
	 browser.findElement(By.id("side3")).sendKeys("10");
	 try {
	   Thread.sleep(1000);
	 } catch (InterruptedException e) {
	   Thread.currentThread().interrupt();
	 }

	 browser.findElement(By.id("identify-triangle-action")).click();
	 String result= browser.findElement(By.id("triangle-type")).getText();
	 System.out.println(result);
	 String Expected="Isosceles";
	 assertEquals(Expected,result);
	 }
	 @Test
	 public void Tests7() {
	 browser.findElement(By.id("side1")).sendKeys("10");
	 browser.findElement(By.id("side2")).sendKeys("12");
	 browser.findElement(By.id("side3")).sendKeys("12");
	 try {
	   Thread.sleep(1000);
	 } catch (InterruptedException e) {
	   Thread.currentThread().interrupt();
	 }

	 browser.findElement(By.id("identify-triangle-action")).click();
	 String result= browser.findElement(By.id("triangle-type")).getText();
	 System.out.println(result);
	 String Expected="Isosceles";
	 assertEquals(Expected,result);
	 }
	 @Test
	 public void Tests8() {
	 browser.findElement(By.id("side1")).sendKeys("14");
	 browser.findElement(By.id("side2")).sendKeys("12");
	 browser.findElement(By.id("side3")).sendKeys("10");
	 try {
	   Thread.sleep(1000);
	 } catch (InterruptedException e) {
	   Thread.currentThread().interrupt();
	 }

	 browser.findElement(By.id("identify-triangle-action")).click();
	 String result= browser.findElement(By.id("triangle-type")).getText();
	 System.out.println(result);
	 String Expected="Scalene";
	 assertEquals(Expected,result);
	 }
}

