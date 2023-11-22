package com.teachmeskills.lesson7.HW.task1;

import java.util.Scanner;


/**
 *Task 1:
 * Create classes "Director", "Worker", "Accountant".
 * Implement an interface with a method that specifies the behavior for displaying the title position.
 * Implement this method in the generated classes.
 * Create a runner class using the Main method to run the program.
 * Request the job code from the console and display the job title on the screen.
 */
public class Runner {
    public static void printMenu() {
        System.out.println("1. Director" + "\n" +
                "2. Worker" + "\n" +
                "3. Accountant");
    }

    public static void main(String[] args) {
        printMenu();
        Scanner scanner = new Scanner(System.in);

        int code = scanner.nextInt();
        switch (code) {
            case 1:
                Director director = new Director();
                director.printJobTitle();
                break;
            case 2:
                Worker worker = new Worker();
                worker.printJobTitle();
                break;
            case 3:
                Accountant accountant = new Accountant();
                accountant.printJobTitle();
                break;
            default:
                System.out.println("wrong input");
        }
    }
}
