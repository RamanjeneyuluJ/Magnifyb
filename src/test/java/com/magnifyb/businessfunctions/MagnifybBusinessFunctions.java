package com.magnifyb.businessfunctions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

	public static String actual, expected;

	public static int xpath1 = 1, xpath2 = 3, xpath3 = 7, xpath4 = 10, xpath5 = 1, xpath6 = 3, xpath7 = 7, xpath8 = 10,
			xpath9 = 1, xpath10 = 3, xpath11 = 7, xpath12 = 10, xpath13 = 1, xpath14 = 3, xpath15 = 7, xpath16 = 10,
			xpath17 = 1, xpath18 = 3, xpath19 = 7, xpath20 = 10, xpath21 = 1, xpath22 = 3, xpath23 = 7, xpath24 = 10,
			xpath25 = 1, xpath26 = 3, xpath27 = 7, xpath28 = 10, xpath29 = 1, xpath30 = 3, xpath31 = 7, xpath32 = 10,
			xpath33 = 1, xpath34 = 3, xpath35 = 7, xpath36 = 10;

	public static void navigateUrl() {
		WebDriverManager.chromedriver().driverVersion("103.0.5060.114").setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://magnify.machint.com/home");
	}

	// Enter invalid email id and valid password flow
	public static void login_001() {
		// Click on login button
		WebElement loginbutton = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loginButton)));
		loginbutton.click();

		// Validate login page
		WebElement login = driver.findElement(By.xpath(loginText));
		String login_text = login.getText();
		Assert.assertEquals(login_text, "LOGIN");

		// Enter invalid email id
		WebElement email = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(emailIDTextField)));
		email.sendKeys("ramanjeneyulu.jmachint.com");

		// Enter valid password
		WebElement password = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(passwordTextField)));
		password.sendKeys("Machint@123");

		// Click on sign in button
		WebElement signIn = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(signinButton)));
		signIn.click();

		// validate invalid email address
		actual = driver.findElement(By.xpath(invalid_email_address)).getText();
		expected = "invalid email address";
		Assert.assertEquals(actual, expected);

		// Page refreshing
		driver.navigate().refresh();
	}

	// Enter valid email id and invalid password
	public static void login_002() {
		// enter valid email id
		WebElement email = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(emailIDTextField)));
		email.sendKeys("ramanjeneyulu.j@machint.com");

		// Enter invalid password
		WebElement password = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(passwordTextField)));
		password.sendKeys("Machint123");

		// Click on sign in button
		WebElement signIn = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(signinButton)));
		signIn.click();

		// Validate for incorrect details text
		actual = driver.findElement(By.xpath(incorrect_details)).getText();
		expected = "Incorrect Details";
		Assert.assertEquals(actual, expected);

		// Page refreshing
		driver.navigate().refresh();
	}

	// Enter invalid email id and invalid password
	public static void login_003() {
		// Enter invalid email id
		WebElement email = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(emailIDTextField)));
		email.sendKeys("ramanjeneyumachint.com");

		// Enter invalid password
		WebElement password = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(passwordTextField)));
		password.sendKeys("Mach123");

		// Click on sign in button
		WebElement signIn = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(signinButton)));
		signIn.click();

		// Validate for invalid email address details text
		actual = driver.findElement(By.xpath(invalid_email_address)).getText();
		expected = "invalid email address";
		Assert.assertEquals(actual, expected);

		// Page refreshing
		driver.navigate().refresh();
	}

	// Enter numerical values in email id field and valid password
	public static void login_004()  {

		// Enter numerical values in email id field
		WebElement email = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(emailIDTextField)));
		email.sendKeys("5758689699");

		// Enter valid password
		WebElement password = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(passwordTextField)));
		password.sendKeys("Machint@123");

		// Click on sign in button
		WebElement signIn = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(signinButton)));
		signIn.click();

		// Validate for incorrect details text
		actual = driver.findElement(By.xpath(invalid_email_address)).getText();
		expected = "invalid email address";
		Assert.assertEquals(actual, expected);

		// Page refreshing
		driver.navigate().refresh();
	}

