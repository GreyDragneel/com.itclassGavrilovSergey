package com.itclass.HomeworkOOP.task3;


public class Main {

    public static void main(String[] args) {
       Pair pair = new Pair(4, 25);
        System.out.println("Ищем минимум: " + pair.min());
        System.out.println("Ищем максимум: " + pair.max());
        System.out.println("Ищем среднее:" + pair.avg());
        pair.print();
        pair.print("Тут еще какая-то информация");

    }
}
