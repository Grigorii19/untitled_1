package ru.x5.Lesson3.task2;

public class Horse extends Animal {
    private String animal, name;
    private int age;

    public void sHorse(String animal, String name, int age) {
        this.animal = animal;
        this.name = name;
        this.age = age;
    }

    public Horse(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise(String animal) {

        System.out.println(animal + " лягается");
    }

    @Override
    public void eat(String animal) {

        System.out.println(animal + " ест " + food);
    }
}
