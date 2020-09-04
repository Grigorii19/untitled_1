/*
10. Дан массив целых чисел: [15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52].
Переместить нули в конец массива. Вывести результат в консоль
 */
package ru.x5;

import java.util.Arrays;

public class Task_10 {
    public  static void main (String[] args) {
        int []mass = {15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52};
        System.out.println("Данн массив: " + Arrays.toString(mass));
        int n = mass.length-1;
        int n2 = 0;

        for(int i = n-1; i >= 0; i--) {
            if(mass[i] == 0) {
                mass[i] = mass[n - n2];
                mass[n - n2] = 0;
                n2++;
            }
        }
        for(int i : mass) {
            System.out.print(i + ", ");
        }
    }
}
