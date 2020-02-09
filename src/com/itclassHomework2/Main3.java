package com.itclassHomework2;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Вычислим площадь треугольника.");
        System.out.println("Введите первую основание треугольника : ");
        double a = sc.nextDouble();
        System.out.println("Введите высоту треугольника : ");
        double h = sc.nextDouble();
        System.out.println("Площадь треугольника равна : " + 0.5 * a * h);

    }
}
