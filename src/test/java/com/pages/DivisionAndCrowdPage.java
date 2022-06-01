package com.pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByTextCaseInsensitive;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DivisionAndCrowdPage extends BasePage {
	private	static SelenideElement crowdElement = $(new ByTextCaseInsensitive("Consulting"));
	private static SelenideElement	divisionElement = $(new ByTextCaseInsensitive("Strategy"));
	private static SelenideElement nextButton = $(new ByTextCaseInsensitive("Next"));
	public static void chooseDivisionCrowd(){
		crowdElement.click();
		divisionElement.click();
	}
	public static void pushNext(){
		nextButton.click();
	}
}
