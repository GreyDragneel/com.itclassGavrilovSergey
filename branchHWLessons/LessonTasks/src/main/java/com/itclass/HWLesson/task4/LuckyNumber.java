package com.itclass.HWLesson.task4;

public class LuckyNumber {

    public static void devideOnNumbersAndCheck(int num) {
        int[] arr = new int[6];
        for (int i = 5; i >= 0; --i) {
            arr[i] = num % 10;
            num = num / 10;
        }
        int firstHalf = arr[0] + arr[1] + arr[2];
        int secondHalf = arr[3] + arr[4] + arr[5];
        if (isEven(firstHalf, secondHalf)) {
            System.out.println("yes it is a lucky number ");
        } else {
            System.out.println("no it is not lucky ");
        }
    }


    public static boolean isEven(int firstHalf, int secondHalf) {

        return firstHalf == secondHalf;
    }
}
