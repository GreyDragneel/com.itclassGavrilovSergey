package com.itclass.HomeworkStr.task1;

import org.junit.Assert;

public class ReverseStringTest {

    ReverseString revStr = new ReverseString();
    @org.junit.Test
    public void reverseString() {
        StringBuilder buffer = revStr.reverseString("qwerty12345");
        Assert.assertEquals("54321ytrewq", buffer.toString());
    }
}