package com.pages;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByAttribute;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class SignUpPage extends BasePage {
	private static SelenideElement signUpSelector = $(new ByAttribute("class", "ng-star-inserted"));
	private static SelenideElement imProfessionalButton = signUpSelector.$(By.cssSelector(".fsb-button.professional"));
	private static SelenideElement imStudentButton = signUpSelector.$(By.cssSelector(".fsb-button.student"));
	private static SelenideElement imExistingUser = signUpSelector.$(By.cssSelector(".fsb-button.login.signin-link"));
	private static SelenideElement logInButton = $(By.cssSelector(".fsb-button.sign-in-btn"));
	private static SelenideElement termsOfUse = $(By.linkText("Terms of Use"));
	private static SelenideElement privacyPolicy = $(By.linkText("Privacy Policy."));
	private static SelenideElement emailInputField = $(By.id("signup-email"));
	private static SelenideElement submitButtonEmailField = $(By.cssSelector("button[aria-label='submit']"));

	//select I'm professional option on signup modal
	public static void selectImPro() {
		imProfessionalButton.click();
	}

	//select I'm a Student option on signup modal
	public static void selectImStudent() {
		imStudentButton.click();
	}

	//select I'm Existing User option on signup modal
	public static void selectImExistingUser() {
		imExistingUser.click();
	}

	//select Terms Of Use Link
	public static void openTermsOfUse() {
		termsOfUse.click();
	}

	//select Privacy Policy Link
	public static void openPrivacyPolicy() {
		privacyPolicy.click();
	}

	//select Login Button to navigate to login page
	public static void openLoginPage() {
		logInButton.click();
	}

	//Enter data into work email field
	public static void enterWorkEmailDomain(String text) {
		String email = Double.toString(Math.random());
		//emailInputField.sendKeys(email + "@" + text);
		emailInputField.sendKeys("sentarshi"+"@"+ text);
		submitButtonEmailField.click();
	}
}