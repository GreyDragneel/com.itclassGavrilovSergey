package com.itclass.HWLesson.task8;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;

public class PercentHandlerTest {

    ByteArrayInputStream nums = new ByteArrayInputStream("50\n10".getBytes());
    PercentHandler handler = new PercentHandler();


    @Test
    public void testSetNumbers() {
        System.setIn(nums);
        PercentHandler.setNumbers();
        Assert.assertEquals(50, handler.getNum1());
        Assert.assertEquals(10, handler.getNum2());
    }
}