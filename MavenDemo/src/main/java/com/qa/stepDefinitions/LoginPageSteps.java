package com.qa.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginPageSteps extends TestBase {

	
	
	public LoginPageSteps() throws Exception {
		super();
		
	}

	@Given("User launches given URL")
	public void user_launches_given_URL() {
	    
		TestBase.initialization();
	}

	@When("User enters all the details")
	public void user_enters_all_the_details() throws Exception {
	    
		
		
		driver.findElement(By.xpath(".//*[@id='application_type_single']")).click();
		Select oselect=new Select(driver.findElement(By.xpath(".//*[@title='Number of dependants']")));
		oselect.selectByIndex(0);
		driver.findElement(By.xpath(".//label[contains(text(),'Your income (before tax)')]/following-sibling::div/input")).sendKeys("80000");
		driver.findElement(By.xpath(".//label[contains(text(),'Your other income')]/following-sibling::div/input")).sendKeys("10000");
		driver.findElement(By.xpath(".//label[contains(text(),'Living expenses')]/following-sibling::div/input")).sendKeys("500");
		driver.findElement(By.xpath(".//label[contains(text(),'Current home loan repayments')]/following-sibling::div/input")).sendKeys("0");
		driver.findElement(By.xpath(".//label[contains(text(),'Other loan repayments')]/following-sibling::div/input")).sendKeys("100");
		driver.findElement(By.xpath(".//label[contains(text(),'Other commitments')]/following-sibling::div/input")).sendKeys("0");
		driver.findElement(By.xpath(".//label[contains(text(),'Total credit card limits')]/following-sibling::div/input")).sendKeys("10000");
		
		
	}

	

	@Then("User is displayed with valid message")
	public void user_is_displayed_with_valid_message() throws Exception {
	    

        Thread.sleep(10000);   
		String msg= driver.findElement(By.xpath(".//span[@id='borrowResultTextAmount']")).getText();
		System.out.println(msg);
		Assert.assertEquals("$507,000",msg);
		
	}

	@Then("user clicks on Start Over menu")
	public void user_clicks_on_Start_Over_menu() {
	    
		
		driver.findElement(By.xpath(".//*[@class='borrow__result text--white clearfix']/descendant::div[@class='box--right']/button/span")).click();
	}

	@Then("User enters details")
	public void user_enters_details() throws Exception {
	    
		driver.findElement(By.xpath(".//label[contains(text(),'Living expenses')]/following-sibling::div/input")).sendKeys("1");
		//Thread.sleep(10000);
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( ".//label[contains(text(),'Total credit card limits')]/following-sibling::div/input"))).sendKeys("0");
		//driver.findElement(By.xpath(".//label[contains(text(),'Total credit card limits')]/following-sibling::div/input")).sendKeys("0");
		driver.findElement(By.xpath(".//button[contains(text(),'Work out how much I could borrow')]")).click();
		
		
		
	}

	@Then("User clicks on workout button")
	public void user_clicks_on_workout_button() {
		driver.findElement(By.xpath(".//button[contains(text(),'Work out how much I could borrow')]")).click();
	}
	@Then("user validates the displayed message")
	public void user_validates_the_displayed_message() throws Exception {
	   
		Thread.sleep(10000);
		String nmsg=driver.findElement(By.xpath("//span[@class='borrow__error__text']")).getText();
		System.out.println(nmsg);
		Assert.assertEquals("Based on the details you've entered, we're unable to give you an estimate of your borrowing power with this calculator. For questions, call us on 1800 035 500.",nmsg);
		driver.quit();
	}
	
	


	
	
	
}
