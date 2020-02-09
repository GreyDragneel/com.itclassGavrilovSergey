package com.itclassHomework2;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число состоящее из 4 цифр");
        int composition = 1;
        int age = scanner.nextInt();
        while((age>9999) || (age < 1000)){
        System.out.println("введите правильно четырехзначное число ");
        age = scanner.nextInt();
        }
       while(age>0){
           composition = composition * (age % 10);
           age = age / 10;
       }
        System.out.println("произведение чисел  введенного четырехзначного числа равно: "+ composition);
    }
}
