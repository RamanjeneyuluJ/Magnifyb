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
	public static String url = "https://magnify.machint.com/home";

	public static int xpath1 = 1, xpath2 = 3, xpath3 = 7, xpath4 = 10, xpath5 = 1, xpath6 = 3, xpath7 = 7, xpath8 = 10,
			xpath9 = 1, xpath10 = 3, xpath11 = 7, xpath12 = 10, xpath13 = 1, xpath14 = 3, xpath15 = 7, xpath16 = 10,
			xpath17 = 1, xpath18 = 3, xpath19 = 7, xpath20 = 10, xpath21 = 1, xpath22 = 3, xpath23 = 7, xpath24 = 10,
			xpath25 = 1, xpath26 = 3, xpath27 = 7, xpath28 = 10, xpath29 = 1, xpath30 = 3, xpath31 = 7, xpath32 = 10,
			xpath33 = 1, xpath34 = 3, xpath35 = 7, xpath36 = 10;

	public static void navigateUrl() {
		WebDriverManager.chromedriver().driverVersion("103.0.5060.114").setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}

	public static void loginButton() {
		WebElement loginbutton = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(loginButton)));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", loginbutton);
//		loginbutton.click();

		// Validate login page
		WebElement login = driver.findElement(By.xpath(loginText));
		actual = login.getText();
		expected = "LOGIN";
		Assert.assertEquals(actual, expected);
	}

	// Enter email id and password flow and click on sign in button
	public static void login(String emailID, String pw) throws Exception {

		// Enter email id
		WebElement email = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(emailIDTextField)));
		email.sendKeys(emailID);

		// Enter password
		WebElement password = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(passwordTextField)));
		password.sendKeys(pw);

		// Click on sign in button
		WebElement signIn = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(signinButton)));
		signIn.click();

		Thread.sleep(2000);
	}

	// Validate for invalid email address text
	public static void invalidEmailAddress() {
		WebElement invalidEmailaddress = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(invalidEmailAddress)));
		actual = invalidEmailaddress.getText();
		expected = "invalid email address";
		Assert.assertEquals(actual, expected);
	}

	// Validate for incorrect details text
	public static void incorrectDetails() {
		WebElement incorrectDetails = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(incorrectdetails)));
		actual = incorrectDetails.getText();
		expected = "Incorrect Details";
		Assert.assertEquals(actual, expected);
	}

	// Validate for required text
	public static void requried() {
		WebElement requriedText = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(required)));
		actual = requriedText.getText();
		expected = "Required !!";
		Assert.assertEquals(actual, expected);
	}

	// Validate my company dash board text
	public static void companyDashboard() throws Exception {
		WebElement dashboard = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(myCompanyDashboard)));
		actual = dashboard.getText();
		expected = "My Company Dashboard";
		Assert.assertEquals(actual, expected);
	}

	// close browser
	public static void close() {
		driver.close();
	}

	public static void progressBar() {
		new WebDriverWait(driver, Duration.ofSeconds(100))
				.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@role='progressbar']")));
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
	}

	// Validate Management Information
	public static void validateManagementInformation() throws Exception {
		// Validate Management Information button
		WebElement managementInformationButton = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(managementInfoButton)));
		actual = managementInformationButton.getText();
		expected = "Management Information";
		Assert.assertEquals(actual, expected);

		Thread.sleep(2000);

		// Validate Management Information text
		WebElement managementinformationText = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(managementInfo)));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", managementinformationText);
		actual = managementinformationText.getText();
		Assert.assertEquals(actual, expected);
	}

	// Management information questions
	public static void managementInformation() throws Exception {

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
	}

	// Validate Forecasting P&L and cash flow
	public static void validateForeCasting() throws Exception {
		// Validate Forecasting P&L and cash flow button
		WebElement foreCastingButton = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(forecastingButton)));
		actual = foreCastingButton.getText();
		expected = "Forecasting P&L and cashflow";
		Assert.assertEquals(actual, expected);

		Thread.sleep(2000);

		// Validate Forecasting P&L and cash flow
		WebElement forecastingText = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(forecasting)));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", forecastingText);
		actual = forecastingText.getText();
		Assert.assertEquals(actual, expected);
	}

	// fore casting questions
	public static void forecasting() throws Exception {

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
	}

	// Validate Debtor Management
	public static void validateDebtorManagement() throws Exception {
		// Validate Debtor Management button
		WebElement debtormanagementButton = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(debtorManagementButton)));
		actual = debtormanagementButton.getText();
		expected = "Debtor Management";
		Assert.assertEquals(actual, expected);

		Thread.sleep(2000);

		// Validate Debtor Management
		WebElement debtorManagementText = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(debtorManagement)));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", debtorManagementText);
		actual = debtorManagementText.getText();
		Assert.assertEquals(actual, expected);
	}

	// debtor management questions
	public static void debtorManagement() throws Exception {

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
	}

	// Validate Creditor Management
	public static void validateCreditorManagement() throws Exception {
		// Validate Creditor Management button
		WebElement creditormanagementButton = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(creditorManagementButton)));
		actual = creditormanagementButton.getText();
		expected = "Creditor Management";
		Assert.assertEquals(actual, expected);

		Thread.sleep(2000);

		// Validate Creditor Management
		WebElement creditormanagementText = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(creditorManagement)));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", creditormanagementText);
		actual = creditormanagementText.getText();
		Assert.assertEquals(actual, expected);
	}

	// Creditor Management questions
	public static void creditorManagement() throws Exception {

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
	}

	// Validate payroll
	public static void validatePayroll() throws Exception {
		// Validate Payroll / HR /Staff Management button
		WebElement payrollbutton = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(payrollButton)));
		actual = payrollbutton.getText();
		expected = "Payroll / HR /Staff Management";
		Assert.assertEquals(actual, expected);

		Thread.sleep(2000);

		// Validate Payroll / HR /Staff Management
		WebElement payrollText = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(payroll)));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", payrollText);
		actual = payrollText.getText();
		Assert.assertEquals(actual, expected);
	}

	// payroll questions
	public static void payroll() throws Exception {

		// Click on Do you have processes to ensure that employees are completing tasks
		// to agreed times?
		// 1 = 1, 2 = 3, 3 = 7, 4 = 10
		WebElement payroll_001 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(payroll001)));
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
	}

	// Validate stock management
	public static void validateStockManagement() throws Exception {
		// Validate Stock Management button
		WebElement stockmanagementButton = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(stockManagementButton)));
		actual = stockmanagementButton.getText();
		expected = "Stock Management";
		Assert.assertEquals(actual, expected);

		Thread.sleep(2000);

		// Validate Stock Management
		WebElement stockmanagementText = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(stockManagement)));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", stockmanagementText);
		actual = stockmanagementText.getText();
		Assert.assertEquals(actual, expected);
	}

	// Stock management questions
	public static void stockManagement() throws Exception {

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
	}

	// Validate HMRC-Payments
	public static void validateHMRC() throws Exception {
		// Validate HMRC-Payments button
		WebElement hmrcPaymentsButton = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(hmrcButton)));
		actual = hmrcPaymentsButton.getText();
		expected = "HMRC - Payments";
		Assert.assertEquals(actual, expected);

		Thread.sleep(2000);

		// Validate HMRC-Payments text
		WebElement hmrcPaymentsText = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(hmrc)));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", hmrcPaymentsText);
		actual = hmrcPaymentsText.getText();
		Assert.assertEquals(actual, expected);
	}

	// HMRC-Payments questions
	public static void hmrc() throws Exception {

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
	}

	// Validate Fixed Assets / Capital Expenditure
	public static void validateFixedAssets() throws Exception {
		// Validate Fixed Assets / Capital Expenditure button
		WebElement fixedAssetsbutton = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(fixedAssetsButton)));
		actual = fixedAssetsbutton.getText();
		expected = "Fixed Assets / Capital Expenditure";
		Assert.assertEquals(actual, expected);

		Thread.sleep(2000);

		// Validate Fixed Assets / Capital Expenditure
		WebElement fixedassetsText = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(fixedAssets)));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", fixedassetsText);
		actual = fixedassetsText.getText();
		Assert.assertEquals(actual, expected);
	}

	// Fixed Assets / Capital Expenditure Questions
	public static void fixedAssets() throws Exception {

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

		// Click on Do you regularly review the impact on cash flow of new Capital
		// Expenditure?
		// 25 = 1, 26 = 3, 27 = 7, 28 = 10
		WebElement fa_007 = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(fa007)));
		fa_007.click();

		// Click on next button
		WebElement next = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(nextButton)));
		next.click();
	}

	// Validate Finance
	public static void validateFinance() throws Exception {
		// Validate Finance Button
		WebElement financebutton = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(financeButton)));
		actual = financebutton.getText();
		expected = "Finance";
		Assert.assertEquals(actual, expected);

		Thread.sleep(2000);

		// Validate Finance
		WebElement financeText = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(financetext)));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", financeText);
		actual = financeText.getText();
		Assert.assertEquals(actual, expected);
	}

	// Finance Questions
	public static void finance() throws Exception {

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

	// Validate business score
	public static void businessScore() {

		// Validate Your Business Overview, using our AI-based Scoring
		WebElement overView = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(overview)));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", overView);
		actual = overView.getText();
		expected = "Your Business Overview, using our AI-based Scoring";
		Assert.assertEquals(actual, expected);

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

		int payrollCal = xpath1 + xpath8 + xpath12 + xpath16 + xpath20;
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
