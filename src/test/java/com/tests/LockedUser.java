package com.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.pages.*;
import com.util.testDataParser;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;

public class LockedUser {
    static testDataParser testdataclass;
    @BeforeTest

    public static void parseTestData(){

        {
            try {
                testdataclass = new testDataParser().read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }}
    @Test
    public static void Signin() throws CloneNotSupportedException {
        Configuration.browser = "firefox";
        Configuration.browserSize = "1920x1080";
        open("https://webqa.fbowlapp.com");
        MainPage.openLogin();
        LoginPage.enterLockedEmail(testdataclass.getData("emaildomain"));
        RegistrationModal.enterVerificationEmalCode();
        LockedPage.COntactSupportButton.shouldBe(Condition.visible);
        LockedPage.verifyEmailButton.shouldBe(Condition.visible);
        LockedPage.verifyLinkedinButton.shouldBe(Condition.visible);
    }

}

