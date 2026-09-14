package easycartproject;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {
	
	WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    By clickRegister1=By.xpath("//span[text()='Register']");

    By name =
        By.xpath("//input[@placeholder='Full Name']");

    By email =
        By.xpath("//input[@placeholder='Email Address']");

    By password =
        By.xpath("//input[@placeholder='Password']");

    
    By confirmPassword=
    		By.xpath("//input[@placeholder='Confirm Password']");
    
    By registerButton =
        By.xpath("//button[@type='submit']");
    
    
    public void clickRegister1() {
    	
    	driver.findElement(clickRegister1).click();
    	
    	
    }

    public void enterName(String value) {

        driver.findElement(name)
              .sendKeys(value);
    }

    public void enterEmail(String value) {

        driver.findElement(email)
              .sendKeys(value);
    }

    public void enterPassword(String value) {

        driver.findElement(password)
              .sendKeys(value);
    }

    
    public  void confirmPassword(String value) {
    	
    	
    	driver.findElement(confirmPassword)
    	            .sendKeys(value);
    	
    }
    
   
    public void clickRegister() {

        driver.findElement(registerButton)
              .click();
        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();

        System.out.println("Alert Message: " + alert.getText());

        alert.accept();

    }
	
}
