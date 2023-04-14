package org.example.practice.RemoveWhitespace;

public final class RemoveWhitespace {
    private RemoveWhitespace() {
        throw new AssertionError("Cannot be instantiated");
    }

    public static String removeWhitespace(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        return str.replaceAll("\\s", "");
    }
}
