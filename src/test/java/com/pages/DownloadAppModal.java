package com.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class DownloadAppModal extends BasePage{
	private static SelenideElement closeModalButton = $(By.cssSelector("button[class='close-btn ng-star-inserted']"));

	public static void closemodal(){
		closeModalButton.shouldBe(Condition.visible, Duration.ofMillis(10000));
		closeModalButton.click();
	}
}
