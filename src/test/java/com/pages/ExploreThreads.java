package com.pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ExploreThreads extends BasePage {

    public static ElementsCollection parseElements()
    {
        ElementsCollection searchresults = $$(".post-content");
        return searchresults;
    }
}

