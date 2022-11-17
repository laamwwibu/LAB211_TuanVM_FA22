/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0050;

import java.util.Scanner;

/**
 *
 * @author VICTUS
 */
public class GetInput {

    public int getMenuChoice(String msg, int min, int max) {
        double choice;
        String input;

        do {
            System.out.print(msg);
            Scanner sc = new Scanner(System.in);
            input = sc.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Input can not be empty");
            }
            try {
                choice = Double.parseDouble(input);
                //out of range
                if (choice < min || choice > max) {
                    throw new Error();
                }
                //real number
                if ((int) choice == choice) {
                    return (int) choice;
                } else {
                    System.out.println("Input can not be real number");
                }
            } catch (NumberFormatException StringInput) {
                System.out.println("Input can not be string");
            } catch (Error OutOfRange) {
                System.out.println("input out of range [" + min + "-" + max + "]");
            }
        } while (true);
    }

    public float getFloat(String msg) {
        float output;
        String input;
        do {
            System.out.print(msg);
            Scanner sc = new Scanner(System.in);
            input = sc.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Input can not be empty");
            }
            try {
                output = Float.parseFloat(input);
                return output;
            } catch (NumberFormatException StringInput) {
                System.out.println("Input can not be string");
            }
        } while (true);
    }
}
