package test.java;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class allOperator_step {

	private WebDriver driver;
	private String baseUrl = "http://ata123456789123456789.appspot.com/";

	@Given("^I enter (\\d+) and (\\d+)$")
	public void i_enter_and(int arg1, int arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver = new FirefoxDriver();
		driver.get(baseUrl);
		
		driver.findElement(By.id("ID_nameField1")).clear();
		driver.findElement(By.id("ID_nameField1")).sendKeys(String.valueOf(arg1));
		driver.findElement(By.id("ID_nameField2")).clear();
		driver.findElement(By.id("ID_nameField2")).sendKeys(String.valueOf(arg2));
	}

	@Given("^I click the \"([^\"]*)\" button$")
	public void i_click_the_button(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		switch (arg1){
		case "Add":
			driver.findElement(By.id("gwt-uid-1")).click();
			break;		
		case "Mul":
			driver.findElement(By.id("gwt-uid-2")).click();
			break;	
		case "Sqr":
			driver.findElement(By.id("gwt-uid-3")).click();
			break;
		case "Comp":
			driver.findElement(By.id("gwt-uid-4")).click();
			break;
		case "SqrSub":
			driver.findElement(By.id("gwt-uid-5")).click();
			break;
		case "Euclid(+)":
			driver.findElement(By.id("gwt-uid-6")).click();
			break;
		case "Euclid(-)":
			driver.findElement(By.id("gwt-uid-7")).click();
			break;
		}
	}

	@When("^I click button calculate$")
	public void i_click_button_calculate() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("ID_calculator")).click();
	}

	@Then("^I see result as \"([^\"]*)\"$")
	public void i_see_result_as(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		String result = driver.findElement(By.id("ID_nameField3")).getAttribute("value");
		assertEquals(arg1,result);
	}
}
