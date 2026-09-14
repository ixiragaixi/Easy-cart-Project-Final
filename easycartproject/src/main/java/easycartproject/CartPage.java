package easycartproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

	WebDriver driver;

	public CartPage(WebDriver driver) {
		this.driver = driver;
	}

	By cart =
			By.xpath("//button[text()='Add More Items']");

	By quantity =
			By.xpath("(//button[contains(text(),'Add To Cart')])[1]");

	By updatecart =
			By.xpath("//span[text()='Cart']");

	public void openCart() {

		driver.findElement(cart).click();
		driver.findElement(quantity).click();

	}


	public void alert1() {

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();

	}


	public void updatecart() {

		driver.findElement(updatecart).click();

	}

}
