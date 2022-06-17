package com.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SettingsPage extends BasePage {
    private static SelenideElement accountButton = $(byText("Account")).scrollIntoView(false);
    private static SelenideElement deactivateAccountButton = $(byText("Deactivate your account"));
    private static SelenideElement deactivateConfirm = $(byText("Deactivate my account"));

    public static void deactivateAccount() {
        accountButton.click();
        deactivateAccountButton.click();
        deactivateConfirm.click();
    }

}