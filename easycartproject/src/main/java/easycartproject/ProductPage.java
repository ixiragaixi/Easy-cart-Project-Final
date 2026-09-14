package easycartproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

	WebDriver driver;

	public ProductPage(WebDriver driver) {
		this.driver = driver;
	}

	By product =
			By.xpath("(//button[text()='Add To Cart'])[3]");

	By addToCart =
			By.xpath("//span[text()='Cart']");


	public void selectProduct() {

		driver.findElement(product)
		.click();
	}

	public void alert() {

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();

	}

	public void addToCart() {

		driver.findElement(addToCart)
		.click();
	}

}
