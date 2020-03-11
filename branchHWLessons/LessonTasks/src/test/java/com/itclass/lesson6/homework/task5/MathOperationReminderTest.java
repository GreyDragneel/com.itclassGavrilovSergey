package com.itclass.lesson6.homework.task5;

import org.junit.Test;

import static org.junit.Assert.*;

public class MathOperationReminderTest {

    @Test
    public void testPrintOperations_isPlus() {
        Operation operation = Operation.PLUS;
        MathOp plus = MathOperationReminder.printOperations(Operation.PLUS.getDescription());
    }

    @Test
    public void testPrintOperations_isMinus() {
    }

    @Test
    public void testPrintOperations_isDivide() {
    }

    @Test
    public void testPrintOperations_isMupltiple() {
    }
}