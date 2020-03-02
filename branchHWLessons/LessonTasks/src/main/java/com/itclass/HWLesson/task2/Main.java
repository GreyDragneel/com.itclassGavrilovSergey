package com.itclass.HWLesson.task2;

public class Main {
    public static void main(String[] args) {
        int num1 = UserInput.getUserInput();
        int num2 = UserInput.getUserInput();
        int num3 = UserInput.getUserInput();
        Finder.findMax(num1, num2, num3);
        Finder.findMin(num1, num2, num3);
        Finder.findAverage(num1, num2, num3);
    }
}
