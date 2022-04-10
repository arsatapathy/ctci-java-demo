package com.arsatapathy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PermutationOfOtherTest {

    @Test
    public void test_01() {
        Assertions.assertTrue(PermutationOfOther.permutation("ashish", "hsiash"));
        Assertions.assertFalse(PermutationOfOther.permutation("ashish", "hsiash "));
    }

    @Test
    public void test_02() {
        Assertions.assertTrue(PermutationOfOther.isPermutationOfOther("ashish", "hsiash"));
        Assertions.assertFalse(PermutationOfOther.isPermutationOfOther("ashish", "hsiash "));
    }
}
