/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0050;

/**
 *
 * @author VICTUS
 */
public class Validate {

    public boolean isOdd(double number) {
        return number % 2 != 0;
    }

    public boolean isSquareNumber(double number) {
        return (int) Math.sqrt(number) * (int) Math.sqrt(number) == number;
    }
}
