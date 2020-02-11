package com.itclass.branchHomework1.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите первое число : ");
        int number = sc.nextInt();
        System.out.println("Введите 2 число : ");
        int prosent = sc.nextInt();
        if(prosent > 0 && prosent < 100) {
            System.out.println("ответ: " + number*prosent/100);
        }
        else{
            System.out.println("введите правильно 2 число");
        }
    }
}
