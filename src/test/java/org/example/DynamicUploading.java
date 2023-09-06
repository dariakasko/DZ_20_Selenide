package org.example;

import com.codeborne.selenide.Selenide;
import org.example.base.BaseSelenideClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DynamicUploading extends BaseSelenideClass {
    @BeforeEach
    public void init(){
        Selenide.open("/dynamic_loading");
    }

    @Test
    public void waitForHiddenElementTest(){

    }
}
