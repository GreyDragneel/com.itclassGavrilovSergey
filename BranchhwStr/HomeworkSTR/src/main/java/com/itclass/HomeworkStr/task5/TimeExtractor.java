package com.itclass.HomeworkStr.task5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TimeExtractor {

    static final String regex = "[0-2][0-9]:[0-5][0-9]";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a string");
        String string = scanner.nextLine();
        Pattern pattern  = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        if (matcher.find()) {
            System.out.println(matcher.group());
        } else {
            System.out.println("Time not found");
        }

    }
}
