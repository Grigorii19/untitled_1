package ru.x5.Lesson4.task2;

public class Lorry extends Car {

    private int gruz;

    public Lorry(String brand, int carclass, int weight, Engine engine, int gruz) {
        this.brand = brand;
        this.carclass = carclass;
        this.weight = weight;
        this.engine = engine;
        this.gruz = gruz;
    }

    @Override
    public void start() {
        System.out.println("Грузовик поехал !");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился !");
    }

    @Override
    public void printInfo() {
        System.out.println(brand + " " + carclass + " " + weight + " " + gruz + " " + engine);
    }
}