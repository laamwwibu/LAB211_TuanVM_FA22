/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0061;

/**
 *
 * @author VICTUS
 */
public class Main {
    public static void displayResult(Triagle triagle, Rectangle rectangle, Circle circle) {
        triagle.printResult();
        rectangle.printResult();
        circle.printResult();
    }
    public static void main(String[] args) {
        GetInput getData = new GetInput();
        Rectangle rectangle = getData.inputRectangle();
        Circle circle = getData.inputCircle();
        Triagle trigle = getData.inputTriangle();
        displayResult(trigle, rectangle, circle);
    }
}
