package com.itclass.HWLesson.task6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {

    private static Scanner scanner = new Scanner(System.in);

    public static String enter_symbol() {
        System.out.println("Enter a symbol");
        String smbl = scanner.nextLine();
        return smbl;
    }

    public static int getUserInput_Lenght() {
        System.out.println("Enter a line length");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Incorrect input type. The number must be integer.");
            return 0;
        }
    }

    public static int getDirection(){
        System.out.println("Enter direction (1 - horizontal, 0 - vertical)");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Incorrect input type. The number must be integer.");
            return 0;
        }
    }
}

