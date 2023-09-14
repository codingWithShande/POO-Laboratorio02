/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sirshande.mate;

/**
 *
 * @author Administrator
 */
public class Math {
    public static double pow(double base, double exponente) {
        return java.lang.Math.pow(base, exponente);
    }

    public static double sqrt(double valor) {
        return java.lang.Math.sqrt(valor);
    }

    public static double sqrtMejorado(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo.");
        }
        return java.lang.Math.sqrt(valor);
    }
    
}
