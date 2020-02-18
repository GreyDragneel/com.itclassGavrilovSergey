package com.itclass.sergeyGavrilov.homeworksWxepsions.task3;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите размер массива");
        int arrSize = scanner.nextInt();
        Array array = new Array(arrSize);
        int key;
        System.out.println("Выберите один из пунктов работы над массивом: \n" +
                "1.Заполнение массива\n" +
                "2.Вывод массива на экран консоли\n" +
                "3.Нахождение среднего арифметического элементов массива\n" +
                "4.Нахождение максимального значения, содержащегося в массиве\n" +
                "5.Нахождение минимального значения, содержащегося в массиве\n" +
                "6.Сортировка элементов массива\n" +
                "7.Замена элемента массива\n" +
                "8.Выход из программы");
        do {
            System.out.println("\nВыберите один из пунктов работы над массивом: \n");
            key = scanner.nextInt();
            switch (key) {

                case 1:
                    System.out.println("Выберите, как заполнить массив:\n" +
                            "1.С клавиатуры\n" +
                            "2.Рандом");
                    switch (scanner.nextInt()) {
                        case 1:
                            array.fillFromKBD();
                            break;
                        case 2:
                            array.fillRandom();
                            break;
                        default:
                            System.out.println("Вы можете ввести только 1 или 2");
                            break;
                    }
                    break;
                case 2:
                    if (array != null) {
                        array.showArrayElements();
                    } else {
                        System.out.println("Выберите пункт 1");
                    }
                    break;
                case 3:
                    if (array != null) {
                        array.findAverage();
                    } else {
                        System.out.println("Выберите пункт 1");
                    }
                    break;
                case 4:
                    if (array != null) {
                        array.findMax();
                    } else {
                        System.out.println("Выберите пункт 1");
                    }
                    break;
                case 5:
                    if (array != null) {
                        array.findMin();
                    } else {
                        System.out.println("Выберите пункт 1");
                    }
                    break;
                case 6:
                    if (array != null) {
                        System.out.println("Выберите, как отсортировать массив:\n" +
                                "1.По возрастанию\n" +
                                "2.По убыванию");
                        switch (scanner.nextInt()) {
                            case 1:
                                array.sortAscending();
                                break;
                            case 2:
                                array.sortDecending();
                                break;

                            default:
                                System.out.println("что-то пошло не так");
                                break;
                        }
                    } else {
                        System.out.println("Выберите пункт 1");
                    }
                    break;

                case 7:
                    if (array != null) {
                        array.changeElement();
                    } else {
                        System.out.println("Выберите пункт 1");
                    }
                    break;
                default:
                    if (key < 1 || key > 8)
                        System.out.println("некорректный выбор пункта меню");
                    break;
            }
        } while (key != 8);
    }
}

