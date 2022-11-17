/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0011;

import static java.lang.System.exit;

/**
 *
 * @author VICTUS
 */
public class Main {

    public static void main(String[] args) {
        GetInput getData = new GetInput();
        Covert converter = new Covert();
        Display display = new Display();
        while (true) {
            //1. User choose base of input number
            int inputBase = getData.getBase("Enter input base: ");
            //2. User enter value of input number
            String inputValue = getData.getInputValue(inputBase);
            //3. User enter base of output number
            int outputBase = getData.getBase("Enter output base: ");
            //4. convert base of inputValue to base of output
            String result = converter.convertValue(inputBase, outputBase, inputValue);
            //5. Display output vavlue
            display.displayResult(result);
            //6. user enter Yes or No to continue or terminate the program
            if(!getData.checkYesNo()) {
                exit(0);
            }
        }
    }

}
