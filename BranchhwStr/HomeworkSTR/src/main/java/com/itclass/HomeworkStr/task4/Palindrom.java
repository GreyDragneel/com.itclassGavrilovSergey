package com.itclass.HomeworkStr.task4;


import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String string = scanner.nextLine();
        StringBuilder builder = new StringBuilder(string);
        String revertedStr = builder.reverse().toString();
        string = string.replace(" ", "");
        revertedStr = revertedStr.replace(" ", "");
        if (string.equals(revertedStr)) {
            System.out.println("This is palindrom");
        } else {
            System.out.println("This is not a palindrom");
        }
    }
}
