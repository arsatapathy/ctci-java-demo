package com.arsatapathy.string;

public class PalindromeString {

    public static boolean isPalindrom(String input) {
        if (input.length() <= 1) return true;

        if (input.charAt(0) == input.charAt(input.length() - 1)) {
            return isPalindrom(input.substring(1, input.length() - 1));
        } else {
            return false;
        }
    }
}
