package com.itclass.HWLesson.task1;


public class EvenOdd {

    public static void check(int num) {

        if (isEven(num)) {
            System.out.println("Even number " + num);
        } else {
            System.out.println("Odd number " + num);
        }
    }

    public static boolean isEven(int num){
        return num % 2 == 0;
    }


}