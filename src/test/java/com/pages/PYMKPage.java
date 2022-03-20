package com.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class PYMKPage extends BasePage {

	private static SelenideElement nextButton = $(By.cssSelector("button[class='fsb-button next-btn']"));
	private static SelenideElement pymklLabel = $(By.className("pymk-label"));

	public static void pushNext() {
		nextButton.shouldHave(text("Next"));
		nextButton.click();
	}

}
