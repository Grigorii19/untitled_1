package ru.x5.Lesson4.task1;

class Rectangle implements Shape {

    int shape;

    public void setShape(int shape) {

        this.shape = shape;
    }

    @Override
    public double square() {

        shape = shape * shape;
        return shape;
    }
}