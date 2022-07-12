package com.magnifyb.businessfunctions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.magnifyb.objectrepository.MagnifyBObjects;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MagnifybBusinessFunctions extends MagnifyBObjects {

	public static WebDriver driver;

	public static void navigateUrl() {
		WebDriverManager.chromedriver().driverVersion("103.0.5060.114").setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnify.machint.com/home");
	}

	public static void login() throws Exception {
		// Click on login button
		WebElement loginbutton = new WebDriverWait(driver, Duration.ofSeconds(60))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loginButton)));
		loginbutton.click();

		// Validate login page
		WebElement login = driver.findElement(By.xpath(loginText));
		String login_text = login.getText();
		Assert.assertEquals(login_text, "LOGIN");

		// Enter email ID
		WebElement email = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(emailIDTextField)));
		email.sendKeys("dev12345@gmail.com");

		// Enter password
		WebElement password = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(passwordTextField)));
		password.sendKeys("Machint@123");

		// Click on sign in button
		WebElement signIn = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(signinButton)));
		signIn.click();

		Thread.sleep(20000);

		// Validate My Company Dashboard
		WebElement dashboard = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(myCompanyDashboard)));
		String dashboard_text = dashboard.getText();
		Assert.assertEquals(dashboard_text, "My Company Dashboard");
	}

	public static void businessAreas() {
		// Click on business areas
		WebElement businessareas = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(businessAreas)));

		Actions action = new Actions(driver);
		action.moveToElement(businessareas);
		businessareas.click();

		// Click on Financial Management
		WebElement financialmanagement = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(financialManagement)));
		financialmanagement.click();

		// Click on Start Financial Management Questionnaire
		WebElement managementQuestionnaire = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(questionnaire)));
		managementQuestionnaire.click();

		// Validate Management Information button
		WebElement managementInformation = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(managementInfoButton)));
		String managementInformation_text = managementInformation.getText();
		Assert.assertEquals(managementInformation_text, "Management Information");
	}

	public static void managementInformation() throws Exception {

		// Validate Management Information
		WebElement managementinformation = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(managementInfo)));
		String managementInformation_Text = managementinformation.getText();
		Assert.assertEquals(managementInformation_Text, "Management Information");

		// Click on "Never" for How often do you prepare Management Accounts
		//1 = 1, 2 = 3, 3 = 7, 4 = 10
		WebElement mi_001 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(mi001)));
		mi_001.click();
		
		// Click on "Over 15% variance" for Do your Management Accounts' Profit figures
		// agree with those in your Year End Accounts?
		//5 = 1, 6 = 3, 7 = 7, 8 = 10
		WebElement mi_002 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(mi002)));
		mi_002.click();

		// Click on "Annually" for Do you prepare a Budget
		
		WebElement mi_003 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(mi003)));
		mi_003.click();

		// Click on "Annually" for Do you have Actuals compared to Budget with a
		// Variance
		WebElement mi_004 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(mi004)));
		mi_004.click();

		// Click on "Some products" for Do you have an accurate analysis of Gross margin
		// by product?
		WebElement mi_005 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(mi005)));
		mi_005.click();

		// Click on "Some Customers" for Do you have an accurate analysis of sales by
		// Customer?
		WebElement mi_006 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(mi006)));
		mi_006.click();

		// Click on "Some Customers" for Do you have an accurate analysis of gross
		// Margin by Customer?
		WebElement mi_007 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(mi007)));
		mi_007.click();

		// Click on Quarterly for How often do you review costs & look for savings?
		WebElement mi_008 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(mi008)));
		mi_008.click();

		// Click on next button
		WebElement next = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(nextButton)));
		next.click();

		// Validate Forecasting P&L and cash flow button
		WebElement foreCasting = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(forecastingButton)));
		String foreCasting_text = foreCasting.getText();
		Assert.assertEquals(foreCasting_text, "Forecasting P&L and cashflow");
	}

	public static void forecasting() {

		// Validate Forecasting P&L and cashflow
		WebElement forecasting = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(foreCasting)));
		String forecasting_Text = forecasting.getText();
		Assert.assertEquals(forecasting_Text, "Management Information");

		// Click on "Never" for Do you prepare a P&L forecast looking at the F/Y year
		// ahead
		WebElement fc_001 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(fc001)));
		fc_001.click();

		// Click on "Annually" for How often do you update the P&L forecast?
		WebElement fc_002 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(fc002)));
		fc_002.click();

		// Click on "Annually" for How often do you update the P&L forecast?
		WebElement fc_003 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(fc003)));
		fc_003.click();

		// Click on "Annual" for How often do you update the P&L forecast?
		WebElement fc_004 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(fc004)));
		fc_004.click();

		// Click on next button
		WebElement next = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(nextButton)));
		next.click();

		// Validate Debtor Management button
		WebElement debtormanagement = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(managementInfoButton)));
		String debtormanagement_text = debtormanagement.getText();
		Assert.assertEquals(debtormanagement_text, "Management Information");
	}
}
