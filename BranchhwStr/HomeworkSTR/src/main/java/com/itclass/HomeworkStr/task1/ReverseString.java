package com.itclass.HomeworkStr.task1;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(reverseString(string));
    }

    public static StringBuilder reverseString(String string){
        StringBuilder strBuilder = new StringBuilder(string);
        strBuilder.reverse();
        return strBuilder;
    }
}