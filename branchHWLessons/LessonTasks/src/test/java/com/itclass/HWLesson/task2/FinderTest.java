package com.itclass.HWLesson.task2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FinderTest {

    @Test
    public void testFindMax() {
        Assert.assertEquals(4, Finder.findMax(2,3,4));
    }

    @Test
    public void testFindMin() {
        Assert.assertEquals(2, Finder.findMin(2,3,4));
    }

    @Test
    public void testFindAverage() {
        Assert.assertEquals(2, Finder.findAverage(1,2,3),0.0);
    }
}