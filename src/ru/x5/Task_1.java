/*
Ввести целое число в консоли и вывести на экран последнюю цифру введенного числа.
 */

package ru.x5;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int res;
        res = num % 10;
        System.out.println("Последняя цифра введенного числа: " + res);
    }
}
