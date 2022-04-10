package com.arsatapathy.string;

public class URLifyOfString {

    public static String URLify(String input) {
        char[] charArray = input.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' ') {
                for (int j = charArray.length - 1; j >= i + 2; j--) {
                    charArray[j] = charArray[j - 2];
                }
                charArray[i] = '%';
                charArray[i + 1] = '2';
                charArray[i + 2] = '0';

                i += 2;
            }
        }


        return String.valueOf(charArray);
    }
}
