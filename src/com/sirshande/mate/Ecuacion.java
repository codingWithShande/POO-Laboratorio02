/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sirshande.mate;

/**
 *
 * @author Administrator
 */
public class Ecuacion {
 
   private double[] coeficientes;

    public Ecuacion(double[] coeficientes) {
        if (coeficientes.length != 3) {
            throw new IllegalArgumentException("El arreglo de coeficientes debe tener exactamente 3 elementos.");
        }
        this.coeficientes = coeficientes;
    }

    public double resolver(double x) {
        if (coeficientes.length != 3) {
            throw new IllegalStateException("La ecuación no tiene tres coeficientes.");
        }
        double a = coeficientes[0];
        double b = coeficientes[1];
        double c = coeficientes[2];
        return a * x * x + b * x + c;
    }
}
