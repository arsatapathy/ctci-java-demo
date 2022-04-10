package com.arsatapathy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class URLifyOfStringTest {

    @Test
    public void test_01() {
        Assertions.assertEquals("Mr%20John%20Smith", URLifyOfString.URLify("Mr John Smith    "));
    }
}
