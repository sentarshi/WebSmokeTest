package com.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class RegistrationModal extends BasePage {

	private static SelenideElement submitButtonEmailField = $(By.cssSelector("button[aria-label='submit']"));
	private static SelenideElement emailVerificationInput = $(By.cssSelector("input[aria-label='digits code']"));
	private static SelenideElement industrySelectorTitle = $(By.cssSelector("div[lass='title-text']"));


	public static void enterVerificationEmalCode(){
		//emailVerificationInput.sendKeys("1111");
		emailVerificationInput.click();
		emailVerificationInput.setValue("11111");
		actions().keyDown(Keys.CONTROL).sendKeys("1").build();
		actions().keyDown(Keys.CONTROL).sendKeys("1").build();
		actions().keyDown(Keys.CONTROL).sendKeys("1").build();
		actions().keyDown(Keys.CONTROL).sendKeys("1").build();
		industrySelectorTitle.isDisplayed();
	}



}
