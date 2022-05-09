package com.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class LoginPage extends BasePage {
    private static SelenideElement emailInputField = $(By.cssSelector("input[id='login-email']"));
    private static SelenideElement submitButtonEmailField = $(By.cssSelector("button[aria-label='submit']"));

    public static void enterSuspendedEmail(String text) {
        String email = "autosus";
        emailInputField.sendKeys(email + "@" + text);
        submitButtonEmailField.click();
    }
    }
