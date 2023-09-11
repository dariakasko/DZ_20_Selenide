package definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static definitions.BaseClassDefinition.chromeDriver;

public class AddProductToCartDefinition {
    @When("I press on add to cart button")
    public void pressOnAddToCartButton() {
        chromeDriver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
    }
    @Then("Product gets into product bucket")
    public void verifyProductInTheBucket() {
        chromeDriver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        Assertions.assertTrue(chromeDriver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Backpack')]")).isDisplayed());
    }
}
