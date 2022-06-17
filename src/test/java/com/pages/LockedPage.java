package com.pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class LockedPage extends BasePage {
    public static SelenideElement verifyEmailButton = $(withText("Verify with work Email"));
    public static SelenideElement verifyLinkedinButton = $(withText("Verify with Linkedin"));
    public static SelenideElement COntactSupportButton = $(withText("Contact Support"));
}
