package com.magnifyb.stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.magnifyb.objectrepository.LoginMyHeroPageObjects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginMyhero extends LoginMyHeroPageObjects {

	public static WebDriver driver;

	@Given("User navigates to url")
	public void user_navigates_to_url() {

		WebDriverManager.chromedriver().driverVersion("103.0.5060.114 ").setup();
		driver = new ChromeDriver();
		driver.get("https://appiandev.machint.com/suite/sites/vgro");
	}

	@When("User Enter username")
	public void user_enter_username() {

		WebElement un = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(username))));
		un.sendKeys("TEST_USER_AD");
	}

	@When("User Enter Password")
	public void user_enter_password() {
		WebElement pw = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(password))));
		pw.sendKeys("Machint@123");
	}

	@When("User Click on submit")
	public void user_click_on_submit() {
		WebElement loginButton = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(submit))));
		loginButton.click();
	}

	@Then("User Validate Home page")
	public void user_validate_home_page() {
		WebElement homeText = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(home))));
		String home_Text = homeText.getText();

		Assert.assertEquals(home_Text, "HOME");
	}

}
