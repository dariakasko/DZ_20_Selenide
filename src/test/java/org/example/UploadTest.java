package org.example;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.example.base.BaseSelenideClass;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class UploadTest extends BaseSelenideClass {
    @Test
    public void uploadItemTest(){
        open("/upload");
        $x("//input[@id=\"file-upload\"]").uploadFile(new File("src/test/java/files/pdf.pdf"));
        $("#file-submit").click();
        $x("//h3[contains(text(),\"File Uploaded!\")]").shouldBe(visible);
    }
}
