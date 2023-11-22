package com.teachmeskills.lesson7.HW.task2;


/**
 * Task 2:
 * Write the hierarchy of the classes Shape, Triangle, Rectangle, Circle.
 * Implement a function for calculating the area for each type of figure and calculating the perimeter (using abstract class/methods).
 * Create an array of 5 different shapes.
 * Loop through the array and display information about each shape.
 * Display the sum of the perimeters of all shapes in the array.
 */
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        Figure[] figures = new Figure[5];
        figures[0] = new Circle(54);
        figures[1] = new Rectangle(54, 23);
        figures[2] = new Triangle(14, 16, 11);
        figures[3] = new Circle(11);
        figures[4] = new Triangle(-1, 11, 11);

        for (int i = 0; i < figures.length; i++) {
            if (figures[i].printPerimeter() > 0) {
                sum = sum + figures[i].printPerimeter();
            }

        }
        System.out.println("sum of P " + sum);
    }
}
