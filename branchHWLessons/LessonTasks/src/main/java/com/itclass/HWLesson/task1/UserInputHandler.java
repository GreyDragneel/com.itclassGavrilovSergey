package com.itclass.HWLesson.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputHandler {
    public static int getUserInput() {

        System.out.println("Enter an integer number");
        try (Scanner scanner = new Scanner(System.in)) {
            return scanner.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Incorrect input type. The number must be integer.");
            return 0;
        }
    }

}
