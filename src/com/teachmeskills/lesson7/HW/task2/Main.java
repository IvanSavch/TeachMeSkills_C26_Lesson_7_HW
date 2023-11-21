package com.teachmeskills.lesson7.HW.task2;

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