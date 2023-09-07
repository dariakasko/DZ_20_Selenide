package org.example;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.example.base.BaseSelenideClass;
import org.example.pageObjectDynamicUploading.DynamicUploading;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

public class DynamicUploadingTest extends BaseSelenideClass {
    @Test
    public void waitForHiddenElementTest() {
        DynamicUploading dynamicUploadingPage = open("/dynamic_loading", DynamicUploading.class);
        SelenideElement helloWorldTitle = dynamicUploadingPage
                .pressOnHiddenElementLink()
                .pressOnStartButton()
                .should(exist);
    }
    @Test
    public void renderElementAfterTheFactTest() {
        DynamicUploading dynamicUploadingPage = open("/dynamic_loading", DynamicUploading.class);
        SelenideElement helloWorldTitle = dynamicUploadingPage
                .pressOnRenderedElementLink()
                .pressOnStartButton()
                .shouldBe(visible, Duration.ofSeconds(6));
    }
}
