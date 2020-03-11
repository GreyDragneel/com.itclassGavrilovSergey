package com.itclass.lesson6.homework.task5;

public enum Operation {
    PLUS("Сложение", "Adds 2 numbers "),
    MINUS("Вычитание", "subtracts 2 numbers"),
    DIVIDE("Деление", "divides one number into another"),
    MUPLTIPLE("Умножение", "multiplies one number by another");

    private String name;
    private String description;


    Operation(String name, String description) {
        this.name = name;
        this.description = description;
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}
abstract class MathOp{}

class Plus extends MathOp{}
class Minus extends MathOp{}
class Divide extends MathOp{}
class Mupltiple extends MathOp{}