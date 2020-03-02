package com.itclass.HWLesson.task5;

public class EvenNumberExtractor {
    public void extract(int num1, int num2) {
        if(num2 == num1 || 1 == Math.abs(Math.abs(num2)- Math.abs(num1))) {
            System.out.println("There are no any integers between your numbers");
        }else if (num1 < num2) {
            print(num1, num2);
        } else if (num1 > num2) {
            print(num2, num1);
        }
    }

    private void print(int num1, int num2) {
        for(num1++; num1 < num2; num1++) {
            if(isEven(num1)) {
                System.out.println(num1);
            }
        }
    }
    public  boolean isEven(int num1){
        return num1 % 2 == 0;
    }
}
