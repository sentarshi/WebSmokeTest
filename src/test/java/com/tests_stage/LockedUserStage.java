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

public class LockedUserStage extends BaseTest {

    @Test
    public static void lockedUser() throws Exception {
        Configuration.browser = "firefox";
        Configuration.browserSize = "1920x1080";
        open("https://webqa.fbowlapp.com");
        MainPage.openLogin();
        LoginPage.enterLockedEmail(testdataclass.getData("stageemaildomain"));
        VerificationCodeModal.enterVerificationEmailCodeBackDoor();
        LockedPage.COntactSupportButton.shouldBe(Condition.visible);
        LockedPage.verifyEmailButton.shouldBe(Condition.visible);
        LockedPage.verifyLinkedinButton.shouldBe(Condition.visible);
    }

    @AfterTest
    private static void borwserclose() {
        closeWindow();
    }

}

