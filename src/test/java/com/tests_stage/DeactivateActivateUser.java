package com.tests_stage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.pages.*;
import io.qameta.allure.Step;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.Set;

import static com.codeborne.selenide.Selenide.*;

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
        HomeScreenPage.navigatToSettings();
        SettingsPage.deactivateAccount();
        screenshot("Deactivation end");

    }
    @AfterTest
    private static void borwserclose(){
        closeWindow();
    }

}

