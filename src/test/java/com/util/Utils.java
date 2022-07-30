package com.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
    public static int getNumber(String x) {


        if (x != null) {
          return   Integer.parseInt(x.replaceAll("[\\D]",""));

        }
        else {
            return 0;
        }
    }
}

