package com.itclass.lesson6.homework.task5;

public class MathOperationReminder {


    public static void printOperations(Operation operation) {
        switch (operation) {
            case PLUS:
                System.out.println(Operation.PLUS.getDescription());
                break;
            case MINUS:
                System.out.println(Operation.MINUS.getDescription());
                break;
            case DIVIDE:
                System.out.println(Operation.DIVIDE.getDescription());
                break;
            case MUPLTIPLE:
                System.out.println(Operation.MUPLTIPLE.getDescription());
                break;
            default:
                throw new IllegalArgumentException();
        }
    }
}
