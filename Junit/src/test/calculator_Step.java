package test;

import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;
import org.openqa.selenium.*;

public class calculator_Step {
	
	private WebDriver driver;
	private String baseUrl = "http://ata123456789123456789.appspot.com/";
	
	@Given("^I input (\\d+)$")
	public void i_input(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = new FirefoxDriver();
		driver.get(baseUrl);
		driver.findElement(By.id("ID_nameField1")).clear();
		driver.findElement(By.id("ID_nameField1")).sendKeys(String.valueOf(arg1));
	    //throw new PendingException();
	}

	@Given("^I click square button$")
	public void i_click_square_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("gwt-uid-3")).click();
	    //throw new PendingException();
	}
	
	@Given("^I input (\\d+) and (\\d+)$")
	public void i_input_and(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = new FirefoxDriver();
		driver.get(baseUrl);
		driver.findElement(By.id("ID_nameField1")).clear();
		driver.findElement(By.id("ID_nameField1")).sendKeys(String.valueOf(arg1));
	    driver.findElement(By.id("ID_nameField2")).clear();
	    driver.findElement(By.id("ID_nameField2")).sendKeys(String.valueOf(arg2));
	    //throw new PendingException();
	}

	@Given("^I click multiply button$")
	public void i_click_multiply_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("gwt-uid-2")).click();    
	    //throw new PendingException();
	}

	@When("^I click calculate$")
	public void i_click_calculate() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("ID_calculator")).click();
	    //throw new PendingException();
	}

	@Then("^I get result (\\d+)$")
	public void i_get_result(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String result = driver.findElement(By.id("ID_nameField3")).getAttribute("value");
		assertEquals(arg1,Integer.parseInt(result));
	    //throw new PendingException();
	}

}
