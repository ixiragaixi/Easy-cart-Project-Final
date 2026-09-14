package easycartproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

	WebDriver driver;

	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
	}

	By clickcheckout = 
			By.xpath("//button[text()='Proceed to Checkout →']");

	By name =
			By.xpath("//input[@placeholder='Enter Your Name']");

	By email =
			By.xpath("//input[@placeholder='Enter Your Email']");

	By phoneno =
			By.xpath("//input[@placeholder='Enter Mobile Number']");

	By address =
			By.xpath("//textarea[@placeholder='Enter Your Address']");

	By placeOrder =
			By.xpath("//button[@type='submit']");


	public void clickCheckout() {

		driver.findElement(clickcheckout)
		.click();
	}

	public void enterName(String value) {
		driver.findElement(name).sendKeys(value);

	}

	public void enterEmail (String value) {

		driver.findElement(email).sendKeys(value);

	}

	public void enterphoneno (String value) {
		driver.findElement(phoneno).sendKeys(value);

	}

	public void enterAddress(String value) {

		driver.findElement(address)
		.sendKeys(value);
	}

	public void placeOrder() {

		driver.findElement(placeOrder)
		.click();
	}

	public void alert2() {

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();

	}

}
