/*
Написать программу, вычисляющую стоимость 10 минутного междугороднего разговора в зависимости от кода города.
( Москва(905) - 4.15руб. Ростов(194) - 1.98руб. Краснодар(491) - 2.69руб. Киров(800) - 5.00руб. ).
Пользователь в консоли должен ввести код города, а в ответ от программы получить, например,
при вводе кода 905, - «Москва. Стоимость разговора: 41.5»
 */
package ru.x5;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        System.out.println("Введите код города Москва(905); Ростов(194); Краснодар(491); Киров(800): ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        float res;
        float msk = 4.15f, rnd = 1.98f, kras = 2.69f, kir = 5f;
        switch (num) {
            case 905:
                res = (msk*10);
                System.out.println("Москва. Стоимость разговора: " + res);
                break;
            case 194:
                res = (rnd*10);
                System.out.println("Ростов. Стоимость разговора: " + res);
                break;
            case 491:
                res = (kras*10);
                double scale = Math.pow(10, 2);
                double result = Math.ceil(res * scale) / scale;  // Округлил до сотых. Не совсем понял оптимальное ли это решение.
                System.out.println("Краснодар. Стоимость разговора: " + result);
                break;
            case 800:
                res = (kir*10);
                System.out.println("Киров. Стоимость разговора: " + res);
                break;
        }
    }
}
