package org.example.practice.ReverseWords;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public final class ReverseWords {

    private static final String WHITESPACE = " ";
    private static final Pattern PATTERN = Pattern.compile(" +");

    private ReverseWords() {
        throw new AssertionError("Cannot be installed");
    }

    public static String reverseWordsV1(String str) {
        String[] words = str.split(WHITESPACE);
        StringBuilder reverseStringBuilder = new StringBuilder();
        for (String word : words) {
            StringBuilder reverseWord = new StringBuilder();
            for (int i = word.length() - 1; i >= 0; i--) {
                reverseWord.append(word.charAt(i));
            }
            reverseStringBuilder.append(reverseWord).append(WHITESPACE);
        }
        return reverseStringBuilder.toString();
    }

    public static String reverseWordsV2(String str) {
        return PATTERN.splitAsStream(str)
                .map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining());
    }

    public static String reverseWordsV3(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
