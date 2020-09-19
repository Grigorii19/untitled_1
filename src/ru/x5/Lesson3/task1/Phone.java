package ru.x5.Lesson3.task1;

import java.util.Arrays;

public class Phone {

    private int number, weight;
    private String model;

    public Phone(int number, String model, int weight) { //Конструктор с 3 параметрами. Вызван конструктор с 2мя параметрами.
        this(number, model);
        this.weight = weight;
    }

    public Phone(int number, String model) { //Конструктор с 2 параметрами
        this.number = number;
        this.model = model;
    }

    public Phone() { //Пустой конструктор
    }

    public void receiveCall(String name) {  //Метод receiveCall с именем звонящего.
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, int number) {   //Перегруженный метод receiveCall.
        System.out.println("Звонит " + name + " с номера " + number);
    }

    public int getNumber() { //Метод возвращает номер телефона
        return number;
    }

    public void sendMessage(int... number) { //Метод с аргументом переменной среды.
        System.out.println(Arrays.toString(number));

    }
}