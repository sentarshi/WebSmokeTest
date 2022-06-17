package com.util;

import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class testDataParser {
    private final static String FILE_NAME = "src/test/resources/TestData.json";
    private final Gson GSON = new Gson();
    private HashMap<String, String> testData = new HashMap<>();

    public testDataParser read() throws IOException {
        this.testData = GSON.fromJson(fileReader(), testData.getClass());
        return this;
    }

    private String fileReader() throws IOException {
        try (Stream<String> stream = Files.lines(Paths.get(FILE_NAME))) {
            return stream.collect(Collectors.joining("\r\n"));
        }
    }

    public String getData(String data) throws CloneNotSupportedException {
        return testData.get(data);
    }
}
