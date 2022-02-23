package com.pages;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class mainPage extends basePage {
	//locators
	private SelenideElement fishbowlLogo = $(By.className("logo"));

	private SelenideElement mainMenu = $(By.cssSelector(".navbar-list.flex"));
	private SelenideElement insightsButton = mainMenu.$(By.linkText("Insights"));
	private SelenideElement	aboutButton = mainMenu.$(By.linkText("About"));
	private SelenideElement commGuidlinesButton = mainMenu.$(By.linkText("Community Guidelines"));
	private SelenideElement signUpButton = mainMenu.$(By.linkText("Sign Up"));

	//Open Insights page
	public void openInsights(){
		insightsButton.click();
	}
	public void openAbout(){
		aboutButton.click();
	}
	public void openSignUp(){signUpButton.click();};
}