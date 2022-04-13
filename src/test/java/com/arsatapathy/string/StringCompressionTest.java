package com.arsatapathy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCompressionTest {

    @Test
    public void test_01() {
        Assertions.assertEquals("a2b1c5a3", StringCompression.compress("aabcccccaaa"));
    }
}
