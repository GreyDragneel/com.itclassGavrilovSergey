package com.itclass.HomeworkStr.task3;

import java.util.Scanner;

public class WordChanger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String string = scanner.nextLine();
        System.out.println("Введите заменяемое слово");
        String keyword = scanner.nextLine();
        System.out.println("Введите новое слово");
        String newWord = scanner.nextLine();
        System.out.println("Новая строка: " + string.replace(keyword, newWord));
    }
}
