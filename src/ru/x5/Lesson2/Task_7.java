/*
Написать программу, вычисляющую стоимость 10 минутного междугороднего разговора в зависимости от кода города.
( Москва(905) - 4.15руб. Ростов(194) - 1.98руб. Краснодар(491) - 2.69руб. Киров(800) - 5.00руб. ).
Пользователь в консоли должен ввести код города, а в ответ от программы получить, например,
при вводе кода 905, - «Москва. Стоимость разговора: 41.5»
 */
package ru.x5.Lesson2;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        System.out.println("Введите код города\nМосква(905);\nРостов(194);\nКраснодар(491);\nКиров(800): ");
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        double resultCost, Cash, costMoskow = 4.15f, costRostov = 1.98f, costKrasnodar = 2.69f, costKirov = 5f;
        int min = 10;
        switch (num) {
            case 905:
                Cash = costMoskow;
                break;
            case 194:
                Cash = costRostov;
                break;
            case 491:
                Cash = costKrasnodar;
                break;
            case 800:
                Cash = costKirov;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + num);
        }
        resultCost = Cash * min;
        System.out.printf("Цена за " + min + " минут: " + "%.2f%n", resultCost);
    }
}