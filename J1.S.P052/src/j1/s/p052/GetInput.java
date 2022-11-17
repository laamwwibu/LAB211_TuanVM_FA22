/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p052;

import java.util.Scanner;

/**
 *
 * @author VICTUS
 */
public class GetInput {

    public static final Scanner sc = new Scanner(System.in);

    public int getMenuChoice(String msg, int min, int max) {
        double choice;
        //loop until user enter a positive decimal in range of input
        System.out.print(msg);
        do {

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

    public float getTotalArea(String msg) throws Exception {
        float totalArea = 0;
        System.out.print(msg);
        String input = sc.nextLine().trim();
        if (input.isEmpty()) {
            throw new Exception("Input cannot be empty");
        }
        //user enter a non-float input
        try {
            totalArea = Float.parseFloat(input);
            //user enter area < 0
            if (totalArea < 0) {
                throw new Exception("Input have to be positive");
            }
        } catch (NumberFormatException e) {
            throw new Exception("Input have to be float");
        }
        return totalArea;
    }

    public String getString(String msg) throws Exception {
        String input;
        System.out.print(msg);
        input = sc.nextLine().trim();
        //Users didn't enter anything from the keyboard
        if (input.isEmpty()) {
            throw new Exception("Input cannot be empty");
        } /*[a-zA-Z ]+: Matches any single character from a-z, A-Z and space 
            character in brackets*/
        else if (!input.matches("[a-zA-Z ]+")) {
            throw new Exception("Input cannot be a number or special character");
        } else {
            return input;
        }
    }
}
