package com.itclass.HWLesson.task5;

import com.itclass.HWLesson.task1.EvenOdd;
import org.junit.Assert;
import org.junit.Test;

public class EvenNumberExtractorTest {

    @Test
    public void testIsEven_isEven() {
        Assert.assertTrue(EvenOdd.isEven(2));
    }

    @Test
    public void testIsEven_isNoEven() {
        Assert.assertFalse(EvenOdd.isEven(1));
    }
}