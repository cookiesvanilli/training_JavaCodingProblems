package org.example.practice.DuplicateCharacters;

import org.example.practice.DuplicateCharacters.DuplicateCharacters;

import java.util.Arrays;
import java.util.Map;

//Write a program that counts duplicate characters from a given string.

public class Main {
    private static final String TEXT = """
            Be strong, be fearless, be beautiful.
            And believe that anything is possible when you have the right
            people there to support you.""";
    // Ӝ -> Unicode: \u04DC, Code Point: 1244
    // 💕 -> Unicode: \uD83D\uDC95, Code Point: 128149
    // 🎼 -> \uD83C\uDFBC, Code Point: 127932
    // 😍 ->\uD83D\uDE0D, Code Point: 128525

    private static final String TEXT_CP = "😍 I love 💕 you Ӝ so much 💕 😍 🎼🎼🎼!";

    public static void main(String[] args) {
        System.out.println("Input text: \n" + TEXT);
        System.out.println("\nASCII or 16 bits Unicode characters (less than 65,535 (0xFFFF)) examples:\n");
        System.out.println("HashMap based solution:");

        Map<Character, Integer> duplicatesV1 = DuplicateCharacters.countDuplicateCharacters(TEXT);

        System.out.println(Arrays.toString(duplicatesV1.entrySet().toArray()));
        // or: duplicatesV1.forEach( (k, v) -> System.out.print(k + "="+ v + ", "));

        System.out.println();
        System.out.println("Java 8, functional-style solution:");
        Map<Character, Long> duplicatesV2 = DuplicateCharacters.countDuplicateCharactersLong(TEXT);

        System.out.println(Arrays.toString(duplicatesV2.entrySet().toArray()));
        // or: duplicatesV2.forEach( (k, v) -> System.out.print(k + "="+ v + ", "));

        System.out.println("\n--------------------------------------\n");
        System.out.println("Input text: \n" + TEXT_CP);
        System.out.println("\nIncluding Unicode surrogate pairs examples:\n");
        System.out.println("HashMap based solution:");

        Map<Character, Long> duplicatesV3 = DuplicateCharacters.countDuplicateCharactersLong(TEXT_CP);


        System.out.println(Arrays.toString(duplicatesV3.entrySet().toArray()));
        // or: duplicatesV3.forEach( (k, v) -> System.out.print(k + "="+ v + ", "));

        System.out.println();
        System.out.println("Java 8, functional-style solution:");

        Map<Character, Long> duplicatesV4 = DuplicateCharacters.countDuplicateCharactersLong(TEXT_CP);


        System.out.println(Arrays.toString(duplicatesV4.entrySet().toArray()));
        // or: duplicatesV4.forEach( (k, v) -> System.out.print(k + "="+ v + ", "));
    }

}
