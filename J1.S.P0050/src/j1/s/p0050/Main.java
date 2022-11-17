/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0050;

import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VICTUS
 */
public class Main {

    public static void displayMenu() {
        System.out.println("1. Calculate Superlative Equation");
        System.out.println("2. Calculate Quadratic Equation");
        System.out.println("3. Exit");
    }

    public static void displayHeader(int choice) {
        switch (choice) {
            case 1:
                System.out.println("======== Calcute Equation ========");
                break;
            case 2:
                System.out.println("======== Calcute Quadratic Equation ========");
                break;
        }
    }

    public static void main(String[] args) {
        GetInput getData = new GetInput();
        List<Float> result;
        EquationCalculator equation = new EquationCalculator();
        Display display = new Display();

        //1. display menu
        displayMenu();
        //2. user enter their choice
        int choice = getData.getMenuChoice("Enter your choice: ", 1, 3);
        //3. program perform functio based on user choice
        switch (choice) {
            case 1: {
                displayHeader(choice);
                float a = getData.getFloat("Enter A: ");
                float b = getData.getFloat("Enter B: ");
                result = equation.calculateEquation(a, b);
                display.displaySuperlativeResult(result);
                display.displayEvenOddPerfectSquare(a, b, result);
                break;
            }

            case 2: {
                displayHeader(choice);
                float a = getData.getFloat("Enter A: ");
                float b = getData.getFloat("Enter B: ");
                float c = getData.getFloat("Enter C: ");
                result = equation.calculateQuadricEquation(a, b, c);
                display.displayQuadricResult(result);
                display.displayEvenOddPerfectSquare(a, b, c, result);
                break;
            }
            case 3:
                exit(0);

        }
    }
}
