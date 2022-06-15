package com.tests_stage;

import com.codeborne.selenide.Configuration;
import com.pages.*;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class PostSearch extends BaseTest {

    private static String searchterm = "Consulting";

    @Test
    public static void lockedUser() throws Exception {
        Configuration.browser = "firefox";
        Configuration.browserSize = "1920x1080";
        open("https://webqa.fbowlapp.com");
        MainPage.openLogin();
        LoginPage.enterRegularUserEmail(testdataclass.getData("stageemaildomain"));
        VerificationCodeModal.enterVerificationEmailCodeBackDoor();
        HomeScreenPage.notAllowNotifications();
        HomeScreenPage.searchforaword(searchterm);
        ExploreThreads.checksearchterm(searchterm);
    }

}
