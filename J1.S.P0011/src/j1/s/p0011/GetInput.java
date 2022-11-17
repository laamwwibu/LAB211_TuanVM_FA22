/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0011;

import java.util.Scanner;

/**
 *
 * @author VICTUS
 */
class GetInput {

    public int getBase(String msg) {
        double base;
        //loop until user enter a positive decimal in range of input
        do {
            System.out.print(msg);
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine().trim();
            //user enter nothing or whitespace
            if (input.isEmpty()) {
                System.out.println("Input can not be empty");
                continue;
            }
            try {
                base = Double.parseDouble(input);
                //user enter a real number
                if ((int) base != base) {
                    System.out.println("Input can not be a real number");
                    continue;
                }
                //user enter a number that is not base 2, 10 or 16
                if ((int) base == 2 || (int) base == 10 || (int) base == 16) {
                    return (int) base;
                } else {
                    System.out.println("Base have to be 2, 10 or 16");
                    continue;
                }
            } //user enter a string
            catch (NumberFormatException StringInput) {
                System.out.println("Input can not be a string");
            }
        } while (true);
    }

    public static int getChoice() {
        double choice;
        int min = 1;
        int max = 4;
        //loop until user enter a positive decimal in range of input
        do {
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

    public String getInputValue(int inputBase) {
        /* Regex
        ^: Matches the begining of string
        [a-f]: Matches a character from a to f
        [A-F]: Matches a character from A to F
        [0-9]: Matches a character from 0 to 9
        n+: Matches at least one char n
        $: Matches at end of string
         */
        String inputValue;
        String regexBase = null;

        switch (inputBase) {
            case 2:
                regexBase = "^[0-1]+$";
                break;
            case 10:
                regexBase = "^[0-9]+$";
                break;
            case 16:
                regexBase = "^[a-fA-F0-9]+$";
        }

        System.out.println("Enter value you want to change base: ");
        do {
            Scanner sc = new Scanner(System.in);
            inputValue = sc.nextLine().trim();
            if (inputValue.isEmpty()) {
                System.out.println("Input can not be empty");
                System.out.print("Enter again: ");
            } else {
                if (inputValue.matches(regexBase)) {
                    return inputValue.toUpperCase();
                } else {
                    System.out.println("Input value form is incorrect");
                }
            }
        } while (true);
    }
    
    public boolean checkYesNo() {
        Scanner in = new Scanner(System.in);
        System.out.println("Press \"Y\" to continue,"
                + " press \"N\" to exit.");
        System.out.print("Enter your choice: ");
        while (true) {
            String str = in.nextLine();
            if (!str.isEmpty()) {
                str = str.replaceAll(" ", "");
                if (str.compareToIgnoreCase("Y") == 0 || str.compareToIgnoreCase("y") == 0) {
                    return true;
                }
                if (str.compareToIgnoreCase("N") == 0 || str.compareToIgnoreCase("n") == 0) {
                    return false;
                }
                System.out.print("You must choose Yes(Y) or No(N)!\nEnter again: ");
            } else {
                System.out.print("Choice can not empty, enter again: ");
            }
        }
    }
}

