package com.itclass.HWLesson.task6;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;


public class UserInputTest {

    ByteArrayInputStream symbol = new ByteArrayInputStream("#".getBytes());
    ByteArrayInputStream length = new ByteArrayInputStream("10".getBytes());
    ByteArrayInputStream direction = new ByteArrayInputStream("1".getBytes());


    @Test
    public void testEnter_symbol() {
        System.setIn(symbol);
        UserInput userInput = new UserInput();
        Assert.assertEquals("#", userInput.enter_symbol());
    }

    @Test
    public void testGetUserInput_Lenght() {
        System.setIn(length);
        UserInput userInput = new UserInput();
        Assert.assertEquals(10, userInput.getUserInput_Lenght());
    }

    @Test
    public void testGetDirection() {
        System.setIn(direction);
        UserInput userInput = new UserInput();
        Assert.assertEquals(1, userInput.getDirection());
    }

}