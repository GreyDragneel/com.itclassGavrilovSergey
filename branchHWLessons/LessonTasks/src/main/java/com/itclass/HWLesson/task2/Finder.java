package com.itclass.HWLesson.task2;

public class Finder {
    public static int findMax(int num1, int num2, int num3) {
        return (Math.max(num1, Math.max(num2, num3)));
    }

    public static int findMin(int num1, int num2, int num3) {
        return (Math.min(num1, Math.min(num2, num3)));
    }

    public static double findAverage(int num1, int num2, int num3) {
        return((num1 + num2 + num3) / 3);
    }
}
