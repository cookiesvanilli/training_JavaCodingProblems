package org.example.practice.NonRepeatedCharacters;

public class Main {

    private static final String TEXT = """
            My high school, the Illinois Mathematics and Science Academy,\s
            showed me that anything is possible and that you're never too young to think big.\s
            At 15, I worked as a computer programmer at the Fermi National Accelerator Laboratory,\s
            or Fermilab. After graduating, I attended Stanford for a degree in economics and\s
            computer science.""";

    // Ӝ -> Unicode: \u04DC, Code Point: 1244
    // 💕 -> Unicode: \uD83D\uDC95, Code Point: 128149

    public static void main(String[] args) {
        System.out.println("Input text: \n" + TEXT);
        System.out.println("\nASCII or 16 bits Unicode characters (less than 65,535 (0xFFFF)) examples:\n");

        System.out.println("Loop and break solution:");
        char firstcharV1 = NonRepeatedCharacters.firstNonRepeatedCharacterV1(TEXT);
        System.out.println("Found character: " + firstcharV1);

        System.out.println("LinkedHashMap based solution:");
        char firstcharV2 = NonRepeatedCharacters.firstNonRepeatedCharacterV2(TEXT);
        System.out.println("Found character: " + firstcharV2);
    }
}


