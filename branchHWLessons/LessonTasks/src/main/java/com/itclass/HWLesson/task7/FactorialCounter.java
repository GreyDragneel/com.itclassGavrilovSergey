package com.itclass.HWLesson.task7;

import java.util.Random;

public class FactorialCounter {

    private static int[] numbers;

    public FactorialCounter() {
        Random rnd = new Random();
        int length = rnd.nextInt(30);
        numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = rnd.nextInt(10);
        }
    }

    private static long[] count(){
        long[] out = new long[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            long result = 1;
            for(int j = 1; j <= numbers[i]; j++){
                result = result * j;
            }
            out[i] = result;
        }
        return out;
    }

    public void getFactorials(){
        long out[] = count();
        for(int i = 0; i < out.length; i++){
            System.out.println(out[i]);
        }
    }
}