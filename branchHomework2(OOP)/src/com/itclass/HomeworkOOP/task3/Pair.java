package com.itclass.HomeworkOOP.task3;

public class Pair implements com.itclass.HomeworkOOP.task3.Show, Math {

    private int num1;
    private int num2;
    String information;


    public Pair(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.information = "Объект содержит числа " + num1 + " и " + num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int max() {
        return num1 > num2 ? num1 : num2;
    }

    public int min() {
        return num1 < num2 ? num1 : num2;
    }

    public float avg() {
        return  (num1 + num2)/2;
    }

    public void print() {
        System.out.println(information);
    }

    public void print(String info) {
        System.out.println(information);
        System.out.println(info);
    }
}
