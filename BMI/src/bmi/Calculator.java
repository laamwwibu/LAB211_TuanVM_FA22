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
class Calculator {
    
    void NormalCalculator() {
        GetInput getData = new GetInput();
        double num1 = getData.getDouble("Enter Number: ");
        double memory = num1;
        while (true) {            
            String operator = getData.getOperator("Enter Operator: ");
            
            if (operator.equalsIgnoreCase("=")) {
                System.out.printf("Result: %.2f\n", memory);
                return;
            }
            
            double num2 = getData.getDouble("Enter Number: ");
            memory = Calculate(memory, operator, num2);
            if(checkDivideByZero(memory)) {
                return;
            } else {
                System.out.printf("Memory: %.2f\n", memory);
            }
        }
        
    }
    
    private double Calculate(double num1, String operator, double num2) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            case "^":
                return Math.pow(num1, num2);
        }
        return 999;
    }
    
    public boolean checkDivideByZero(double memory) {
        try {
            if(Double.isInfinite(memory)) {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException DivideByZero) {
            System.out.println("Can not devide by zero");
            return true;
        }
        return false;
    }
    
    public void BMICalculator() {
        GetInput getData = new GetInput();
        double weight = getData.getWeight("Enter Weight(kg): ");
        double height = getData.getHeight("Enter Height(cm): ");
        double BMI = BMICalculate(weight, height);
        Manager manager = new Manager();
        manager.displayBMIStutus(BMI);
    }
    
    public double BMICalculate(double weight, double height) {
        return weight / (height * height);
    }
    
    
}
