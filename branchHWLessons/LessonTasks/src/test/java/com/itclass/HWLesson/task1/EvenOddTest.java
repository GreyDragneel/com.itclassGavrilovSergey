package com.itclass.HWLesson.task1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenOddTest {

    @Test
    public void testIsEven_isEven() {
        Assert.assertTrue(EvenOdd.isEven(2));
    }

    @Test
    public void testIsEven_isNoEven() {
        Assert.assertFalse(EvenOdd.isEven(1));
    }
}