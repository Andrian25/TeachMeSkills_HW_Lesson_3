package com.teachmeskills.lesson_3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 2. Создайте и заполните массив случайным числами
 * и выведете максимальное, минимальное и среднее значение.
 * Для генерации случайного числа используйте метод Math.random().
 * Пусть будет возможность создавать массив произвольного размера.
 * Пусть размер массива вводится с консоли.
 */

public class Task_2 {
    public static void main(String[] args) {
        System.out.println("Start");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arry;

        arry = new int[num];
        for (int i = 0; i < arry.length; i++) {
            arry[i] = (int) Math.round(Math.random() * 50);
        }
        System.out.println(Arrays.toString(arry));

        int min = arry[0];
        int max = arry[0];
        double average = 0;
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] < min) {
                min = arry[i];

            } else {
                if (arry[i] > max) {
                    max = arry[i];
                }
            }
            average += arry[i];
        }

        System.out.println("Average arephmetic " + average / num);
        System.out.println("End");
    }
}