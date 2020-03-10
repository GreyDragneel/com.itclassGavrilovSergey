package com.itclass.GenericHw.task2;


import java.util.InputMismatchException;
import java.util.Scanner;

public class GenericArray<T> {

    private T[] array;
    private Scanner scanner = new Scanner(System.in);

    public GenericArray(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public void fillFromKBD() {
        System.out.println("Заполните массив");

        for (int i = 0; i < array.length; i++) {
            try {
                array[i] = (T) scanner.nextLine();
            } catch (InputMismatchException ex) {
                System.out.println("Вы ввели неверное число");
                scanner.next();
                i--;
            }
        }


    }


}
