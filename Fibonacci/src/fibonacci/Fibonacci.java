/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author VICTUS
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Step 1: Find Fibonacci number using recursion
        int[] storeFibonacci = new int[45];
        findFibonacci(storeFibonacci, 44);
        //Step 2: Display the 45 Fibonacci sequence 
        displaySequence(storeFibonacci, 44);
    }

    private static int findFibonacci(int[] storeFibonacci, int terms) {
        //base cases of Fibonacci
        if(terms <= 1) {
            storeFibonacci[terms] = terms;
            return storeFibonacci[terms];
        }
        //if terms value is not 0 than return value at certain term
        if(storeFibonacci[terms] != 0) {
            return storeFibonacci[terms];
        }
        //value of next Fibonacci number is sum of 2 preceding Fibonacci number
        storeFibonacci[terms] = findFibonacci(storeFibonacci, terms - 1)
                + findFibonacci(storeFibonacci, terms - 2);
        return storeFibonacci[terms];
    }

    private static void displaySequence(int[] storeFibonacci, int terms) {
        for (int i = 0; i <= terms; i++) {
            System.out.print(storeFibonacci[i]);
//            System.out.print("Number " + (i+1) + "\t");
//            System.out.print(storeFibonacci[i] + "\n");
            if(i < terms) {
                System.out.print(", ");
            }
        }
    }
    
}
