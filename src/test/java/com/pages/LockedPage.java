package com.pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;

import static com.codeborne.selenide.Selenide.$;

public class LockedPage extends BasePage{
    public static SelenideElement errorIcon = $("img[alt='Error icon']");
    public static SelenideElement suspendModal = $(new ByText("has been suspended"));
}
