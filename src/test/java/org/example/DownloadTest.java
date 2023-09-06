package org.example;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.DownloadOptions;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.example.base.BaseSelenideClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static com.codeborne.selenide.FileDownloadMode.FOLDER;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class DownloadTest extends BaseSelenideClass {

    @Test
    public void downloadItemTest() throws FileNotFoundException {
        open("/download");
        File txtFile = $(byText("InterviewQuestions.txt")).download();
        Assertions.assertEquals(txtFile.getName(),"InterviewQuestions.txt" );
    }
}
