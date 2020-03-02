package com.itclass.HWLesson.task2;


import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
    public static int getUserInput() {

        System.out.println("Enter an integer number");

        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Incorrect input type. The number must be integer.");
            return 0;
        }
    }
}
