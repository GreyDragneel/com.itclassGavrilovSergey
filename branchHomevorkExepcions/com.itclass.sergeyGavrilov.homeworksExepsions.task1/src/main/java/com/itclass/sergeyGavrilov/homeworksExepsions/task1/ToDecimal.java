package com.itclass.sergeyGavrilov.homeworksExepsions.task1;

import java.util.Scanner;

public class ToDecimal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String binaryStr = scanner.nextLine();
        try {
            int result = Integer.valueOf(binaryStr, 2);
            System.out.println(result);
        } catch (NumberFormatException ex) {
            System.out.println("Вы ввели слишком большое число");
        }
    }
}