//  Enter valid email id and enter password field as numerical values
	public static void login_005() {
		// Enter valid email ID
		WebElement email = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(emailIDTextField)));
		email.sendKeys("ramanjeneyulu.j@machint.com");

		// Enter numerical values in password field
		WebElement password = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(passwordTextField)));
		password.sendKeys("686123");

		// Click on signin
		WebElement signIn = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(signinButton)));
		signIn.click();

		// Validate for incorrect details text
		actual = driver.findElement(By.xpath(incorrect_details)).getText();
		expected = "Incorrect Details";
		Assert.assertEquals(actual, expected);

		// Page refreshing
		driver.navigate().refresh();
	}

//  Enter numerical values to email Id and password field
	public static void login_006() {

		// Enter numerical values in email id field
		WebElement email = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(emailIDTextField)));
		email.sendKeys("686697979");

		// Enter numerical values in password field
		WebElement password = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(passwordTextField)));
		password.sendKeys("686123");

		// Click on signin
		WebElement signIn = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(signinButton)));
		signIn.click();
		
		// Validate for invalid email address text
		actual = driver.findElement(By.xpath(invalid_email_address)).getText();
		expected = "invalid email address";
		Assert.assertEquals(actual, expected);

		// Page refreshing
		driver.navigate().refresh();
	}

//  In email id field as blank and enter valid password
	public static void login_007() {

		// Enter email ID as blank
		WebElement email = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(emailIDTextField)));
		email.sendKeys("");

		// Enter valid password
		WebElement password = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(passwordTextField)));
		password.sendKeys("Machint@123");

		// Click on signin
		WebElement signIn = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(signinButton)));
		signIn.click();

		// Validate for required text
		actual = driver.findElement(By.xpath(required)).getText();
		expected = "Required !!";
		Assert.assertEquals(actual, expected);

		// Page refreshing
		driver.navigate().refresh();
	}

	// Enter valid email id and password field as blank
	public static void login_008() {

		// Enter valid email ID
		WebElement email = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(emailIDTextField)));
		email.sendKeys("ramanjeneyulu.j@machint.com");

		// Enter password field as blank
		WebElement password = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(passwordTextField)));
		password.sendKeys("");

		// Click on signin
		WebElement signIn = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(signinButton)));
		signIn.click();

		// Validate for required text
		actual = driver.findElement(By.xpath(required)).getText();
		expected = "Required !!";
		Assert.assertEquals(actual, expected);

		// Page refreshing
		driver.navigate().refresh();
	}

