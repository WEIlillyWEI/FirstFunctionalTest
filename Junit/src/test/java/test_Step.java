package test.java;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
//import originalCalculator.StackCalculator;
import newCalculator.StackCalculatorNew;
import static org.junit.Assert.*;


public class test_Step {
	
	double result;
	@Given("^I input two numbers \"([^\"]*)\"$")
	public void i_input_two_numbers(String arg1) throws Throwable {
		StackCalculatorNew stackCalculator = new StackCalculatorNew();
		result = stackCalculator.calculate(arg1);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^I get result \"([^\"]*)\"$")
	public void i_get_result(String arg1) throws Throwable {
		assertEquals(result,Double.valueOf(arg1),2);
		// Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

}
