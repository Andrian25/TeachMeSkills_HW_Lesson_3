package com.teachmeskills.lesson_3;

import java.util.Scanner;

/**
 * 0. Создайте массив целых чисел.
 * Напишете программу, которая выводит сообщение о том,
 * входит ли заданное число в массив или нет.
 * Пусть число для поиска задается с консоли (класс Scanner).
 */

public class Task_0 {
    public static void main(String[] args) {
        System.out.println("Start");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean b = false;

        int[] myArray = new int[]{5, 10, 15, 20};
        for (int i = 0; i < myArray.length; i++) {
            if (num == myArray[i]) {
                b = true;
            }
        }
        if (b ==true)  {
        System.out.println("true");
    } else {
        System.out.println("false");
    }
        System.out.println("End");
    }
}