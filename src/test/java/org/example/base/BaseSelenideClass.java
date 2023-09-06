package org.example.base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class BaseSelenideClass {
    @BeforeEach
    public void init(){
        Configuration.baseUrl = "https://the-internet.herokuapp.com";
    }
    @AfterEach
    public void clear() {
        Selenide.closeWebDriver();
    }

}
