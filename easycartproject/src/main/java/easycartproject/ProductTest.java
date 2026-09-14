package easycartproject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductTest extends BaseClass {

	@Test
	public void addProductToCart()throws Exception {

		ProductPage product =new ProductPage(driver);

		product.selectProduct();

		Thread.sleep(1000);

		product.alert();

		Thread.sleep(1000);

		product.addToCart();

		Thread.sleep(1000);

		ScreenshotUtil.capture( driver,"Add_To_Cart" );

		Assert.assertTrue(driver.getPageSource().contains("Cart") );
	}

}
