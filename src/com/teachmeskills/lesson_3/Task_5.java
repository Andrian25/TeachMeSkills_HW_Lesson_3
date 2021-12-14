package com.teachmeskills.lesson_3;

import java.util.Arrays;

/**
 * 5. Создайте массив и заполниет массив.
 * Выведите массив на экран в строку.
 * Замените каждый элемент с нечётным индексом на ноль.
 * Снова выведете массив на экран на отдельной строке.
 */

public class Task_5 {
    public static void main(String[] args) {
        System.out.println("Start");

        int[] vest = new int[]{24, 36, 7, 11, 41, 54};

        System.out.println(Arrays.toString(vest));

        for (int i = 0; i < vest.length; i++) {
            if (i % 2 == 1) {
                vest[i] = 0;
            }
        }
        System.out.println(Arrays.toString(vest));
        System.out.println("End");
    }
}