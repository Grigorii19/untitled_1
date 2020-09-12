/*
Ввести три целых числа с консоли. Вывести на экран наименьшее из них.
 */
package ru.x5.Lesson2;

import java.util.Scanner;

public class Task_5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите 3 числа через пробел: ");

        int[] mass = new int[3];
        for (int i = 0; i < 3; i++) {
            mass[i] = input.nextInt();
        }
        int res = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < res) {
                res = mass[i];
            }
        }
        System.out.print("Наименьшее значение: " + res);
    }
}