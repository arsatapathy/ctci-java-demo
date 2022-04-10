package com.arsatapathy.string;

import java.util.Arrays;

public class PermutationOfOther {

    public static String sort(String input) {
        char[] charArray = input.toCharArray();

        Arrays.sort(charArray);

        return Arrays.toString(charArray);
    }

    public static boolean permutation(String first, String second) {
        if (first.length() != second.length()) return false;

        return sort(first).equals(sort(second));
    }

    public static boolean isPermutationOfOther(String first, String second) {

        int[] firstCounter = counter(first);
        int[] secondCounter = counter(second);

        for (int i = 0; i < firstCounter.length; i++) {
            if (firstCounter[i] != secondCounter[i])
                return false;
        }

        return true;
    }

    public static int[] counter(String input) {
        int[] counter = new int[128];

        for (char element: input.toCharArray()) {
            counter[element] ++;
        }

        return counter;
    }
}
