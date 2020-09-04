/*
Ввести три целых числа с консоли. Вывести на экран наименьшее из них.
 */
package ru.x5;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        System.out.println("Введите три числа через пробел: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int res = 0;
        if (a < b) {
            if (a < c) res = a;
        }
            else if (b < a) {
                if (b < c) res = b;
            }
            else if (c < a) {
                if (c < b) res = c;
            }
            System.out.println("Наименьшее значение: " + res);
    }
}
