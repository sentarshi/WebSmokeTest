package com.pages;

import com.codeborne.selenide.SelenideElement;
import com.util.EmailUtils;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;

public class VerificationCodeModal extends BasePage {
    private static EmailUtils emailUtils;

    public VerificationCodeModal() throws Exception {
    }


    private static SelenideElement submitButtonEmailField = $(By.cssSelector("button[aria-label='submit']"));
    private static SelenideElement emailVerificationInput = $(By.cssSelector("input[aria-label='digits code']"));
    private static SelenideElement industrySelectorTitle = $(By.cssSelector("div[class='title-text']"));

    public static void connectToEmail() {
        try {
            emailUtils = new EmailUtils("vladimir.lektmanov@itechart-group.com",
                    "Aa!79546633",
                    "webmail.itechart-group.com",

                    EmailUtils.EmailFolder.INBOX);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail(e.getMessage());
        }
    }


    public static void enterVerificationEmalCode() throws Exception {
        //
        System.out.println("Nepro4itanno" + EmailUtils.getNumberOfMessages());
        emailVerificationInput.click();
        String code = EmailUtils.getVerificationCode();
        System.out.println("COD PRILAGI" + code);
        emailVerificationInput.setValue(code);
        industrySelectorTitle.isDisplayed();
    }

    public static void enterVerificationEmailCodeBackDoor() {
        emailVerificationInput.click();
        emailVerificationInput.sendKeys("11111");
        industrySelectorTitle.isDisplayed();
    }


}
