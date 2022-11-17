/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0011;

import java.math.BigInteger;

/**
 *
 * @author VICTUS
 */
public class Covert {
    GetInput getData = new GetInput();
    
    public String convertValue(int baseInput, int baseOutput, String inputValue) {
        String result;
        //check base in and base out is same base
        if (baseInput == baseOutput) {
            return inputValue;
        } 
        else if(baseInput == 10 && baseOutput != 10){
            result = convertFromDecToOtherBase(inputValue, baseOutput);
            return result;
        }
        else if(baseInput != 10 && baseOutput == 10){
            result = convertOthersToDec(inputValue, baseInput);
            return result;
        }else{
            result = convertOthersToDec(inputValue, baseInput);
            result = convertFromDecToOtherBase(result, baseOutput);
            return result;
        }
    }
    
    public String convertOthersToDec(String inputValue, int outputBase) {
        String Letter = "0123456789ABCDEF";
        inputValue = inputValue.toUpperCase();
        BigInteger base = new BigInteger(Integer.toString(outputBase));
        BigInteger result = BigInteger.ZERO;
        //tranverse from the first element to last element of input value
        for (int i = 0; i < inputValue.length(); i++) {
            BigInteger cofficient = new BigInteger(Integer.toString(Letter.indexOf(inputValue.charAt(i))));
            //1010 = 1*2^3 + 0*2^2 + 1*2^1 + 0*2^0
            result = result.add(cofficient.multiply(base.pow(inputValue.length() - 1 -i)));
        }
        return result.toString();
    }
    
    private String convertFromDecToOtherBase(String result, int baseOutput) {
        BigInteger dec = new BigInteger(result);
        BigInteger zero = BigInteger.ZERO;
        BigInteger base = new BigInteger(Integer.toString(baseOutput));
        result = "";
        while (dec.compareTo(zero) != 0) {
            BigInteger remainder = dec.mod(base);
            //check number less than 10, if less than 10 add to string
            if (remainder.intValue() < 10) {
                result =  result + Integer.toString(remainder.intValue());
//                System.out.println(result);
            } else {
                switch (remainder.intValue()) {
                    case 10:
                        result += "A";
                        break;
                    case 11:
                        result += "B";
                        break;
                    case 12:
                        result += "C";
                        break;
                    case 13:
                        result += "D";
                        break;
                    case 14:
                        result += "E";
                        break;
                    case 15:
                        result += "F";
                        break;
                }
            }
            dec = dec.divide(base);
        }
        StringBuilder stringReverse = new StringBuilder(result);
        result = new String(stringReverse.reverse());
        return result;
    }    
}
