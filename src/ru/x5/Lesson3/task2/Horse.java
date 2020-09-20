package ru.x5.Lesson3.task2;

public class Horse extends Animal {

    public String animal, name;
    public int age;

    public Horse(String food, String location, String animal, String name, int age) {
        super(food, location);
        this.animal = animal;
        this.name = name;
        this.age = age;
    }

    @Override
    public void makeNoise(String animal) {

        System.out.println(animal + " - лягается");
    }

    @Override
    public void eat(String animal) {

        System.out.println(animal + " - ест " + food);
    }
}
