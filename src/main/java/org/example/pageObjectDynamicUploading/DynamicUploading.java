package org.example.pageObjectDynamicUploading;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DynamicUploading {
    @FindBy(how = How.NAME, using = "Example 1: Element on page that is hidden")
    private SelenideElement linkOnHiddenElement;

    @FindBy(how = How.NAME, using = "Example 2: Element rendered after the fact")
    private SelenideElement linkOnRenderedElement;

    public DynamicallyLoadedPage pressOnHiddenElementLink(){
        linkOnHiddenElement.click();
        return new DynamicallyLoadedPage();
    }

}
