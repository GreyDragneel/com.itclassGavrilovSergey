package com.itclass.HWLesson.task6;

public class LIneDrawer {

    private static int lineLength;
    private static String symbol;
    private static int direction;

    public static void setParameters() {
        symbol = UserInput.enter_symbol();
        lineLength = UserInput.getUserInput_Lenght();
        direction = UserInput.getDirection();
    }

    public static void draw() {
        if (direction == 1) {
            drawHorizontalLine();
        } else if (direction == 0) {
            drawVerticalLine();
        } else {
            throw new IllegalArgumentException("Direction number must be 1 or 0");
        }
    }

    private static void drawHorizontalLine() {
        for (int i = 1; i <= lineLength; i++) {
            System.out.print(symbol);
        }
    }


    private static void drawVerticalLine() {
        for (int i = 1; i <= lineLength; i++) {
            System.out.println(symbol);
        }
    }
}