/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0050;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author VICTUS
 */
public class EquationCalculator {

    public List<Float> calculateEquation(float a, float b) {
        List<Float> result = new ArrayList<>();
        if(a == 0) {
            if(b==0) {
                return Collections.EMPTY_LIST;
            } else {
                return null;
            }
        } else {
            result.add(-b / a);
            return result;
        }
    }

    public List<Float> calculateQuadricEquation(float a, float b, float c) {
        List<Float> result = new ArrayList<>();
        if(a == b && b == c) {
            return Collections.EMPTY_LIST;
        }
        //calculate delta = b^2 -4ac
        float delta = b * b - 4 * a * c;
        if (delta > 0) {
            result.add((float) ((-b + Math.sqrt(delta)) / (2 * a)));
            result.add((float) ((-b - Math.sqrt(delta)) / (2 * a)));
        } else if (delta == 0) {
            result.add(-b / (2 * a));
            result.add(-b / (2 * a));
        } else {
            return null;
        }
        return result;
    }

}
