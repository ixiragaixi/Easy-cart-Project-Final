package easycartproject;

import org.testng.annotations.Test;

public class RegistrationTest extends BaseClass {

	@Test
	public void registrationTest()
			throws Exception {

		RegisterPage register = new RegisterPage(driver);

		register.clickRegister1();

		register.enterName("ramesh");

		register.enterEmail("ramesh@123gmail.com");

		register.enterPassword("set@123");

		register.confirmPassword("set@123");

		Thread.sleep(1000);

		register.clickRegister();

		ScreenshotUtil.capture( driver,"Registration");

	}


}
