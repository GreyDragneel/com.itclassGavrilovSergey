package com.itclass.branchHomework1.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите 1 число : ");
        int number1 = sc.nextInt();
        System.out.println("Введите 2 число : ");
        int number2 = sc.nextInt();
        System.out.println("sum of the entered numbers : " + number1 + number2);
        System.out.println("difference of the entered numbers : " + Math.abs(number1 - number2));
        System.out.println("multiplication of the entered numbers : " + number1 * number2);
        if(number2 != 0){
            System.out.println("division of the entered numbers : " + number1 / number2);//по модулю
        }
    }
}
