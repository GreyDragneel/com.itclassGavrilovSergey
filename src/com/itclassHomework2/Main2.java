package com.itclassHomework2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Введите количество метров :");
        Scanner scanner = new Scanner(System.in);
        int metres = 0;
        metres = scanner.nextInt();
        System.out.println("введено в сантиметрах: " + metres*100);
        System.out.println("введено в дециметрах: " + metres*10);
        System.out.println("введено в миллиметрах: " + metres*1000);
    }
}
