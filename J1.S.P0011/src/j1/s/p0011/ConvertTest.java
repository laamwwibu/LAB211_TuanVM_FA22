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
public class ConvertTest {
    public String convertValue(int inputBase, int outputBase, String inputValue) {
        String result = null;
        //inputBase equals to outputBase
        if(inputBase == outputBase) {
            return result;
        }
        //input base is 10, output base is 16 or 2
        else if(inputBase == 10 && outputBase != 10) {
            result = convertDecToOthers(outputBase, inputValue);
            return result;
        } 
        //inputBase is 16 or 2 and outpurBase is 10
        else if(inputBase != 10 && outputBase == 10) {
            result = convertOthersToDec(inputBase, inputValue);
            return result;
        }
        //input and output base is not 10
        else {
            result = convertOthersToDec(inputBase, inputValue);
            result = convertDecToOthers(outputBase, result);
            return result;
        }
    }   

    private String convertOthersToDec(int inputBase, String inputValue) {
        inputValue.toUpperCase();
        String Letters = "0123456789ABCDEF";
        BigInteger result = BigInteger.ZERO;
        BigInteger base = new BigInteger(Integer.toString(inputBase));
        //tranverse from the first element to last element of inputValue 
        for (int i = 0; i < inputValue.length(); i++) {
            BigInteger coefficient = new BigInteger(Integer.toString(Letters.indexOf(Letters.charAt(i))));
            //1010 = 1*2^3 + 0*2^2 + 1*2^1 + 0*2^0
            result = result.add(coefficient.multiply(base.pow(inputValue.length() - 1 - i)));
        }
        return result.toString();
    }

    private String convertDecToOthers(int outputBase, String result) {
        BigInteger dec = new BigInteger(result);
        BigInteger zero = BigInteger.ZERO;
        BigInteger base = new BigInteger(Integer.toString(outputBase));
        
        while(dec.compareTo(zero) != 0) {
            BigInteger remainder = dec.mod(base);
            if(remainder.intValue() < 10) {
                result = result + Integer.toString(remainder.intValue());
            }
            else {
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
        StringBuilder s = new StringBuilder(result);
        result = new String(s.reverse());
        return result;
    }
    
    
}
