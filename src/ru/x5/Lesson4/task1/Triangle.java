package ru.x5.Lesson4.task1;

public class Triangle implements Shape {

    int shape;

    public void setShape(int shape) {

        this.shape = shape;
    }

    @Override
    public double square() {

        double s = shape * shape / 2;
        return s;
    }
}
