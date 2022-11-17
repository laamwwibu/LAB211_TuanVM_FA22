/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0050;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VICTUS
 */
public class Display {

    public void displaySuperlativeResult(List<Float> result) {

        if (result == null) {
            System.out.print("No solution");
        } else if (result.isEmpty()) {
            System.out.print("Infinitely many solution");
        } else {
            System.out.printf("Solution: x = %.3f", result.get(0));
        }

    }

    public void displayEvenOddPerfectSquare(
            float a, float b, List<Float> result) {
        Validate validator = new Validate();
        List<Float> oddNumbers = new ArrayList<>();
        List<Float> evenNumbers = new ArrayList<>();
        List<Float> squareNumbers = new ArrayList<>();
        //a is odd
        if (validator.isOdd(a)) {
            oddNumbers.add(a);
        } else { //a is even
            evenNumbers.add(a);
        }

        //b is odd
        if (validator.isOdd(b)) {
            oddNumbers.add(b);
        } else { //b is even
            evenNumbers.add(b);
        }

        //a is perfect square
        if (validator.isSquareNumber(a)) {
            squareNumbers.add(a);
        }
        //b is perfect square
        if (validator.isSquareNumber(b)) {
            squareNumbers.add(b);
        }
        //result is perfect square
        if (result != null) {
            for (int i = 0; i < result.size(); i++) {
                if (validator.isSquareNumber(result.get(i))) {
                    squareNumbers.add(result.get(i));
                } else if (validator.isOdd(result.get(i))) {
                    oddNumbers.add(result.get(i));
                } else {
                    evenNumbers.add(result.get(i));
                }
            }
        }

        //display odd numbers 
                System.out.print("\nNumber is Odd:");
        if (oddNumbers.isEmpty()) {
            System.out.print("none");
        } else {
            for (int i = 0; i < oddNumbers.size(); i++) {
                System.out.print(oddNumbers.get(i));
                if (i < oddNumbers.size() - 1) {
                    System.out.print(", ");
                }
            }
        }
        System.out.print("\nNumber is Even:");
        //display even numbers 
        if (evenNumbers.isEmpty()) {
            System.out.print("none");
        } else {
            for (int i = 0; i < evenNumbers.size(); i++) {
                System.out.print(evenNumbers.get(i));
                if (i < evenNumbers.size() - 1) {
                    System.out.print(", ");
                }
            }
        }
        System.out.print("\nNumber is Perfect Square:");
        //display square numbers 
        if (squareNumbers.isEmpty()) {
            System.out.print("none");
        } else {
            for (int i = 0; i < squareNumbers.size(); i++) {
                System.out.print(squareNumbers.get(i));
                if (i < squareNumbers.size() - 1) {
                    System.out.print(", ");
                }
            }
        }
    }

    public void displayQuadricResult(List<Float> result) {
        if (result == null) {
            System.out.print("No Solution");
        } else if (result.isEmpty()) {
            System.out.print("Infinitely many solution");
        } else {
            System.out.printf("Solution: x1 = %.3f", result.get(0));
            System.out.print(" and ");
            System.out.printf("x2 = %.3f", result.get(0));
        }
    }

    public void displayEvenOddPerfectSquare(
            float a, float b, float c, List<Float> result) {
        Validate validator = new Validate();
        List<Float> oddNumbers = new ArrayList<>();
        List<Float> evenNumbers = new ArrayList<>();
        List<Float> squareNumbers = new ArrayList<>();
        //a is odd
        if (validator.isOdd(a)) {
            oddNumbers.add(a);
        } else { //a is even
            evenNumbers.add(a);
        }

        //b is odd
        if (validator.isOdd(b)) {
            oddNumbers.add(b);
        } else { //b is even
            evenNumbers.add(b);
        }
        if (validator.isOdd(c)) {
            oddNumbers.add(c);
        } else {
            evenNumbers.add(c);
        }

        //a is perfect square
        if (validator.isSquareNumber(a)) {
            squareNumbers.add(a);
        }
        //b is perfect square
        if (validator.isSquareNumber(b)) {
            squareNumbers.add(b);
        }
        //result is perfect square
        if (result != null) {
            for (int i = 0; i < result.size(); i++) {
                if (validator.isSquareNumber(result.get(i))) {
                    squareNumbers.add(result.get(i));
                } else if (validator.isOdd(result.get(i))) {
                    oddNumbers.add(result.get(i));
                } else {
                    evenNumbers.add(result.get(i));
                }
            }
        }

        //display odd numbers 
        System.out.print("\nNumber is Odd:");
        if (oddNumbers.isEmpty()) {
            System.out.print("none");
        } else {
            for (int i = 0; i < oddNumbers.size(); i++) {
                System.out.print(oddNumbers.get(i));
                if (i < oddNumbers.size() - 1) {
                    System.out.print(", ");
                }
            }
        }
        System.out.print("\nNumber is Even:");
        //display even numbers 
        if (evenNumbers.isEmpty()) {
            System.out.print("none");
        } else {
            for (int i = 0; i < evenNumbers.size(); i++) {
                System.out.print(evenNumbers.get(i));
                if (i < evenNumbers.size() - 1) {
                    System.out.print(", ");
                }
            }
        }
        System.out.print("\nNumber is Perfect Square:");
        //display square numbers 
        if (squareNumbers.isEmpty()) {
            System.out.print("none");
        } else {
            for (int i = 0; i < squareNumbers.size(); i++) {
                System.out.print(squareNumbers.get(i));
                if (i < squareNumbers.size() - 1) {
                    System.out.print(", ");
                }
            }
        }
    }
}
