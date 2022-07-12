package com.magnifyb.stepdefinition;

import java.awt.Choice;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.google.gson.annotations.Until;
import com.magnifyb.objectrepository.LoginMyHeroPageObjects;
import com.magnifyb.objectrepository.MagnifyBObjects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class login extends MagnifyBObjects {

	public static WebDriver driver;

	@Given("user navigates to url")
	public void user_navigates_to_url() {

		WebDriverManager.chromedriver().driverVersion("103.0.5060.114").setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnify.machint.com/home");
	}

	@Given("user Click on login button")
	public void user_click_on_login_button() {
		WebElement loginbutton = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loginButton)));
		loginbutton.click();
	}

	@Then("user Validate login page")
	public void user_validate_login_page() {
		WebElement login = driver.findElement(By.xpath(loginText));
		String login_text = login.getText();
		Assert.assertEquals(login_text, "LOGIN");
	}

	@Then("user Enter email ID")
	public void user_enter_email_id() {
		WebElement email = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(emailIDTextField)));
		email.sendKeys("dev12345@gmail.com");
	}

	@Then("user Enter password")
	public void user_enter_password() {
		WebElement password = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(passwordTextField)));
		password.sendKeys("Machint@123");
	}

	@Then("user Click on sign in button")
	public void user_click_on_sign_in_button() throws Exception {
		WebElement signIn = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(signinButton)));
		signIn.click();

		Thread.sleep(8000);
	}

	@Then("Validate My Company Dashboard")
	public void validate_my_company_dashboard() {
		WebElement dashboard = driver.findElement(By.xpath(myCompanyDashboard));
		String dashboard_text = dashboard.getText();
		Assert.assertEquals(dashboard_text, "My Company Dashboard");
	}

	@Then("User Click on business areas")
	public void user_click_on_business_areas() {
		WebElement businessareas = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(businessAreas)));
		

//		Actions builder = new Actions(driver);
//		builder.moveToElement(businessareas);
	
		System.out.println("hi");
		businessareas.click();
//		builder.click(businessareas).build().perform();
		System.out.println("hiee");

	}

	@Then("User Click on Financial Management")
	public void user_click_on_financial_management() {
		WebElement financialmanagement = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(financialManagement)));
		financialmanagement.click();
	}

	@Then("user Click on Start Financial Management Questionnaire")
	public void user_click_on_start_financial_management_questionnaire() {

	}

	@Then("user Validate Management Information button")
	public void user_validate_management_information_button() {

	}
}
