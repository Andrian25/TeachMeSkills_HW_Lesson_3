package com.teachmeskills.lesson_3;

import java.util.Scanner;

/**
 * 4. Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
 * Создайте массив из n случайных целых чисел и выведите его на экран.
 * Размер массива пусть задается с консоли и размер массива может быть больше 5 и меньше или равно 10.
 * Если n не удовлетворяет условию - выведите сообщение об этом.
 * Создайте второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
 */

public class Task_4 {

    public static void main(String[] args) {
        System.out.println("Start");

        int n = 0, j = 0;
        do {
            System.out.print("Insert the number: ");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 5 && n <= 10) {
                    int[] arr = new int[n];
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = (int) (Math.random() * (n + 1));
                        System.out.print(arr[i] + " ");
                        if (arr[i] % 2 == 0) {
                            j++;
                        }
                    }
                    System.out.println("\n");
                    if (j != 0) {
                        int[] myarr = new int[j];
                        j = 0;
                        for (int i = 0; i < arr.length; i++) {
                            if (arr[i] % 2 == 0) {
                                myarr[j] = arr[i];
                                System.out.print(myarr[j] + " ");
                                j++;
                            }
                        }
                    } else {
                        System.out.println("There are no even elements");
                    }
                }
            }
        } while (n > 5 && n <= 10);

        System.out.println("End");
    }
}