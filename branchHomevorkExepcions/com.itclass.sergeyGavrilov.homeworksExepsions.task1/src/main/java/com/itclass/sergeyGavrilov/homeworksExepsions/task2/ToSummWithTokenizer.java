package com.itclass.sergeyGavrilov.homeworksExepsions.task2;


import java.util.Scanner;
import java.util.StringTokenizer;

public class ToSummWithTokenizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(string, "+");
        int result = 0;
        try {
            while (tokenizer.hasMoreTokens()) {//для себя! метод проверки наличия следующей подстроки
                result += Integer.valueOf(tokenizer.nextToken());
            }
            System.out.println(result);
        } catch (NumberFormatException ex) {
            System.out.println("Сумма выходит за границы допустимого диапазона");
        }
    }
}
