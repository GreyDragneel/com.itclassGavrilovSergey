package com.itclass.branchHomework1.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Вычислим площадь квадрата.");
        System.out.println("Введите сторону квадрата : ");
        int a = sc.nextInt();
        System.out.println("Площадь квадрата равна : " + 4 * a);
    }
}
