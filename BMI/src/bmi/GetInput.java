/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

import java.util.Scanner;

/**
 *
 * @author VICTUS
 */
class GetInput {

    public int getMenuChoice(String msg, int min, int max) {
        double choice;
        //loop until user enter a positive decimal in range of input
        do {
            System.out.print(msg);
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine().trim();
            try {
                //user enter nothing or whitespace
                if (input.isEmpty()) {
                    System.out.println("Input can not be empty");
                    continue;
                }
                choice = Double.parseDouble(input);
                //user input a number out of range
                if (choice < min || choice > max) {
                    System.out.println("Input out of range");
                }
                //user enter a real number
                if ((int) choice != choice) {
                    System.out.println("Input can not be a real number");
                    continue;
                } //if not return int value 
                else {
                    return (int) choice;
                }
            } //user enter a string
            catch (NumberFormatException StringInput) {
                System.out.println("Input can not be a string");
            }
        } while (true);
    }
    
    public double getDouble(String msg) {
        double doubleInput = 0;
        do {
           System.out.print(msg);
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine().trim();
            try {
                //user enter nothing or whitespace
                if (input.isEmpty()) {
                    System.out.println("Input can not be empty");
                }
                doubleInput = Double.parseDouble(input);
                return doubleInput;
            } //user enter a string
            catch (NumberFormatException StringInput) {
                System.out.println("Input can not be a string");
            }
        } while (true);
    }
    
    public double getWeight(String msg) {
        double weight = 0;
        //loop until user enter a positive decimal in range of input
        do {
            System.out.print(msg);
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine().trim();
            try {
                //user enter nothing or whitespace
                if (input.isEmpty()) {
                    System.out.println("Input can not be empty");
                    continue;
                }
                weight = Double.parseDouble(input);
                if(weight <= 0 ) {
                    System.out.println("Input can not be negative or zero");
                }
                return weight;
            } //user enter a string
            catch (NumberFormatException StringInput) {
                System.out.println("Input can not be a string");
            }
        } while (true);
    }
    
    public double getHeight(String msg) {
        double height = 0;
        //loop until user enter a positive decimal in range of input
        do {
            System.out.print(msg);
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine().trim();
            try {
                //user enter nothing or whitespace
                if (input.isEmpty()) {
                    System.out.println("Input can not be empty");
                    continue;
                }
                height = Double.parseDouble(input);
                if(height <= 0 ) {
                    System.out.println("Input can not be negative or zero");
                }
                return height * 0.01;
            } //user enter a string
            catch (NumberFormatException StringInput) {
                System.out.println("Input can not be a string");
            }
        } while (true);
    }
    
    public String getOperator(String msg) {
        System.out.print(msg);
        do {          
            
            Scanner sc = new Scanner(System.in);
            String operator = sc.nextLine().trim();
            //user enter nothing or whitespace
            if (operator.isEmpty()) {
                System.out.println("Input can not be empty");
                continue;
            }
            if(operator.equalsIgnoreCase("+") || operator.equalsIgnoreCase("-") ||
                    operator.equalsIgnoreCase("*") || operator.equalsIgnoreCase("/") ||
                    operator.equalsIgnoreCase("^") || operator.equalsIgnoreCase("=")) {
                return operator;
            } else {
                System.out.println("Please input (+,-,*,/,^,=)");
            }
        } while (true);
    }
}
