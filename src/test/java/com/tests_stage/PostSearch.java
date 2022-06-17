package com.tests_stage;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.pages.*;
import org.testng.annotations.Test;

import java.util.PrimitiveIterator;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.screenshot;

public class PostSearch extends BaseTest {

    static String searchterm = "Consulting";
    static ElementsCollection searchResults;

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
        screenshot("SearchResult");
        searchResults = ExploreThreads.parseElements();
        //searchResults.shouldBe(CollectionCondition.texts(searchterm));
        searchResults.shouldBe(CollectionCondition.allMatch("all elements have",e->e.getText().contains(searchterm)));
    }

}
