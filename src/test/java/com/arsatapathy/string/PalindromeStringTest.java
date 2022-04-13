package com.arsatapathy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeStringTest {
    @Test
    public void test_01() {
        Assertions.assertTrue(PalindromeString.isPalindrom("tacocat"));
    }
}
