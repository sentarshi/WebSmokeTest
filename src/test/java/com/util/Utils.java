package com.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
    public static int getNumber(String args) {
        Pattern pattern = Pattern.compile("numFound=\"([0-9]+)\"");
        Matcher matcher = pattern.matcher("");

        if (matcher.find()) {
            //System.out.println(matcher.group(1));
            return Integer.parseInt(matcher.group(1));
        }
        return 0;
    }
}

