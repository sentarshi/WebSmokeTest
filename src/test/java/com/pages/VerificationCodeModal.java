package com.pages;

import com.codeborne.selenide.SelenideElement;
import com.util.EmailUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class VerificationCodeModal extends BasePage {

	private static EmailUtils emailUtils;

	public VerificationCodeModal() throws Exception {
	}


	private static SelenideElement submitButtonEmailField = $(By.cssSelector("button[aria-label='submit']"));
	private static SelenideElement emailVerificationInput = $(By.cssSelector("input[aria-label='digits code']"));
	private static SelenideElement industrySelectorTitle = $(By.cssSelector("div[lass='title-text']"));


	public static void enterVerificationEmalCode() throws Exception {
		//emailVerificationInput.sendKeys("1111");
		emailVerificationInput.click();
		emailVerificationInput.setValue(emailUtils.getVerificationCode());
		industrySelectorTitle.isDisplayed();
	}



}
