package com.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Screenshots;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.screenshot;

public class HomeScreenPage extends BasePage {
    private static SelenideElement userProfilePage = $(By.cssSelector("section[class='profile-section ng-star-inserted']"));

    public static void ensure() {
        userProfilePage.shouldBe(Condition.visible, Condition.enabled);
    }

    private static SelenideElement settingsButton = $("a.transparent.settings");

    private static SelenideElement onesignalAllow = $(byText("NO THANKS"));

    private static SelenideElement suggestedPosts = $(byText("IN CASE YOU MISSED IT"));

	private static SelenideElement searchField = $("#application-search");

    private static SelenideElement composeField = $("button[aria-label='new post']");

    public static void navigatToSettings() {
        settingsButton.shouldBe(Condition.visible, Duration.ofSeconds(15));
        settingsButton.click();
    }

    public static void notAllowNotifications() {
        onesignalAllow.shouldBe(Condition.exist, Duration.ofSeconds(10));
        onesignalAllow.click();
    }

    public static void openComposeField(){
        composeField.click();
    }

    public static void checkSuggestedPosts() {
        suggestedPosts.shouldBe(Condition.exist);
    }
	public static void  searchforaword(String searchTerm){
		searchField.click();
		searchField.setValue(searchTerm);
		searchField.pressEnter();
	}

}