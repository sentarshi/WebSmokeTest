package com.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class WhatsYourDistrict extends BaseTest{
    private static SelenideElement disctrictField = $("input[placeholder = 'Enter District or School']");
    private static SelenideElement nextButton = $(By.className("next-btn"));


    public static void enterSchoolName(){
        disctrictField.sendKeys("AutoSchool");
    }
    public static void pressNext(){
        nextButton.click();
    };
}
