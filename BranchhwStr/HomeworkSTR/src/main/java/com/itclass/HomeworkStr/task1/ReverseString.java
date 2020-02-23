package com.itclass.HomeworkStr.task1;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(reverseString(string));
    }

    public static StringBuffer reverseString(String string){
        StringBuffer strBuffer = new StringBuffer(string);
        strBuffer.reverse();
        return strBuffer;
    }
}