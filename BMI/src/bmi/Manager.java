/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

/**
 *
 * @author VICTUS
 */
class Manager {
    public void diplayMenu() {
        System.out.println("======= Calculator Program =======");
        System.out.println("1. Normal calculator");
        System.out.println("2. BMI Calculator");
        System.out.println("3. Exit");
    }
    
    public void displayHeader(int choice) {
        switch (choice) {
            case 1:
                System.out.println("----- Normal Calculator -----");
                break;
            case 2:
                System.out.println("----- BMI Calculator -----");
                
        }
    }
    
    public void displayBMIStutus(double BMI) {
        System.out.printf("BMI Number: %.2f\n", BMI);
        System.out.print("BMI Status: ");
        if(BMI <= 19)
            System.out.println("Under-standard");
        else if(BMI <= 25)
            System.out.println("Standard");
        else if(BMI <= 30)
            System.out.println("Overweight");
        else if(BMI <= 40)
            System.out.println("Fat - should lose weight ");
        else
            System.out.println("Very fat - should lose weight immediately"); 
    }
}
