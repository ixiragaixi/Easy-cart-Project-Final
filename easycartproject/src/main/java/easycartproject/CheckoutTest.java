package easycartproject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseClass {

	@Test
	public void checkoutTest() throws Exception {

		CheckoutPage checkout = new CheckoutPage(driver);

		checkout.clickCheckout();

		Thread.sleep(1000);

		checkout.enterName("ramesh");

		Thread.sleep(1000);

		checkout.enterEmail("ramesh@123gmail.com");

		checkout.enterphoneno("9561934565");

		Thread.sleep(1000);

		checkout.enterAddress(
				"No.5,gandhi street,Chennai, Tamil Nadu");

		Thread.sleep(1000);

		checkout.placeOrder();

		checkout.alert2();

		System.out.println("After Place Order");

		System.out.println("Current URL: " + driver.getCurrentUrl());

		System.out.println("Page Title: " + driver.getTitle());

		System.out.println("Contains Order: "
				+ driver.getPageSource().contains("Order"));

		ScreenshotUtil.capture( driver,"Checkout");

		Assert.assertTrue( driver.getPageSource() .contains("Order"));

	}

}
