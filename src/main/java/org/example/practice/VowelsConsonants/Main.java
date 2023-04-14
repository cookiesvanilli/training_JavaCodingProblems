package org.example.practice.VowelsConsonants;

public class Main {
    // 14 vowels, 19 consonants
    private static final String TEXT = " ... Illinois Mathematics & Science Academy ... ";

    public static void main(String[] args) {

        System.out.println("Input text: \n" + TEXT + "\n");

        System.out.println("String.charAt() solution:");
        Pair<Integer, Integer> pairV1 = VowelsAndConsonants.countVowelsAndConsonantsV1(TEXT);
        System.out.println("Vowels: " + pairV1.vowels);
        System.out.println("Consonants: " + pairV1.consonants);

        System.out.println("---------------");
        System.out.println("Java 8, functional-style solution:");
        Pair<Long, Long> pairV2 = VowelsAndConsonants.countVowelsAndConsonantsV2(TEXT);
        System.out.println("Vowels: " + pairV2.vowels);
        System.out.println("Consonants: " + pairV2.consonants);
    }
}
