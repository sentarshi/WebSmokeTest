package com.pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByTextCaseInsensitive;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class NameAndTitlePage extends BasePage {
	private static SelenideElement nameTitileHeader = $(new ByTextCaseInsensitive("Verify Your Name and Current Title"));
	private static SelenideElement firstName = $(new By.ById("firstName"));
	private static SelenideElement lastName = $(new By.ById("last-name"));
	private static SelenideElement title = $(By.cssSelector("input[placeholder='Title']"));
	private static SelenideElement nextButton = $(new ByTextCaseInsensitive("Next"));

	public static boolean verifyPageOpened(){
		Boolean nameAndTitleIsdisplayed = nameTitileHeader.isDisplayed();
		return nameAndTitleIsdisplayed;
	}
	public static void enterFirstName(){
		firstName.setValue("Mister");
	}
	public static void enterLastName(){
		lastName.setValue("Robot");
	}
	public static void enterTitle(){
		title.setValue("Cortana");
	}
	public static void pushNext(){
		nextButton.click();
	}
}
