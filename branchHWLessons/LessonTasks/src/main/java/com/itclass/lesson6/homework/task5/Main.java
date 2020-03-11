package com.itclass.lesson6.homework.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MathOperationReminder reminder = new MathOperationReminder();
        Scanner sc = new Scanner (System.in);

        System.out.println("enter operation number");
        int operation = sc.nextInt();
        switch (operation) {

            case 1:
                reminder.printOperations(Operation.PLUS);
                break;
            case 2:
                reminder.printOperations(Operation.MINUS);
                break;
            case 3:
                reminder.printOperations(Operation.DIVIDE);
                break;
            case 4:
                reminder.printOperations(Operation.MUPLTIPLE);
                break;
        }

    }
}
