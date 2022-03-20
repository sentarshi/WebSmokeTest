package com.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Screenshots;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.screenshot;

public class HomeScreenPage extends BasePage {
	private static SelenideElement userProfilePage = $(By.cssSelector("section[class='profile-section ng-star-inserted']"));

	public static void ensure() {
		userProfilePage.shouldBe(Condition.visible, Condition.enabled);
	}
}