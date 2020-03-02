package com.itclass.HWLesson.task3;

import junit.framework.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;

public class GreetingTest {

    private Greeting greeting = new Greeting();
    ByteArrayInputStream inputHours = new ByteArrayInputStream("16".getBytes());
    ByteArrayInputStream inputExc = new ByteArrayInputStream("blabla".getBytes());

    @Test
    public void testCheckHours() {
        System.setIn(inputHours);
        greeting.checkHours();
        Assert.assertEquals("Good day", greeting.getGreeting());
    }

    @Test
    public void testCheckHoursExc() {
        System.setIn(inputExc);
        greeting.checkHours();
        Assert.assertEquals("Enter a number between 0 and 23", greeting.getGreeting());
    }
}