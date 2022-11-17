/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0061;

import java.util.Scanner;

/**
 *
 * @author VICTUS
 */
public class GetInput {

    public double getDouble(String msg) {
        double output;
        String input;
        do {
            System.out.print(msg);
            Scanner sc = new Scanner(System.in);
            input = sc.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Input can not be empty");
            }
            try {
                output = Double.parseDouble(input);
                if(output < 0) {
                    throw new Exception();
                }
                return output;
            } catch (NumberFormatException StringInput) {
                System.out.println("Input can not be string");
            } catch (Exception negativeInput) {
                System.out.println("Input cannot be negative");
            }
        } while (true);
    }

    public Triagle inputTriangle() {
        while (true) {
            double sideA = getDouble("Enter side A: ");
            double sideB = getDouble("enter side B: ");
            double sideC = getDouble("Enter side C: ");
            //condition for a triagle is sum of any 2 side have to be larger than the other
            if (sideA + sideB > sideC && sideA + sideC > sideB && sideC + sideB > sideA) {
                Triagle triagle = new Triagle(sideA, sideB, sideC);
                return triagle;
            } else {
                System.out.println("Sum of any 2 side have to be larger than the other"
                        + "to form a triagle");
            }
        }
    }
    
    public Rectangle inputRectangle() {
        while (true) {
            double width = getDouble("Enter width: ");
            double lenght = getDouble("enter lenght: ");
            Rectangle rectangle = new Rectangle(width, lenght);
            return rectangle;
        }
    }
    
    public Circle inputCircle() {
        while (true) {            
            double radius = getDouble("Enter radius: ");
            Circle circle = new Circle(radius);
            return circle;
        }
    }
}
