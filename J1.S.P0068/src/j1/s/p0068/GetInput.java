/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0068;

import java.util.Scanner;

/**
 *
 * @author VICTUS
 */
public class GetInput {

    public static final Scanner sc = new Scanner(System.in);

    public float getFloat(String msg) {
        String input;
        
        while (true) {
            System.out.println(msg);
            input = sc.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Input cannot be blank");
            }
            try {
                float output = Float.parseFloat(input);
                if (output < 0 || output > 100) {
                    throw new Exception();
                } else {
                    return output;
                }

            } catch (NumberFormatException StringInput) {
                System.out.println("Input cannot be string");
            } catch (Exception OutOfRange) {
                System.out.println("Input is >= 0 or <= 100");
            }
        }
    }

    public String getString(String msg) {
        String input;
        
        while (true) {
            System.out.println(msg);
            input = sc.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Input cannot be blank");
            } else {
                return input;
            }
        }
    }

    public boolean getYesNo() {
        String input;
        
        while (true) {
            System.out.println("Do you want to continue?");
            input = sc.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Input cannot be empty");
            }
            if (input.equalsIgnoreCase("Y")) {
                return true;
            }
            if (input.equalsIgnoreCase("N")) {
                return false;
            }
        }
    }
}
