package ru.x5.Lesson4.task2;

public abstract class Car {

    protected String brand; // Марка автомобиля
    protected int carclass, weight; // Класс автомобиля; Вес.
    protected Engine engine; // Мотор типа Engine

    public abstract void start();

    public abstract void stop();

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    protected abstract void printInfo();
}