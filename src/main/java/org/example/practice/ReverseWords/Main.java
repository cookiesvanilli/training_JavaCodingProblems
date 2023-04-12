package org.example.practice.ReverseWords;

public class Main {
    private static final String TEXT = """
            My high school, the Illinois Mathematics and Science Academy,\s
            showed me that anything is possible and that you're never too young to think big.\s
            At 15, I worked as a computer programmer at the Fermi National Accelerator Laboratory, or Fermilab. 
            After graduating, I attended Stanford for a degree in economics and computer science.""";

    public static void main(String[] args) {
        System.out.println("Input text: \n" + TEXT + "\n");
        System.out.println("Reverse words in String via StringBuilder:");

        String reversedV1 = ReverseWords.reverseWordsV1(TEXT);
        System.out.println("Reversed: \n" + reversedV1);

        System.out.println("-------------");
        System.out.println("Reverse words in String using Java 8 functional-style:");
        String reversedV2 = ReverseWords.reverseWordsV2(TEXT);
        System.out.println("Reversed: \n" + reversedV2);

        System.out.println("-------------");
        String reversedV3 = ReverseWords.reverseWordsV3(TEXT);
        System.out.println("Reversed: \n" + reversedV3);

    }
}
