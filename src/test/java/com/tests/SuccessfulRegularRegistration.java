package com.tests;
import com.codeborne.selenide.Configuration;
import com.pages.*;
import com.util.EmailUtils;
import com.util.testDataParser;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.closeWindow;
import static com.codeborne.selenide.Selenide.*;


public class SuccessfulRegularRegistration extends BaseTest {

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
	public static void Signin() throws Exception {
		Configuration.browser = "firefox";
		Configuration.browserSize = "1920x1080";
		open("https://webqa.fbowlapp.com");
		MainPage.openSignUp();
		SignUpPage.selectImPro();
		SignUpPage.enterWorkEmailDomain(testdataclass.getData("debugmaildomain"));
		Thread.sleep(30000);
		VerificationCodeModal.connectToEmail();
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
		DownloadAppModal.closemodal();
		UpdatePictureModal.noimage();
		HomeScreenPage.ensure();
	}
	@AfterTest
	private static void borwserclose(){
		closeWindow();
	}


}
