package com.pages;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class MainPage extends BasePage {
	//locators
	private SelenideElement fishbowlLogo = $(By.className("logo"));

	private static SelenideElement mainMenu = $(By.cssSelector(".navbar-list.flex"));
	private static SelenideElement insightsButton = mainMenu.$(By.linkText("Insights"));
	private static SelenideElement	aboutButton = mainMenu.$(By.linkText("About"));
	private static SelenideElement commGuidlinesButton = mainMenu.$(By.linkText("Community Guidelines"));
	private static SelenideElement signUpButton = mainMenu.$(By.linkText("Sign Up"));

	//Open Insights page
	public static void openInsights(){
		insightsButton.click();
	}
	public static void openAbout(){
		aboutButton.click();
	}
	public static void openSignUp(){signUpButton.click();};
}