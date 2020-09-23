/*
Дан массив целых чисел: [1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2]. Для данного массива найти и вывести на экран:
 - максимальное значение
 - сумму положительных элементов
 - сумму четных отрицательных элементов
 - количество положительных элементов
 - среднее арифметическое отрицательных элементов
 */
package ru.x5.Lesson2;

import java.util.Arrays;

public class Task_8 {
    public static void main(String[] args) {
        int[] mass = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        int sum = 0;
        int max = 0;
        int num = 0;
        int kol = 0;
        int sum1 = 0;

        for (int i = 0; i < mass.length; i++) {
            sum1 = sum1 + mass[i];
            if (mass[i] > 0) {
                sum = sum + mass[i];
            }
            if (mass[i] > max) {
                max = mass[i];
            }
            if ((mass[i] < 0) && (mass[i] % 2 == 0)) {
                num = num + mass[i];
            }
            if (mass[i] > 0) {
                kol += 1;
            }
        }
        System.out.println("Данн одномерный массив: " + Arrays.toString(mass));
        System.out.println("Максимальное значение массива: " + max);
        System.out.println("Сумма положительных элементов массива: " + sum);
        System.out.println("Сумма четных отрицательных элементов массива: " + num);
        System.out.println("Количество положительных элементов массива: " + kol);
        System.out.println("Среднее арифметическое отрицательных элементов массива: " + (sum1 / kol));
    }
}
