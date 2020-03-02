package com.itclass.lesson6.homework.task1;

import org.junit.Test;

import junit.framework.Assert;

public class SalaryCounterTest {

    private SalaryCounter counter = new SalaryCounter();

    @Test
    public void testCountMoreThanFourtyHrs() throws SalaryCounterException{
        Assert.assertEquals(415.0, counter.count(10, (byte)41));
    }

    @Test
    public void testCountLessThanFourtyHrs() throws SalaryCounterException{
        Assert.assertEquals(300.0, counter.count(10, (byte)30));
    }

    @Test (expected = SalaryCounterException.class)
    public void testCountMoreThanSixtyHrs() throws SalaryCounterException {
        Assert.assertEquals(500.0, counter.count(10, (byte)80));
    }

    @Test (expected = SalaryCounterException.class)
    public void testCountLessThanZeroHrs() throws SalaryCounterException {
        Assert.assertEquals(500.0, counter.count(10, (byte)-5));
    }

    @Test (expected = SalaryCounterException.class)
    public void testCountLessThanEightSlr() throws SalaryCounterException {
        Assert.assertEquals(50.0, counter.count(5, (byte)10));
    }

}