package com.arsatapathy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UniqueCharStringTest {

    @Test
    public void test_01() {
        Assertions.assertFalse(UniqueCharString.isUnique("ashish"));
        Assertions.assertTrue(UniqueCharString.isUnique("string"));

        Assertions.assertFalse(UniqueCharString.isUniqueString("ashish"));
        Assertions.assertTrue(UniqueCharString.isUniqueString("string"));
    }
}
