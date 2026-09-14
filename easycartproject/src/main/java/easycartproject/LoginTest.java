package easycartproject;

import org.testng.annotations.Test;

import jpetstoreproject.ScreenshotUtil;

public class LoginTest extends BaseClass {


	@Test
	public void validLoginTest() throws Exception {

		System.out.println("LOGIN TEST STARTED");


		LoginPage loginPage = new LoginPage(driver);

		loginPage.enterEmail("ramesh@123gmail.com");


		loginPage.enterPassword("set@123");


		Thread.sleep(2000);

		loginPage.clickLogin();

		ScreenshotUtil.capture(driver, "Valid_Login");

		ScreenshotUtil.capture(driver, "After_Login");

		System.out.println("Current URL: " + driver.getCurrentUrl());
	}


}
