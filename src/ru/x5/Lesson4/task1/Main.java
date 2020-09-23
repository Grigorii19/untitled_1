/* 1.Создать интерфейс Shape с методом square, который возвращает площадь фигуры.
        2.Создать классы: Circle, Triangle, Rectangle реализующие этот интерфейс
        3.Метод main  должен выглядеть так:
public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Triangle();
        shape[1] = new Circle();
        shape[2] = new Rectangle();
        for (Shape sh: shape){
        System.out.println("Площадь фигуры: "+sh.square());
        }
        }
*/
package ru.x5.Lesson4.task1;

public class Main {

    public static void main(String[] args) {

        Shape[] shape = new Shape[3];
        shape[0] = new Triangle();
        shape[1] = new Circle();
        shape[2] = new Rectangle();

        for (Shape shp : shape) {
            System.out.println("Площадь фигуры: " + shp.square());
        }
    }
}
