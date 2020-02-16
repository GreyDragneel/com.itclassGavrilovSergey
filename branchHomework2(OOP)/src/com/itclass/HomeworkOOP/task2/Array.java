package com.itclass.HomeworkOOP.task2;

import java.util.Random;
import java.util.Scanner;

public class Array {

    int[] numsArray;

    public Array(int numOfElements) {
        numsArray = new int[numOfElements];
    }

    public int[] getNumsArray() {
        return numsArray;
    }

    public void setNumsArray(int[] numsArray) {
        this.numsArray = numsArray;
    }

    public void fillFromKBD(){
        System.out.println("Заполните массив");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numsArray.length; i++) {
            numsArray[i] = scanner.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
    }

    public void showArrayElements(){
        for (int i = 0; i < numsArray.length; i++) {
            System.out.print (" " + numsArray[i]); // Выводим на экран, полученный массив
        }
    }

    public void fillRandom(){
        for (int i = 0; i < numsArray.length; i++) {
            Random random = new Random();
            numsArray[i] = random.nextInt(); // Заполняем массив случайными числами
        }

    }

    public void findMax(){
        int i, max;
        max = numsArray[0];
        for(i = 1; i < numsArray.length; i++)
        {
            if(numsArray[i] > max)
            {
                max = numsArray[i];
            }

        }
        System.out.println("Mаксимальное значение массива = " + max);
    }

    public void findMin(){
        int i, min;
        min = numsArray[0];
        for(i = 1; i < numsArray.length; i++)
        {
            if(numsArray[i] < min)
            {
                min = numsArray[i];
            }

        }
        System.out.println("Минимальное значение массива = " + min);
    }

    public void findAverage(){
        int i, avg, sum = 0;
        for(i = 0; i < numsArray.length; i++)
        {
            sum = sum + numsArray[i];
        }
        avg = sum / numsArray.length;
        System.out.println("Cреднее арифметическое элементов масива равна " + avg);
    }

    public void sortAscending()
    {
        int temp, i, j;
        for (j = 0; j < numsArray.length - 1; j++)
        {for (i = 0; i < numsArray.length - 1 - j; i++)
        {
            if (numsArray[i] > numsArray[i+1])
            {
                temp = numsArray[i];
                numsArray[i] = numsArray[i+1];
                numsArray[i+1] = temp;
            }
        }
        }
    }

    public void sortDecending()
    {
        int temp, i, j;
        for (j = 0; j < numsArray.length - 1; j++)
        {for (i = 0; i < numsArray.length - 1 - j; i++)
        {
            if (numsArray[i] < numsArray[i+1])
            {
                temp = numsArray[i];
                numsArray[i] = numsArray[i+1];
                numsArray[i+1] = temp;
            }
        }
        }
    }

    public void changeElement(){
        int elementNum, value;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВедите номер элемента");
        elementNum = scanner.nextInt();
        System.out.println("ВВедите значение элемента");
        value = scanner.nextInt();
        numsArray[elementNum] = value;
    }
    public boolean exit(){

        return false;
    }

}