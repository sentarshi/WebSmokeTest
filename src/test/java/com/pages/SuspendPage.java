package com.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import com.codeborne.selenide.selector.ByText;
import static com.codeborne.selenide.Selenide.$;

public class SuspendPage extends BasePage {
    public static SelenideElement errorIcon = $("img[alt='Error icon']");
    public static SelenideElement suspendModal = $(new ByText(" has been suspended"));


}