//  Without enter email id and password fields
	public static void login_009() {

		// Enter email ID as blank
		WebElement email = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(emailIDTextField)));
		email.sendKeys("");

		// Enter password as blank
		WebElement password = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(passwordTextField)));
		password.sendKeys("");

		// Click on signin
		WebElement signIn = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(signinButton)));
		signIn.click();

		// Validate for required text
		actual = driver.findElement(By.xpath(required)).getText();
		expected = "Required !!";
		Assert.assertEquals(actual, expected);

		// Page refreshing
		driver.navigate().refresh();
	}

	// Enter special characters in email id field and valid password
	public static void login_010() {

		// Enter special characters in email ID
		WebElement email = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(emailIDTextField)));
		email.sendKeys("(&*&*%#!@$^");

		// Enter valid password
		WebElement password = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(passwordTextField)));
		password.sendKeys("Machint@123");

		// Click on signin
		WebElement signIn = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(signinButton)));
		signIn.click();

		// Validate for invalid email address text
		actual = driver.findElement(By.xpath(invalid_email_address)).getText();
		expected = "invalid email address";
		Assert.assertEquals(actual, expected);

		// Page refreshing
		driver.navigate().refresh();
	}

	// Enter valid email id and enter special characters in password field
	public static void login_011() {

		// Enter valid email ID
		WebElement email = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(emailIDTextField)));
		email.sendKeys("ramanjeneyulu.j@machint.com");

		// Enter special characters in password field
		WebElement password = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(passwordTextField)));
		password.sendKeys("(^%&%!#%&^*");

		// Click on signin
		WebElement signIn = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(signinButton)));
		signIn.click();

		// Validate for incorrect details text
		actual = driver.findElement(By.xpath(incorrect_details)).getText();
		expected = "Incorrect Details";
		Assert.assertEquals(actual, expected);

		// Page refreshing
		driver.navigate().refresh();
	}

	// Enter special characters in Email id and password field
	public static void login_012() {

		// Enter special characters in email ID
		WebElement email = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(emailIDTextField)));
		email.sendKeys(")*(&*%^@#$%^");

		// Enter special characters in password field
		WebElement password = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(passwordTextField)));
		password.sendKeys("(^%&%!#%&^*");

		// Click on signin
		WebElement signIn = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(signinButton)));
		signIn.click();

		// Validate for invalid email address text
		actual = driver.findElement(By.xpath(invalid_email_address)).getText();
		expected = "invalid email address";
		Assert.assertEquals(actual, expected);

		// Page refreshing
		driver.navigate().refresh();
	}

	// 13 Enter valid login credentials
	public static void login_013() {

		// Enter valid email ID
		WebElement email = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(emailIDTextField)));
		email.sendKeys("dev440@gmail.com");

		// Enter valid password
		WebElement password = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(passwordTextField)));
		password.sendKeys("Machint@123");

		// Click on signin
		WebElement signIn = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(signinButton)));
		signIn.click();

		// Validate my company dashboard text
		actual = driver.findElement(By.xpath(myCompanyDashboard)).getText();
		expected = "My Company Dashboard";
		Assert.assertEquals(actual, expected);
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
		email.sendKeys("dev440@gmail.com");

		// Enter password
		WebElement password = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(passwordTextField)));
		password.sendKeys("Machint@123");

		// Click on sign in button
		WebElement signIn = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(signinButton)));
		signIn.click();

		Thread.sleep(50000);

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
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", businessareas);
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
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", managementinformation);
		String managementInformation_Text = managementinformation.getText();
		Assert.assertEquals(managementInformation_Text, "Management Information");

		// Click on for How often do you prepare Management Accounts
		// 1 = 1, 2 = 3, 3 = 7, 4 = 10
		WebElement mi_001 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(mi001)));
		mi_001.click();

		// Click on for Do your Management Accounts' Profit figures agree with those in
		// your Year End Accounts?
		// 5 = 1, 6 = 3, 7 = 7, 8 = 10
		WebElement mi_002 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(mi002)));
		mi_002.click();

		// Click on for Do you prepare a Budget
		// 9 = 1, 10 = 3, 11 = 7, 12 = 10
		WebElement mi_003 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(mi003)));
		mi_003.click();

		// Click on for Do you have Actuals compared to Budget with a Variance
		// 13 = 1, 14 = 3, 15 = 7, 16 = 10
		WebElement mi_004 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(mi004)));
		mi_004.click();

		// Click on for Do you have an accurate analysis of Gross margin by product?
		// 17 = 1, 18 = 3, 19 = 7, 20 = 10
		WebElement mi_005 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(mi005)));
		mi_005.click();

		// Click on for Do you have an accurate analysis of sales by Customer?
		// 21 = 1, 22 = 3, 23 = 7, 24 = 10
		WebElement mi_006 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(mi006)));
		mi_006.click();

		// Click on for Do you have an accurate analysis of gross Margin by Customer?
		// 25 = 1, 26 = 3, 27 = 7, 28 = 10
		WebElement mi_007 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(mi007)));
		mi_007.click();

		// Click on for How often do you review costs & look for savings?
		// 29 = 1, 30 = 3, 31 = 7, 32 = 10
		WebElement mi_008 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(mi008)));
		mi_008.click();

		// Click on next button
		WebElement next = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(nextButton)));
		next.click();

		// Validate Forecasting P&L and cash flow button
		WebElement foreCasting = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(forecastingButton)));
		String foreCasting_text = foreCasting.getText();
		Assert.assertEquals(foreCasting_text, "Forecasting P&L and cashflow");

		Thread.sleep(2000);
	}

	public static void forecasting() throws Exception {

		// Validate Forecasting P&L and cash flow
		WebElement forecasting = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(foreCasting)));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", forecasting);
		String forecasting_Text = forecasting.getText();
		Assert.assertEquals(forecasting_Text, "Forecasting P&L and cashflow");

		// Click on for Do you prepare a P&L forecast looking at the F/Y year ahead
		// 1 = 1, 2 = 3, 3 = 7, 4 = 10
		WebElement fc_001 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(fc001)));
		fc_001.click();

		// Click on for How often do you update the P&L forecast?
		// 5 = 1, 6 = 3, 7 = 7, 8 = 10
		WebElement fc_002 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(fc002)));
		fc_002.click();

		// Click on for How often do you update the P&L forecast?
		// 9 = 1, 10 = 3, 11 = 7, 12 = 10
		WebElement fc_003 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(fc003)));
		fc_003.click();

		// Click on for How often do you update the P&L forecast?
		// 13 = 1, 14 = 3, 15 = 7, 16 = 10
		WebElement fc_004 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(fc004)));
		fc_004.click();

		// Click on next button
		WebElement next = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(nextButton)));
		next.click();

		// Validate Debtor Management button
		WebElement debtormanagement = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(debtorManagementButton)));
		String debtormanagement_text = debtormanagement.getText();
		Assert.assertEquals(debtormanagement_text, "Debtor Management");

		Thread.sleep(2000);
	}

	public static void debtorManagement() throws Exception {

		// Validate Debtor Management
		WebElement debtormanagement = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(debtorManagement)));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", debtormanagement);
		String forecasting_Text = debtormanagement.getText();
		Assert.assertEquals(forecasting_Text, "Debtor Management");

		// Click on Do you have robust & effective terms & conditions of Sale including
		// payment terms, proven with customers
		// 1 = 1, 2 = 3, 3 = 7, 4 = 10
		WebElement dm_001 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(dm001)));
		dm_001.click();

		// Click on Do you raise invoices as soon as the job / goods are delivered
		// 5 = 1, 6 = 3, 7 = 7, 8 = 10
		WebElement dm_002 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(dm002)));
		dm_002.click();

		// Click on How long do Customers take to pay you?
		// 9 = 1, 10 = 3, 11 = 7, 12 = 10
		WebElement dm_003 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(dm003)));
		dm_003.click();

		// Click on Do you have a defined process for debtor management?
		// 13 = 1, 14 = 3, 15 = 7, 16 = 10
		WebElement dm_004 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(dm004)));
		dm_004.click();

		// Click on Does any one client represent a high% of your business?
		// 17 = 1, 18 = 3, 19 = 7, 20 = 10
		WebElement dm_005 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(dm005)));
		dm_005.click();

		// Click on Do you have a process to take on a new customer?
		// 21 = 1, 22 = 3, 23 = 7, 24 = 10
		WebElement dm_006 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(dm006)));
		dm_006.click();

		// Click on Do you have a process to utilize written terms & conditions?
		// 25 = 1, 26 = 3, 27 = 7, 28 = 10
		WebElement dm_007 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(dm007)));
		dm_007.click();

		// Click on Do you regularly review and make provision for bad / doubtful debts?
		// 29 = 1, 30 = 3, 31 = 7, 32 = 10
		WebElement dm_008 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(dm008)));
		dm_008.click();

		// Click on Does poor quality of delivery affect your customer payments
		// 33 = 1, 34 = 3, 35 = 7, 36 = 10
		WebElement dm_009 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(dm009)));
		dm_009.click();

		// Click on next button
		WebElement next = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(nextButton)));
		next.click();

		// Validate Creditor Management button
		WebElement creditormanagement = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(creditorManagementButton)));
		String creditormanagement_text = creditormanagement.getText();
		Assert.assertEquals(creditormanagement_text, "Creditor Management");

		Thread.sleep(2000);
	}

	public static void creditorManagement() throws Exception {

		// Validate Creditor Management
		WebElement creditormanagement = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(creditorManagement)));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", creditormanagement);
		String creditormanagement_text = creditormanagement.getText();
		Assert.assertEquals(creditormanagement_text, "Creditor Management");

		// Click on How long do you take to pay creditors?
		// 1 = 1, 2 = 3, 3 = 7, 4 = 10
		WebElement cm_001 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(cm001)));
		cm_001.click();

		// Click on Do you have a purchase authorization process?
		// 5 = 1, 6 = 3, 7 = 7, 8 = 10
		WebElement cm_002 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(cm002)));
		cm_002.click();

		// Click on Do you have a documented payment authorization process?
		// 9 = 1, 10 = 3, 11 = 7, 12 = 10
		WebElement cm_003 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(cm003)));
		cm_003.click();

		// Click on Does any one supplier represent a high% of your purchases?
		// 13 = 1, 14 = 3, 15 = 7, 16 = 10
		WebElement cm_004 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(cm004)));
		cm_004.click();

		// Click on For larger creditors do you agree terms in advance of doing
		// business?
		// 17 = 1, 18 = 3, 19 = 7, 20 = 10
		WebElement cm_005 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(cm005)));
		cm_005.click();

		// Click on Do you hold back payment waiting for money in?
		// 21 = 1, 22 = 3, 23 = 7, 24 = 10
		WebElement cm_006 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(cm006)));
		cm_006.click();

		// Click on next button
		WebElement next = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(nextButton)));
		next.click();

		// Validate Payroll / HR /Staff Management button
		WebElement payroll = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(payrollButton)));
		String payroll_text = payroll.getText();
		Assert.assertEquals(payroll_text, "Payroll / HR /Staff Management");

		Thread.sleep(2000);
	}

	public static void payroll() throws Exception {

		// Validate Payroll / HR /Staff Management
		WebElement payrollHR = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(payroll)));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", payrollHR);
		Thread.sleep(500);
		String payroll_text = payrollHR.getText();
		Assert.assertEquals(payroll_text, "Payroll / HR /Staff Management");

		// Click on Do you have processes to ensure that employees are completing tasks
		// to agreed times?
		// 1 = 1, 2 = 3, 3 = 7, 4 = 10
		WebElement payroll_001 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(payroll001)));
		new Actions(driver).moveToElement(payroll_001);
		payroll_001.click();

		// Click on Do you have processes to monitor productivity by employees? E.g.
		// lost time / travel time
		// 5 = 1, 6 = 3, 7 = 7, 8 = 10
		WebElement payroll_002 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(payroll002)));
		payroll_002.click();

		// Click on Do you have processes to monitor expenses use of vehicles by
		// employees?
		// 9 = 1, 10 = 3, 11 = 7, 12 = 10
		WebElement payroll_003 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(payroll003)));
		payroll_003.click();

		// Click on Do Payroll control, Paye & NI, pension accounts agree with what is
		// due?
		// 13 = 1, 14 = 3, 15 = 7, 16 = 10
		WebElement payroll_004 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(payroll004)));
		payroll_004.click();

		// Click on Do you always pay employees on the agreed date?
		// 17 = 1, 18 = 3, 19 = 7, 20 = 10
		WebElement payroll_005 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(payroll005)));
		payroll_005.click();

		// Click on next button
		WebElement next = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(nextButton)));
		next.click();

		// Validate Stock Management button
		WebElement stockManagement = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(stockManagementButton)));
		String stockManagement_text = stockManagement.getText();
		Assert.assertEquals(stockManagement_text, "Stock Management");

		Thread.sleep(2000);
	}

	public static void stockManagement() throws Exception {

		// Validate Stock Management
		WebElement stockmanagement = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(stockManagement)));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", stockmanagement);
		String stockManagement_text = stockmanagement.getText();
		Assert.assertEquals(stockManagement_text, "Stock Management");

		// Click on Do you have processes to manage stock holding levels?
		// 1 = 1, 2 = 3, 3 = 7, 4 = 10
		WebElement sm_001 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(sm001)));
		sm_001.click();

		// Click on Do you have a stock-purchase authorisation process?
		// 5 = 1, 6 = 3, 7 = 7, 8 = 10
		WebElement sm_002 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(sm002)));
		sm_002.click();

		// Click on Does your stock list / valuation agree with the Balance sheet?
		// 9 = 1, 10 = 3, 11 = 7, 12 = 10
		WebElement sm_003 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(sm003)));
		sm_003.click();

		// Click on Do you regularly review and make provision for slow moving /
		// obsolete stock?

		// 13 = 1, 14 = 3, 15 = 7, 16 = 10
		WebElement sm_004 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(sm004)));
		sm_004.click();

		// Click on Do you apply the principles of Stock-Turn in your business?
		// 17 = 1, 18 = 3, 19 = 7, 20 = 10
		WebElement sm_005 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(sm005)));
		sm_005.click();

		// Click on next button
		WebElement next = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(nextButton)));
		next.click();

		// Validate HMRC-Payments button
		WebElement hmrcPayments = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(hmrcButton)));
		String hmrcPayments_text = hmrcPayments.getText();
		Assert.assertEquals(hmrcPayments_text, "HMRC - Payments");

		Thread.sleep(2000);
	}

	public static void hmrc() throws Exception {

		// Validate HMRC-Payments button
		WebElement hmrcPayments = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(hmrc)));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", hmrcPayments);
		String hmrcPayments_text = hmrcPayments.getText();
		Assert.assertEquals(hmrcPayments_text, "HMRC - Payments");

		// Click on Fixed Assets / Capital Expenditure
		// 1 = 1, 2 = 3, 3 = 7, 4 = 10
		WebElement hmrc_001 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(hmrc001)));
		hmrc_001.click();

		// Click on Are Vat payments made on time
		// 5 = 1, 6 = 3, 7 = 7, 8 = 10
		WebElement hmrc_002 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(hmrc002)));
		hmrc_002.click();

		// Click on Are Corporation tax payments made on time
		// 9 = 1, 10 = 3, 11 = 7, 12 = 10
		WebElement hmrc_003 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(hmrc003)));
		hmrc_003.click();

		// Click on next button
		WebElement next = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(nextButton)));
		next.click();

		// Validate Fixed Assets / Capital Expenditure button
		WebElement fixedAssets = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(fixedAssetsButton)));
		String fixedAssets_text = fixedAssets.getText();
		Assert.assertEquals(fixedAssets_text, "Fixed Assets / Capital Expenditure");

		Thread.sleep(2000);
	}

	public static void fixedAssets() throws Exception {

		// Validate Fixed Assets / Capital Expenditure
		WebElement fixedassets = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(fixedAssets)));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", fixedassets);
		String fixedAssets_text = fixedassets.getText();
		Assert.assertEquals(fixedAssets_text, "Fixed Assets / Capital Expenditure");

		// Click on Does your Fixed asset register agree with the Balance Sheet?
		// 1 = 1, 2 = 3, 3 = 7, 4 = 10
		WebElement fa_001 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(fa001)));
		fa_001.click();

		// Click on Do you ensure depreciation rates are in line with useful life?
		// 5 = 1, 6 = 3, 7 = 7, 8 = 10
		WebElement fa_002 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(fa002)));
		fa_002.click();

		// Click on Do you make sure that all disposals are booked as they occur and any
		// loss/gain recorded?
		// 9 = 1, 10 = 3, 11 = 7, 12 = 10
		WebElement fa_003 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(fa003)));
		fa_003.click();

		// Click on Do you have a capital expenditure authorisation process?
		// 13 = 1, 14 = 3, 15 = 7, 16 = 10
		WebElement fa_004 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(fa004)));
		fa_004.click();

		// Click on How robust is your Capital Expenditure Budget for the year?
		// business?
		// 17 = 1, 18 = 3, 19 = 7, 20 = 10
		WebElement fa_005 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(fa005)));
		fa_005.click();

		// Click on Do you have a process to review Capital Expenditure to establish
		// payback? (return on investment)
		// 21 = 1, 22 = 3, 23 = 7, 24 = 10
		WebElement fa_006 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(fa006)));
		fa_006.click();

		// Click on Do you regularly review the impact on cashflow of new Capital
		// Expenditure?
		// 25 = 1, 26 = 3, 27 = 7, 28 = 10
		WebElement fa_007 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(fa007)));
		fa_007.click();

		// Click on next button
		WebElement next = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(nextButton)));
		next.click();

		// Validate Finance Button
		WebElement Finance = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(financeButton)));
		String Finance_text = Finance.getText();
		Assert.assertEquals(Finance_text, "Finance");

		Thread.sleep(2000);

	}

	public static void finance() throws Exception {

		// Validate Finance
		WebElement Finance = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(financetext)));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Finance);
		String Finance_text = Finance.getText();
		Assert.assertEquals(Finance_text, "Finance");

		// Click on How do you rate the usefulness of your Financial Information?
		// 1 = 1, 2 = 3, 3 = 7, 4 = 10
		WebElement fi_001 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(fi001)));
		fi_001.click();

		// Click on Is the availability of Finance for growth holding you back?
		// 5 = 1, 6 = 3, 7 = 7, 8 = 10
		WebElement fi_002 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(fi002)));
		fi_002.click();

		// Click on Do you use someone as a sounding board for new ideas / issues in
		// your business?
		// 9 = 1, 10 = 3, 11 = 7, 12 = 10
		WebElement fi_003 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(fi003)));
		fi_003.click();

		WebElement submit = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(submitButton)));
		submit.click();

		Thread.sleep(2000);
	}

	public static void businessScore() {

		// Validate Finance
		WebElement overView = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(overview)));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", overView);
		String overView_text = overView.getText();
		Assert.assertEquals(overView_text, "Your Business Overview, using our AI-based Scoring");

		int managementInformationCal = xpath1 + xpath8 + xpath12 + xpath16 + xpath20 + xpath24 + xpath28 + xpath32;
		System.out.println(managementInformationCal);
		double managementInformationScore = Math.round((managementInformationCal / 80.0) * 100.0);
		System.out.println("Management Information \t" + managementInformationScore);

		int foreCastingCal = xpath2 + xpath6 + xpath10 + xpath14;
		System.out.println(foreCastingCal);
		double foreCastingScore = Math.round((foreCastingCal / 40.0) * 100.0);
		System.out.println("Forecasting P&L and cashflow \t" + foreCastingScore);

		int debtorManagementCal = xpath1 + xpath7 + xpath11 + xpath15 + xpath19 + xpath23 + xpath27 + xpath31 + xpath35;
		System.out.println(debtorManagementCal);
		double debtorManagementScore = Math.round((debtorManagementCal / 90.0) * 100.0);
		System.out.println("Debtor Management \t" + debtorManagementScore);

		int creditorManagementCal = xpath1 + xpath5 + xpath9 + xpath13 + xpath17 + xpath21;
		System.out.println(creditorManagementCal);
		double creditorManagementScore = Math.round((creditorManagementCal / 60.0) * 100.0);
		System.out.println("Creditor Management \t" + creditorManagementScore);

		int payrollCal = xpath3 + xpath8 + xpath12 + xpath16 + xpath20;
		System.out.println(payrollCal);
		double payrollScore = Math.ceil((payrollCal / 50.0) * 100.0);
		System.out.println("Payroll / HR /Staff Management \t" + payrollScore);

		int stockManagementCal = xpath3 + xpath7 + xpath11 + xpath15 + xpath19;
		System.out.println(stockManagementCal);
		double stockManagementScore = Math.round((stockManagementCal / 50.0) * 100.0);
		System.out.println("Stock Management \t" + stockManagementScore);

		int HMRCPaymentsCal = xpath4 + xpath7 + xpath10;
		System.out.println(HMRCPaymentsCal);
		double HMRCPaymentsScore = Math.round((HMRCPaymentsCal / 30.0) * 100.0);
		System.out.println("HMRC - Payments \t" + HMRCPaymentsScore);

		int fixedAssetsCal = xpath2 + xpath6 + xpath11 + xpath15 + xpath20 + xpath24 + xpath25;
		System.out.println(fixedAssetsCal);
		double fixedAssetsScore = Math.round((fixedAssetsCal / 70.0) * 100.0);
		System.out.println("Fixed Assets / Capital Expenditure \t" + fixedAssetsScore);

		int financeCal = xpath1 + xpath6 + xpath11;
		System.out.println(financeCal);
		double financeScore = Math.round((financeCal / 30.0) * 100.0);
		System.out.println("Finance \t" + financeScore);

		int total = managementInformationCal + foreCastingCal + debtorManagementCal + creditorManagementCal + payrollCal
				+ stockManagementCal + HMRCPaymentsCal + fixedAssetsCal + financeCal;

		System.out.println(total);
		double overallPercentage = Math.round((total / 500.0) * 100.0);
		System.out.println("Overall Percentage \t" + overallPercentage);

	}

}
