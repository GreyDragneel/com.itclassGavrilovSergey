package com.itclass.HWLesson.task5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main( String[] args ){
        EvenNumberExtractor extractor = new EvenNumberExtractor();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integer numbers");
        try {
            extractor.extract(scanner.nextInt(), scanner.nextInt());
        } catch(InputMismatchException ex) {
            System.out.println("not an integer number entered");
        }


    }
}
