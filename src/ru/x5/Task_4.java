/*
Ввести целое число в консоли. Если оно является положительным, то прибавить к нему 1; если отрицательным,
то вычесть из него 2; если нулевым, то заменить его на 10. Вывести полученное число.
 */
package ru.x5;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        System.out.println("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int res = 0;
        if (num > 0) {
            res = num + 1;
        } else if (num < 0) {
            res = num - 2;
        } else if (num == 0) {
            res = 10;
        }
        System.out.println("Результат: " + res);
    }
}

