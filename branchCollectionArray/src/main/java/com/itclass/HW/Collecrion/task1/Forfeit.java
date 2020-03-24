package com.itclass.HW.Collecrion.task1;


public class Forfeit {
    private ForfeitType forfeitType;
    private String message;


    public Forfeit(ForfeitType forfeitType, String message) {
        this.forfeitType = forfeitType;
        this.message = message;

    }

    public ForfeitType getForfeitType() {

        return forfeitType;
    }

    public String getMessage() {

        return message;
    }

    @Override
    public String toString() {
        return "Forfeit{" +
                "forfeitType=" + forfeitType +
                ", message='" + message +
                '\'' +
                '}';
    }
}
