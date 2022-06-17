package com.tests_stage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.pages.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.Set;

import static com.codeborne.selenide.Selenide.closeWindow;
import static com.codeborne.selenide.Selenide.open;

public class DeactivateActivateUser extends BaseTest {

    @Test
    public static void deactivationActivation() throws Exception {
        Configuration.browser = "firefox";
        Configuration.browserSize = "1920x1080";
        open("https://webqa.fbowlapp.com");
        MainPage.openLogin();
        LoginPage.sloganIsVisible();
        LoginPage.enterDeactivatedActivatedEmail(testdataclass.getData("stageemaildomain"));
        VerificationCodeModal.enterVerificationEmailCodeBackDoor();
        HomeScreenPage.ensure();
        //Selenide.refresh();
        HomeScreenPage.notAllowNotifications();
        HomeScreenPage.navigatToSettings();
        SettingsPage.deactivateAccount();
        LoginPage.sloganIsVisible();
        LoginPage.enterDeactivatedActivatedEmail(testdataclass.getData("stageemaildomain"));
        VerificationCodeModal.enterVerificationEmailCodeBackDoor();
        LoginPage.reactivate();
        HomeScreenPage.ensure();

    }

    @AfterTest
    private static void borwserclose() {
        closeWindow();
    }

}

