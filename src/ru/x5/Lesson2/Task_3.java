/*
Ввести целое число в консоли.  Если оно является положительным, то прибавить к нему 1, в противном случае не изменять его. Вывести полученное число.
 */
package ru.x5.Lesson2;

import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) {
        System.out.println("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int res;
        if (num > 0) {
            res = num + 1;
        }
        else {
            res = num;
        }
        System.out.println("Результат: " + res);
    }
}
