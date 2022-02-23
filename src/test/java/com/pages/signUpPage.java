package com.pages;
import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.*;
import com.codeborne.selenide.selector.ByAttribute;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class signUpPage extends basePage {
	private static SelenideElement signUpSelector = $(new ByAttribute("class","ng-star-inserted"));
	private static SelenideElement imProfessionalButton = signUpSelector.$(By.cssSelector(".fsb-button.professional"));
	private static SelenideElement imStudentButton = signUpSelector.$(By.cssSelector(".fsb-button.student"));
	private static SelenideElement imExistingUser = signUpSelector.$(By.cssSelector(".fsb-button.login.signin-link"));
	private static SelenideElement logInButton =  $(By.cssSelector(".fsb-button.sign-in-btn"));
	private static SelenideElement termsOfUse = $(By.linkText("Terms of Use"));
	private static SelenideElement privacyPolicy= $(By.linkText("Privacy Policy."));
	private static SelenideElement emailInputField = $(By.id("signup-email"));


	//select I'm professional option on signup modal
	public  void selectImPro(){
		imProfessionalButton.click();
	}
	//select I'm a Student option on signup modal
	public void selectImStudent(){
		imStudentButton.click();
	}
	//select I'm Existing User option on signup modal
	public void selectImExistingUser(){
		imExistingUser.click();
	}
	//select Terms Of Use Link
	public void openTermsOfUse(){
		termsOfUse.click();
	}
	//select Privacy Policy Link
	public void openPrivacyPolicy(){
		privacyPolicy.click();
	}

	//select Login Button to navigate to login page
	public void openLoginPage(){
		logInButton.click();
	}
	//Enter data into work email field
	public void enterWorkEmail(String text){
		emailInputField.sendKeys(text);
	}


}
