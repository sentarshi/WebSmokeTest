package com.tests_stage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.pages.*;
import com.util.testDataParser;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.closeWindow;
import static com.codeborne.selenide.Selenide.open;

public class SuspendedUserStage extends BaseTest {
    @Test
    public static void suspendUser() throws Exception {
        Configuration.browser = "firefox";
        Configuration.browserSize = "1920x1080";
        open("https://webqa.fbowlapp.com");
        MainPage.openLogin();
        LoginPage.enterSuspendedEmail(testdataclass.getData("stageemaildomain"));
        VerificationCodeModal.enterVerificationEmailCodeBackDoor();
        SuspendPage.errorIcon.shouldBe(Condition.visible);
        SuspendPage.suspendModal.shouldBe(Condition.visible);
    }

    @AfterTest
    private static void borwserclose() {
        closeWindow();
    }

}
