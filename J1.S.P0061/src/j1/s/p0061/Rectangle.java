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
public class Rectangle implements Shape{
    double width;
    double length;

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.length = lenght;
    }

    @Override
    public void printResult() {
        System.out.println("Width: " + width);
        System.out.println("Length: " + length);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }

    @Override
    public double getPerimeter() {
        return (width + length) * 2;
    }

    @Override
    public double getArea() {
        return width * length;
    }
    
    
}
