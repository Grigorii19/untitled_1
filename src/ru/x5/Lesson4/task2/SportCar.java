package ru.x5.Lesson4.task2;

public class SportCar extends Car {
    private int drive;

    public SportCar(String brand, int carclass, int weight, Engine engine,int drive) {
        this.brand = brand;
        this.carclass = carclass;
        this.weight = weight;
        this.engine = engine;
        this.drive = drive;
    }

    @Override
    public void start() {
        System.out.println("SportCar поехал");
    }

    @Override
    public void stop() {
        System.out.println("SportCar остановился");
    }

    @Override
    public void printInfo() {
        System.out.println(brand + " " + carclass + " " + weight + " " + engine + " " + drive);
    }
}
