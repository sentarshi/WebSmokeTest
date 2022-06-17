package com.pages;

import com.util.testDataParser;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public abstract class BaseTest {

    public static testDataParser testdataclass;

    @BeforeTest
    public static void parseTestData() {

        {
            try {
                testdataclass = new testDataParser().read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
