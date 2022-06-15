package com.pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ExploreThreads extends BasePage {

    public static boolean checksearchterm(String term) {

        ElementsCollection searchresults = $$(".post-content");
        for (int i = 0; i < searchresults.size(); i++) {
            String l = searchresults.get(i).getText();
            System.out.println(l);
            if (l.contains(term) == true){

            }
        }
    }
}
