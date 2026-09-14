package easycartproject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	 WebDriver driver;

	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	    }
	  
	    By email =
	        By.xpath("//input[@placeholder='Enter Email']");

	    By password =
	        By.xpath("//input[@placeholder='Enter Password']");

	    By loginButton =
	        By.xpath("//button[@type='submit']");

	    public void enterEmail(String emailId) {

	        driver.findElement(email).sendKeys(emailId);
	    }

	    public void enterPassword(String pass) {

	        driver.findElement(password)
	              .sendKeys(pass);
	    }

	    public void clickLogin() {

	        driver.findElement(loginButton)
	              .click();
	    }

	    public void login(String emailId, String pass) {

	        enterEmail(emailId);
	        enterPassword(pass);
	        clickLogin();
	    }
	

}
