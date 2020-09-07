/*
Ввести целое число в консоли. Вывести его строку-описание вида «отрицательное четное число», «нулевое число»,
«положительное нечетное число» и т. д.
 */
package ru.x5.Lesson2;

import java.util.Scanner;

public class Task_6 {

    public static void main(String[] args) {

        System.out.println("Введите любое число: ");
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        String print1, print2, result;

        if (num > 0) {
            print1 = "Положительное";
        } else if (num < 0) {
            print1 = "Отрицательное";
        } else {
            print1 = "Нулевое число";
        }
        if (num % 2 == 0) {
            print2 = "четное число";
        } else {
            print2 = "нечетное число";
        }

        result = print1 + " " + print2;
        System.out.println(result);
    }
}