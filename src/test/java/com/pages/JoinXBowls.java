package com.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.util.Utils;
import org.openqa.selenium.By;

import java.security.PrivateKey;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class JoinXBowls extends BasePage{
    private static SelenideElement bowlsModal = $(".mat-dialog-content.previews-wrapper");
    private static ElementsCollection parseElements()
    {
        ElementsCollection bowlsList = $$(".bowl-item.ng-star-inserted");
        return bowlsList;
    }
    private static SelenideElement modalHeader = $(".mat-dialog-title.title");
    private static SelenideElement nextButton = $(".fsb-button.done-btn");
    private static SelenideElement requestMessageModal = $(By.tagName("bowl-join-request"));
    private static SelenideElement addANoteRequestField =$("#join-request-notes");
    private static SelenideElement submitOnRequestModal = $(".fsb-button.flex-center.js-loading-btn-submit");

    public static void passAddBowlsModal () throws InterruptedException {
        if (modalHeader.getText().contains("Join More Bowls!")){
            nextButton.click();
        }
        else{
            int bowlsNUmber = Utils.getNumber(modalHeader.getText());
            for (int i=0; i<bowlsNUmber;i++){
                parseElements().get(i).click();
                    if (requestMessageModal.exists()){
                        addANoteRequestField.sendKeys("Test");
                        submitOnRequestModal.click();
                    }
            }
        }
    }

}


