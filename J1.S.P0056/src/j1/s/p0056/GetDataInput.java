/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0056;

import java.util.Scanner;

/**
 *
 * @author VICTUS
 */
public class GetDataInput {

    public int getInt(String msg, String outRangeMsg, String inputEmpty,
            int min, int max) {
        Scanner sc = new Scanner(System.in);
        double intInput;
        String input;
        
        //loop until user enter a positove number in range
        do {
            System.out.print(msg);
            input = sc.nextLine().trim();
            //User enter nothing or whitespace
            if (input.isEmpty()) {
                System.err.println(inputEmpty);
                continue;
            }
            try {
                intInput = Double.parseDouble(input);
                //User enter input out of range
                if (intInput < min || intInput > max) {
                    throw new Error();
                }
                //User enter a real number
                if ((int) intInput != intInput) {
                    throw new Exception();
                } else {
                    break;
                }
            } catch (NumberFormatException StringInput) {
                System.err.println("Input cannot be a string.");
            } catch (Exception RealNumber) {
                System.err.println("Input can not be a real number.");
            } catch (Error OutOfRange) {
                System.err.println(outRangeMsg);
            }
        } while (true);
        return (int) intInput;
    }

    public String getString(String msg, String formatRequireMsg,
            String inputError, String regex) {
        Scanner sc = new Scanner(System.in);
        String input;

        //Loop until user enter string from the keyboard
        do {
            System.out.print(msg);
            input = sc.nextLine().trim();
            //Users didn't enter anything from the keyboard
            if (input.isEmpty()) {
                System.err.println(inputError);
            } else {
                //If regex is empty
                if (regex.isEmpty()) {
                    break;
                }//If input matches regex then break to return string
                else if (input.matches(regex)) {
                    break;
                }//Otherwise, re-input if user's input doesn't matches with regex
                else {
                    System.err.println(formatRequireMsg);
                }
            }
        } while (true);
        return input;
    }

}
