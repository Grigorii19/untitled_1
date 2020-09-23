package ru.x5.Lesson4.task2;

public class Engine {

    private int power; // Мощность
    private String maker; // Производитель

    public Engine(int power, String maker) {
        this.power = power;
        this.maker = maker;
    }

    @Override
    public String toString() {
        return "\nДвигатель: Мощность = " + power + "; \n           Производитель = " + maker;
    }
}
