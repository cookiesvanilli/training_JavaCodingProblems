package org.example.practice.ContainsOnlyDigits;

public class ContainsOnlyDigits {
    private ContainsOnlyDigits() {
        throw new AssertionError("Cannot be installed");
    }

    public static boolean containsOnlyDigitsV1(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean containsOnlyDigitsV2(String str) {
        return str.chars()
                .allMatch(Character::isDigit);
    }

    public static boolean containsOnlyDigitsV3(String str) {
        return str.matches("[0-9]+");
    }
}
