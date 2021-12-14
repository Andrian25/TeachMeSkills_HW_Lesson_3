package com.teachmeskills.lesson_3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1. Создайте массив целых чисел. Удалите все вхождения заданного числа из массива.
 * Пусть число задается с консоли (класс Scanner). Если такого числа нет - выведите сообщения об этом.
 * В результате должен быть новый массив без указанного числа.
 */

public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Start");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean b = true;

        int[] cat = new int[]{7, 9, 6, 9, 5};
        int k = 0;

        for (int i = 0; i < cat.length; ) {
            if (num != cat[i]) {
                k = k + 1;
            }
            i++;
        }
        int[] myArr = new int[k];

        for (int i = 0, j = 0; i < cat.length; ) {
            if (num != cat[i]) {
                myArr[j] = cat[i];
                j++;
            }
            i++;
        }
        if (cat.length == myArr.length) {
            System.out.println("There is no such number");
        }
        System.out.println("End");
        }
    }
