package com.tests_stage;

import com.codeborne.selenide.Configuration;
import com.pages.*;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class AddPostInCrowd extends BaseTest {
    @Test
    public static void restrictedUser() throws Exception {
        Configuration.browser = "firefox";
        Configuration.browserSize = "1920x1080";
        open("https://webqa.fbowlapp.com");
        MainPage.openLogin();
        LoginPage.enterRegularAccountEmail(testdataclass.getData("stageemaildomain"));
        VerificationCodeModal.enterVerificationEmailCodeBackDoor();
        HomeScreenPage.notAllowNotifications();
        HomeScreenPage.openComposeField();


    }
}
