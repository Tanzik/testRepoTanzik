package com.tt.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class hotels {
	@Given("^as a user i am in registration page$")
	public void as_a_user_i_am_in_registration_page() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "/home/mahbub/WebDrivers/chromedriver_linux64/chromedriver"); 
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.kayak.com/hotels");
	}

	@When("^i enter first name,last name,user id,password,and confirm password$")
	public void i_enter_first_name_last_name_user_id_password_and_confirm_password() throws Throwable {
	}

	@When("^i click on submit button$")
	public void i_click_on_submit_button() throws Throwable {

	}

	@Then("^i recieved a user registration confirmation$")
	public void i_recieved_a_user_registration_confirmation() throws Throwable {

	}
	
	
	
}
