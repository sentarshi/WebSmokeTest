package com.tests_stage;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.pages.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.closeWindow;
import static com.codeborne.selenide.Selenide.open;

public class SuccessfulRegularRegistrationStage extends BaseTest {
    @Test
    public static void Signup() throws Exception {
        Configuration.browser = "firefox";
        Configuration.browserSize = "1920x1080";
        open("https://webqa.fbowlapp.com");
        MainPage.openSignUp();
        SignUpPage.selectImPro();
        SignUpPage.enterWorkEmailDomainStage(testdataclass.getData("stageemaildomain"));
        VerificationCodeModal.connectToEmail();
        Thread.sleep(30000);
        VerificationCodeModal.enterVerificationEmalCode();
        PYMKPage.pushNext();
        DivisionAndCrowdPage.chooseDivisionCrowd();
        DivisionAndCrowdPage.pushNext();
        NameAndTitlePage.verifyPageOpened();
        NameAndTitlePage.enterFirstName();
        NameAndTitlePage.enterLastName();
        NameAndTitlePage.enterTitle();
        NameAndTitlePage.pushNext();
        BirthDayGenderPage.selectDay();
        BirthDayGenderPage.selectMonth();
        BirthDayGenderPage.selectYear();
        BirthDayGenderPage.setGender();
        BirthDayGenderPage.pushNext();
        Selenide.sleep(3000);
        JoinXBowls.passAddBowlsModal();
        DownloadAppModal.closemodal();
        UpdatePictureModal.noimage();
        HomeScreenPage.ensure();
    }

    @AfterTest
    private static void borwserclose() {
        closeWindow();


    }
}
