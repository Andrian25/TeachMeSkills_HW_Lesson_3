package com.teachmeskills.lesson_3;

import java.util.Arrays;

/**
 * 6. Создайте массив строк.
 * Заполните его произвольными именами людей.
 * Отсортируйте массив.
 * Результат выведите на консоль.
 */

public class Task_6 {
    public static void main(String[] args) {
        System.out.println("Start");

        String[] arryNeme = new String[6];

        arryNeme[0] = "Andrian";
        arryNeme[1] = "Nikita";
        arryNeme[2] = "Vika";
        arryNeme[3] = "Dima";
        arryNeme[4] = "Anton";
        arryNeme[5] = "Valentin";

        Arrays.sort(arryNeme);

        int i;
        for (i = 0; i < arryNeme.length; i++) {
            System.out.println(arryNeme[i]);
        }
        System.out.println("End");
    }
}
