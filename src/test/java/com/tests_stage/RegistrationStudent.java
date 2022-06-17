package com.tests_stage;

import com.pages.BaseTest;
import org.testng.annotations.AfterTest;

import static com.codeborne.selenide.Selenide.closeWindow;

public class RegistrationStudent extends BaseTest {

    @AfterTest
    private static void borwserclose() {
        closeWindow();
    }
    }
