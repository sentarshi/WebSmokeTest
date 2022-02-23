package com.tests;
import com.pages.mainPage;
import com.pages.signUpPage;
import com.util.testDataParser;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;


public class selenideExperiments {
	testDataParser testdataclass;
	@BeforeTest

	public void parseTestData(){

	{
		try {
			testdataclass = new testDataParser().read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}}

	//@Test
	//public void OpenBrowser (){
	//	open("https://webqa.fbowlapp.com");
	//	$(By.className("logo")).should(exist);
	//}
	@Test
	public void Signin() throws CloneNotSupportedException {
		open("https://webqa.fbowlapp.com");
		mainPage mainpage = new mainPage();
		signUpPage signuppage = new signUpPage();
		mainpage.openSignUp();
		signuppage.selectImPro();
		signuppage.enterWorkEmail((Math.random())+testdataclass.getData("email"));
	}
}
