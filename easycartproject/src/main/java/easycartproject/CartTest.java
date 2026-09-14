package easycartproject;

import org.testng.annotations.Test;

public class CartTest extends BaseClass {

	@Test
	public void cartTest() throws Exception {

		CartPage cart = new CartPage(driver);

		cart.openCart();

		Thread.sleep(1000);

		cart.alert1();

		Thread.sleep(1000);

		cart.updatecart();

		ScreenshotUtil.capture( driver,"Updated_Cart");
	}

}
