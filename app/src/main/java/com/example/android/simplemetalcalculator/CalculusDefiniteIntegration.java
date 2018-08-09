
package com.example.android.simplemetalcalculator;


import org.apache.commons.math3.analysis.integration.*;
import org.apache.commons.math3.analysis.polynomials.*;
import org.apache.commons.math3.analysis.UnivariateFunction;


public class CalculusDefiniteIntegration {

    public double solve(String upper, String lower, String equation, String degree) {
        
        int deg = Integer.parseInt(degree);
        int upperLim =  Integer.parseInt(upper);
        int lowerLim = Integer.parseInt(lower);

        String[] c = equation.split(" ");
        System.out.println(c.length);
        int a = 0;
        
        double[] coeff = new double[deg+1];
        
        for(int i = deg; i >= 0 ; i--){
            coeff[i] = Double.parseDouble(c[a]);
            a++;
        } 
//        FOR TESTING PURPOSES ONLY 
//        coefficient[0] = 3;
//        coefficient[1] = 2;
//        coefficient[2] = 200;
//        
        PolynomialFunction f = new PolynomialFunction(coeff);
        UnivariateFunction uf = (UnivariateFunction) new PolynomialFunction(coeff);

        RombergIntegrator rombergAlgorithm = new RombergIntegrator();
        
        return rombergAlgorithm.integrate(999999999, uf, lowerLim, upperLim);
    }
    

}
