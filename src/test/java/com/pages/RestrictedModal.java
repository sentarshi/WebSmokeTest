package com.pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;

import static com.codeborne.selenide.Selenide.$;

public class RestrictedModal extends BasePage{
    public static SelenideElement restrictModal = $(new ByText(" As a Talent Recruiter you are provided a 7 day term to browse and view the professional network. After the term, if you’re interested in learning how Fishbowl’s Talent or HR solutions can work for Kk kompany limited LTD please reach us at: "));

}
