package definitions;


import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.PublicKey;

public class LoginTestDefinitions extends BaseClassDefinition {
    @Given("I open Login page")
    public void openLoginPage() {
        chromeDriver.get("https://www.saucedemo.com");
    }
    @When("I enter {string} my username on the Login page")
    public void inputUsername(String username) {
        chromeDriver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
    }
    @When("I enter {string} my password")
    public void inputPassword(String password) {
        chromeDriver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
    }
    @When("I click Login button on the Login page")
    public void pressOnSubmitButton() {
        chromeDriver.findElement(By.xpath("//input[@id='login-button']")).click();
    }
    @Then("The main page is displayed")
    public void verifyMainPage() {
        Assertions.assertTrue(chromeDriver.findElement(By.xpath("//span[contains(text(), 'Products')]")).isDisplayed());
    }
    @Given("I login to web site")
    public void loginToWebSite() {
        inputUsername("standart_user");
        inputPassword("secret_sauce");
        pressOnSubmitButton();
        verifyMainPage();
    }
}
