package definitions;

import io.cucumber.java.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassDefinition {
    public static ChromeDriver chromeDriver;

    @BeforeEach
    public void init() {
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
    }
    @AfterEach
    public void closeWebDriver() {
        chromeDriver.quit();
    }
}
