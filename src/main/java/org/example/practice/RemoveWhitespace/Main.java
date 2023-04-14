package org.example.practice.RemoveWhitespace;

public class Main {
    private static final String TEXT = "      My high\n\n school,        the Illinois Mathematics and Science Academy, "
            + "showed me that anything is possible and that you're never too young to think big. \r"
            + "At 15, I worked as a computer programmer at the Fermi National Accelerator Laboratory, \t"
            + "or Fermilab. After graduating, I attended Stanford for a degree in economics and "
            + "computer science.           ";

    public static void main(String[] args) {
        System.out.println("Input text: \n" + TEXT + "\n");
        System.out.println("replaceAll() solution:");
        String result = RemoveWhitespace.removeWhitespace(TEXT);
        System.out.println("String without blanks is: \n" + result);
    }
}
