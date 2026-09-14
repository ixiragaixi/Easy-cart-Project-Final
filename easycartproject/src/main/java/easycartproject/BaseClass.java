package easycartproject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class BaseClass {

	protected  static WebDriver driver;

	@BeforeSuite
	public void setup() {
		

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts()
		.implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://easy-carts.vercel.app/");
	}

	@AfterSuite
	public void tearDown() {

		if (driver != null) {
			driver.quit();
		}
	}

}
