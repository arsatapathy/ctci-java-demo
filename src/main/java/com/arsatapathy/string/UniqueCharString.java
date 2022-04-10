package com.arsatapathy.string;

import java.util.HashSet;

public class UniqueCharString {

    public static void main(String[] args) {
        System.out.println(isUnique("ashish"));
        System.out.println(isUnique("string"));

        System.out.println(isUniqueString("ashish"));
        System.out.println(isUniqueString("string"));
    }

    public static boolean isUnique(String input) {
        HashSet<Character> set = new HashSet<>();

        for(char element :input.toCharArray()) {
            if (set.contains(element)) return false;
            else set.add(element);
        }

        return true;
    }

    public static boolean isUniqueString(String input) {

        for (int i = 0; i < input.length(); i++) {
            int index = input.indexOf(input.charAt(i));

            if (index != i && index != -1) return false;
        }

        return true;
    }
}
