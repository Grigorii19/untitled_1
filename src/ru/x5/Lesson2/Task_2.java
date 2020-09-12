/*
Ввести целое трехзначное число в консоли и найти сумму цифр этого трехзначного числа.
 */
package ru.x5.Lesson2;

import java.util.Scanner;

public class Task_2 {

    static int sum(int num) {
        if (num < 10) {
            return num;
        }
        else {
            return num % 10 + sum(num / 10);
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите целое трехзначное число: ");
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        if (num < 0) {
            num = -num;
        }
        int res = sum(num);

//  То же решение, но через цикл while.
//        int num = scanner.nextInt();
//        int sum = 0;
//        while (num > 0) {
//            sum = sum + num % 10;
//            num = num / 10;
//        }
        System.out.println("Сумма трех чисел: " + res);
    }
}

