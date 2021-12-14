package com.teachmeskills.lesson_3;

import java.util.Arrays;

/**
 * Реализуйте алгоритм сортировки пузырьком.
 */

public class Task_7 {
    public static void main(String[] args) {

        System.out.println("Start");

        int[] mas = {50, 32, 4, 196, 5};

        boolean isSorted = false;
        int buf;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
        System.out.println("End");
    }
}