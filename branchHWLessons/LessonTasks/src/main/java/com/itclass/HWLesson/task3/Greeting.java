package com.itclass.HWLesson.task3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Greeting {
    private String greeting;

    public String getGreeting() {
        return greeting;
    }

    public void checkHours() {
        Scanner scanner = new Scanner(System.in);
        int hours;
        System.out.println("Enter a number of hours");
        try {
            hours = scanner.nextInt();
            if(hours >= 0 && hours < 6) {
                greeting = "Good night";
            } else if(hours >= 6 && hours < 13) {
                greeting = "Good morning";
            } else if(hours >= 13 && hours < 17) {
                greeting = "Good day";
            } else if(hours >= 17 && hours <= 23) {
                greeting = "Good evening";
            } else {
                throw new IllegalArgumentException ("Number of hours can not be more than 23 and less than 0");
            }
        } catch(IllegalArgumentException | InputMismatchException e) {
            greeting = "Enter a number between 0 and 23";
        } finally {
            scanner.close();
            System.out.println(greeting);
        }
    }
}
