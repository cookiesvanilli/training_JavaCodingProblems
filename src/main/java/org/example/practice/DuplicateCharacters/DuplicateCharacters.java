package org.example.practice.DuplicateCharacters;


import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public final class DuplicateCharacters {
    private DuplicateCharacters() {
        throw new AssertionError("Cannot be instantiated");
    }

    public static Map<Character, Integer> countDuplicateCharacters(String str) {
        Map<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            result.compute(ch, (key, value) -> (value == null) ? 1 : ++value);
        }
        return result;
    }

    public static Map<Character, Long> countDuplicateCharactersLong(String str) {
        Map<Character, Long> result = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        return result;
    }

}