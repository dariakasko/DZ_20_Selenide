package org.example.pageObjectDynamicUploading;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class DynamicallyLoadedRendered {
    public SelenideElement pressOnStartButton() {
        $(byTagName("button")).click();
        return $(byText("Hello World!"));
    }
}
