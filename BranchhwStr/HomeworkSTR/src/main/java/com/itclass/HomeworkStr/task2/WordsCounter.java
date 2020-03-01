package com.itclass.HomeworkStr.task2;

import java.util.Scanner;

public class WordsCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку для анализа");
        String string = scanner.nextLine();
        System.out.println("Введите ключевое слово");
        String keyword = scanner.nextLine();
        String[] wordsArray = string.split(" ");
        int counter = 0;

        for(int i = 0; i < wordsArray.length; i++){
            if(wordsArray[i].equals(keyword)){
                counter++;
            }
        }

        System.out.println("Число вхождений слова: " + counter);


    }
}