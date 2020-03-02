package com.itclass.HWLesson.task4;

import org.junit.Assert;
import org.junit.Test;

public class LuckyNumberTest {

    @Test
    public void testIsEven_isLucky() {

        Assert.assertTrue(LuckyNumber.isEven(999, 999));
    }

    @Test
    public void testIsEven_isNoLucky() {
        Assert.assertFalse(LuckyNumber.isEven(111, 222));
    }
}