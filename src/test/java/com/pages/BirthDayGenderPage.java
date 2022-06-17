package com.pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByTextCaseInsensitive;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BirthDayGenderPage extends BasePage {
    private static SelenideElement brithdayMonth = $(new By.ById("month"));
    private static SelenideElement brithdayDay = $(new By.ById("day"));
    private static SelenideElement brithdayYear = $(new By.ById("year"));
    private static SelenideElement nextButton = $(new ByTextCaseInsensitive("Next"));
    private static SelenideElement genderButton = $(new By.ByClassName("gender"));


    public static void selectMonth() {
        brithdayMonth.selectOption("April");
    }

    public static void selectDay() {
        brithdayDay.selectOption("1");
    }

    public static void selectYear() {
        brithdayYear.selectOption("1988");
    }

    public static void setGender() {
        genderButton.click();
    }

    public static void pushNext() {
        nextButton.click();
    }
}

