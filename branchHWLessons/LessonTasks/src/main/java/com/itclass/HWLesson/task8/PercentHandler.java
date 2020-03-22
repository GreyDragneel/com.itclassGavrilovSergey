package com.itclass.HWLesson.task8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PercentHandler {


    private static int num1;
    private static int num2;

    public static int getNum1() {
        return num1;
    }

    public static int getNum2() {
        return num2;
    }

    public static void setNumbers(){
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Insert 1st number");
            num1 = scanner.nextInt();
            System.out.println("Insert number of percents");
            num2 = scanner.nextInt();
        } catch (InputMismatchException ex){
            System.out.println("Number must be integer");
        }
    }

    public static void count(){
        int out = num1 * num2 / 100;
        System.out.println(out);
    }
}
