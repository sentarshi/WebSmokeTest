package com.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SettingsPage extends BasePage{
    private static SelenideElement accountButton = $("span[text='Account']");
    private static SelenideElement deactivateAccountButton = $("button[text='Deactivate your account']");
    private static SelenideElement deactivateConfirm = $("deactivation-modal[text='Deactivate my account']");
    public static void deactivateAccount(){
        accountButton.click();
        deactivateAccountButton.click();
        deactivateConfirm.click();
    }

}