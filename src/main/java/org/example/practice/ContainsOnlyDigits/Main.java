package org.example.practice.ContainsOnlyDigits;

public class Main {
    private static final String ONLY_DIGITS = """
            45566336754493420932877387482372374982374823
            749823283974232237238472392309230923849023848234580383485342234287943943094
            234745374657346578465783467843653748654376837463847654382382938793287492326""";

    private static final String NOT_ONLY_DIGITS = """
            45566336754493420932877387482372374982374823
            749823283974232237238472392309230923849023848234580383485342234287943943094
            234745374657346578465783467843653748654376837463847654382382938793287492326A""";

    public static void main(String[] args) {
        System.out.println("Input text with only digits: \n" + ONLY_DIGITS + "\n");
        System.out.println("Input text with other characters: \n" + NOT_ONLY_DIGITS + "\n");

        System.out.println("Character.isDigit() solution:");
        boolean onlyDigitsV11 = ContainsOnlyDigits.containsOnlyDigitsV1(ONLY_DIGITS);
        boolean onlyDigitsV12 = ContainsOnlyDigits.containsOnlyDigitsV1(NOT_ONLY_DIGITS);
        System.out.println("Contains only digits: " + onlyDigitsV11);
        System.out.println("Contains only digits: " + onlyDigitsV12);

        System.out.println("---------");
        System.out.println("String.matches() solution:");
        boolean onlyDigitsV21 = ContainsOnlyDigits.containsOnlyDigitsV2(ONLY_DIGITS);
        boolean onlyDigitsV22 = ContainsOnlyDigits.containsOnlyDigitsV2(NOT_ONLY_DIGITS);
        System.out.println("Contains only digits: " + onlyDigitsV21);
        System.out.println("Contains only digits: " + onlyDigitsV22);

        System.out.println("---------");
        System.out.println("Java 8, functional-style solution:");
        boolean onlyDigitsV31 = ContainsOnlyDigits.containsOnlyDigitsV3(ONLY_DIGITS);
        boolean onlyDigitsV32 = ContainsOnlyDigits.containsOnlyDigitsV3(NOT_ONLY_DIGITS);
        System.out.println("Contains only digits: " + onlyDigitsV31);
        System.out.println("Contains only digits: " + onlyDigitsV32);
    }
}
