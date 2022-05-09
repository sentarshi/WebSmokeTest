package com.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.pages.LoginPage;
import com.pages.MainPage;
import com.pages.RegistrationModal;
import com.pages.SuspendPage;
import com.util.testDataParser;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;

public class SuspendedUser {

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
        LoginPage.enterSuspendedEmail(testdataclass.getData("emaildomain"));
        RegistrationModal.enterVerificationEmalCode();
        SuspendPage.errorIcon.shouldBe(Condition.visible);
        SuspendPage.suspendModal.shouldBe(Condition.exist);
    }

}
