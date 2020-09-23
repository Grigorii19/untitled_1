package ru.x5.Lesson4.task1;

public class Circle implements Shape {

    int shape;

    public void setShape(int shape) {

        this.shape = shape;
    }

    @Override
    public double square() {

        double s = Math.pow(shape / 2, 2) * Math.PI;
        return s;
    }
}