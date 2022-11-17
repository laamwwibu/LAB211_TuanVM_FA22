/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

import static java.lang.System.exit;

/**
 *
 * @author VICTUS
 */
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        GetInput getInput = new GetInput();
        Calculator calculator = new Calculator();
        while (true) {
            //Step 1: Display menu of program's funtion
            manager.diplayMenu();
            //Step 2: User enter their choice
            int choice = getInput.getMenuChoice("Your choice: ", 1, 3);
            //Step 3: program perform funtion based on user choice
            switch (choice) {
                //user input element of the array
                case 1: {
                    manager.displayHeader(choice);
                    calculator.NormalCalculator();
                    break;
                }
                //sort the array ascendingly
                case 2: {
                    manager.displayHeader(choice);
                    calculator.BMICalculator();
                    break;
                }
                //exit the program
                case 3: {
                    exit(0);
                    break;
                }
            }
        }
    }
}
