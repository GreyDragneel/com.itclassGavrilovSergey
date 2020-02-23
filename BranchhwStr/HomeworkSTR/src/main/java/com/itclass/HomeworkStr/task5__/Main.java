package com.itclass.HomeworkStr.task5__;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        int key;
        final String numberRegex = "\\d";
        final String countPunctuationRegex = "";
        final String countSentencesRegex = "";
        String text = null;
        TextHandler handler = new TextHandler();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu:\n"
                + "1. Enter a text\n"
                + "2. Set first letter of every sentence to upperCase\n"
                + "3. Count numbers in the text\n"
                + "4. Count punctuation marks in the text\n"
                + "5. Count sentences in the text\n"
                + "Any other key - exit");
        do {
            System.out.println("Insert command key:");
            key = scanner.nextInt();
            scanner.nextLine();
            switch (key){
                case(1):
                    System.out.println("Enter a text:\n");
                    text = scanner.nextLine();
                    System.out.println("Done.\n");
                    break;
                case(2):
                    System.out.println(handler.toUpperCase(text));
                    break;
                case(3):
                    System.out.println("There are " + handler.count(text, numberRegex) + " numbers");
                    break;
                case(4):
                    System.out.println("There are " + handler.count(text, countPunctuationRegex) +
                            " punctuation marks");
                    break;
                case(5):
                    System.out.println("There are " + handler.count(text, countSentencesRegex) + " sentences");
            }
        } while (key > 0 & key < 6);
        System.out.println("Exiting...");
        scanner.close();
        System.out.println("Done");
    }
}