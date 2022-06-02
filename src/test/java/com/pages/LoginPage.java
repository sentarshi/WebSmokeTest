package com.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class LoginPage extends BasePage {
    private static SelenideElement emailInputField = $(By.cssSelector("input[id='login-email']"));
    private static SelenideElement submitButtonEmailField = $(By.cssSelector("button[aria-label='submit']"));
    private static SelenideElement mainSlogan = $("div.slogan");

    public static void enterSuspendedEmail(String text) {
        String email = "autosus";
        emailInputField.sendKeys(email + "@" + text);
        submitButtonEmailField.click();
    }

    public static void enterRestrictedEmail(String text) {
        String email = "autorest";
        emailInputField.sendKeys(email + "@" + text);
        submitButtonEmailField.click();
    }
    public static void enterLockedEmail(String text) {
        String email = "autolock";
        emailInputField.sendKeys(email + "@" + text);
        submitButtonEmailField.click();
    }
    public static void enterDeactivatedActivatedEmail(String text) {
        String email = "deactivateactivate";
        emailInputField.sendKeys(email + "@" + text);
        submitButtonEmailField.click();
    }
    public static void sloganIsVisible(){mainSlogan.shouldBe(Condition.visible);};
}
