package com.pages;

import com.codeborne.selenide.Screenshots;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class UpdatePictureModal extends  BasePage{
	private static SelenideElement skipForNowlink = $(By.cssSelector("button[aria-label='Skip avatar upload']"));

	public static void noimage(){
		skipForNowlink.scrollTo();
		skipForNowlink.click();
	}
}
