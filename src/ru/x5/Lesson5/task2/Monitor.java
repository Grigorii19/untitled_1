package ru.x5.Lesson5.task2;

public class Monitor extends ComponentFactory implements ComponentsPC {
    private String name;

    public Monitor() {
    }

    public Monitor(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Monitor: name - " + name + ";";
    }

    public void output() {
        System.out.println(toString());
    }
}