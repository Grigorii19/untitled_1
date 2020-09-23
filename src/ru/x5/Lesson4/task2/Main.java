package ru.x5.Lesson4.task2;

public class Main {

    public static void main(String[] args) {

        Engine engine = new Engine(900,"Mercedes 4A");
        Lorry startLorry = new Lorry("Mercedes E-Class", 6,8, engine, 100);
        Car Merc = new SportCar("Honda", 2, 3,engine, 5);

        startLorry.start();
        startLorry.printInfo();
        Merc.stop();
        Merc.turnLeft();
    }
}