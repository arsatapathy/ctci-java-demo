package com.arsatapathy.string;

public class StringCompression {

    public static String compress(String input) {
        char[] inputArray = input.toCharArray();
        StringBuilder newString = new StringBuilder();
        int counter = 1;

        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i] == inputArray[i + 1]) {
                counter ++;
            } else {
                String temp = inputArray[i] + String.valueOf(counter);
                newString.append(temp);

                counter = 1;
            }
        }

        String temp = inputArray[input.length() - 1] + String.valueOf(counter);
        newString.append(temp);

        return newString.length() < input.length() ? newString.toString() : input;
    }


}
