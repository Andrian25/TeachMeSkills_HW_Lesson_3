package com.teachmeskills.lesson_3;

import java.util.Arrays;

/**
 * 3.  Создайте 2 массива из 5 чисел.
 * Выведите массивы на консоль в двух отдельных строках.
 * Посчитайте среднее арифметическое элементов каждого массива и сообщите,
 * для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны)
 */

public class Task_3 {
    public static void main(String[] args) {
        System.out.println("Start");

        int[] arry = new int[]{5, 10, 20, 30, 40};
        int[] myarry = new int[]{50, 60, 70, 80, 90};

        System.out.println(Arrays.toString(arry));
        System.out.println(Arrays.toString(myarry));

        int avec = 0;
        int q = 0;

        for (int i : arry) {
            avec += i;
        }
        for (int e : myarry) {
            q += e;
        }
        if (avec > q) {
            System.out.println("The mean arephmetic avec is greater than q");
        } else if (q > avec) {
            System.out.println("The mean arephmetic avec is less than q");
        }

        System.out.println("Average arephmetic " + avec / arry.length);
        System.out.println("Average arephmetic " + q / myarry.length);
        System.out.println("End");
    }
}
