package com.sanctumoffensive.core.random;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class RandomString {

    public static String getAlphaNumericString(int range) {
        byte[] array = new byte[256];
        new Random().nextBytes(array);

        String randomString = new String(array, StandardCharsets.UTF_8);
        StringBuilder r = new StringBuilder();

        String AlphaNumericString = randomString.replaceAll("[^A-Za-z0-9]", "");

        for (int k = 0; k < AlphaNumericString.length(); k++) {
            if (Character.isLetter(AlphaNumericString.charAt(k)) && (range > 0) || Character.isDigit(AlphaNumericString.charAt(k)) && (range > 0)) {
                r.append(AlphaNumericString.charAt(k));
                range--;
            }
        }

        return r.toString();
    }
}