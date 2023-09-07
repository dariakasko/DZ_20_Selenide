package org.example.pageObjectDynamicUploading;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class DynamicallyLoadedHidden {
    //here is an example of using FindBy annotation, that is available in Selenide
    @FindBy(how = How.TAG_NAME, using = "button")
    private SelenideElement startButton;

    public SelenideElement pressOnStartButton() {
        startButton.click();
        return $(byText("Hello World!"));
    }

}
