package com.pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByTextCaseInsensitive;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DivisionAndCrowdPage extends BasePage {
    private static SelenideElement crowdConsultingElement = $(new ByTextCaseInsensitive("Consulting"));

    private static SelenideElement crowdTeachersElement = $(new ByTextCaseInsensitive("Teachers"));
    private static SelenideElement divisionStrategyElement = $(new ByTextCaseInsensitive("Strategy"));

    private static SelenideElement nextButton = $(new ByTextCaseInsensitive("Next"));

    public static void chooseDivisionCrowd() {
        crowdConsultingElement.click();
        divisionStrategyElement.click();
    }
    public static void chooseTeachersCrowd() {
        crowdTeachersElement.click();
    }

    public static void pushNext() {
        nextButton.click();
    }
}
