package org.example.pageObjectDynamicUploading;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class DynamicUploading {
    public DynamicallyLoadedHidden pressOnHiddenElementLink() {
        $(byText("Example 1: Element on page that is hidden")).click();
        return page(DynamicallyLoadedHidden.class);
    }
    public DynamicallyLoadedRendered pressOnRenderedElementLink() {
        $(byText("Example 2: Element rendered after the fact")).click();
        return page(DynamicallyLoadedRendered.class);
    }
}
