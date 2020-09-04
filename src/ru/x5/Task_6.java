/*
Ввести целое число в консоли. Вывести его строку-описание вида «отрицательное четное число», «нулевое число»,
«положительное нечетное число» и т. д.
 */
package ru.x5;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        System.out.println("Введите любое число: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if((num < 0) && (num % 2 == 0)){
            System.out.println("Отрицательное четное число");
        }
        else if((num < 0) && (! (num % 2 == 0))) {
            System.out.println("Отрицательное нечетное число");
        }
        else if(num == 0) {
            System.out.println("Нулевое число");
        }
        else if((num > 0) && (num % 2 == 0)) {
            System.out.println("Положительное четное число");
        }
        else {
            System.out.println("Положительное нечетное число");
        }
    }
}
