package org.example.practice.NonRepeatedCharacters;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public final class NonRepeatedCharacters {

    private static final int EXTENDED_ASCII_CODES = 256;

    private NonRepeatedCharacters() {
        throw new AssertionError("Cannot be instantiated");
    }

    public static char firstNonRepeatedCharacterV1(String str) {
        int[] flags = new int[EXTENDED_ASCII_CODES];
        Arrays.fill(flags, -1);
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (flags[ch] == -1) {
                flags[ch] = i;
            } else {
                flags[ch] = -2;
            }
        }
        int position = Integer.MAX_VALUE;
        for (int i = 0; i < EXTENDED_ASCII_CODES; i++) {
            if (flags[i] >= 0) {
                position = Math.min(position, flags[i]);
            }
        }
        return position == Integer.MAX_VALUE ? Character.MIN_VALUE : str.charAt(position);
    }

    public static char firstNonRepeatedCharacterV2(String str) {
        Map<Character, Integer> chars = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            chars.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }
        for (Map.Entry<Character, Integer> entry : chars.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return Character.MIN_VALUE;
    }

}