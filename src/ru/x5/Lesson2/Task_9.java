/*
 9. Дан массив целых чисел: [15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52].
 Переставить элементы массива в обратном порядке. Вывести результат в консоль/
 */
package ru.x5.Lesson2;

import java.util.Arrays;

public class Task_9 {
    public static void main(String[] args) {
        int[] mass = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};
        System.out.println("Данн одномерный массив: " + Arrays.toString(mass));
        int n = mass.length;
        int elem;
        for (int i = 0; i < n / 2; i++) {
            elem = mass[n - i - 1];
            mass[n - i - 1] = mass[i];
            mass[i] = elem;
        }
        for (int j : mass) {
            System.out.print(j + " "); // Тут не совсем понял как можно получше вывести данный массив.
            // Через println выводится в столбец.
        }
    }
}
