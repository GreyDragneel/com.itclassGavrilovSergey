package com.itclassHomework2;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число состоящее из 4 цифр");
        int composition = 1;
        int age = scanner.nextInt();
        while((age>9999) || (age < 1000)){
            System.out.println("введите правильно четырехзначное число ");
            age = scanner.nextInt();
        }
        int result = 0;
        while(age>0){
            int temp = age % 10;
            age = age / 10;
            result = result*10 + temp;
        }
        System.out.println(result);
    }
}
