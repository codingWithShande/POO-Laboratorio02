/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sirshande.mate;

import javax.swing.*;

/**
 *
 * @author Administrator
 */
public class MainMath {
    public static void main(String[] args) {

            double a = Double.parseDouble(JOptionPane.showInputDialog("Introduce el coeficiente 'a':"));
            double b = Double.parseDouble(JOptionPane.showInputDialog("Introduce el coeficiente 'b':"));
            double c = Double.parseDouble(JOptionPane.showInputDialog("Introduce el coeficiente 'c':"));

            double[] coeficientes = { a, b, c };
            Ecuacion ecuacion = new Ecuacion(coeficientes);

            double x = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de x:"));
            double resultado = ecuacion.resolver(x);
            JOptionPane.showMessageDialog(null, "El resultado de la ecuación para x=" + x + " es: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);

            double base = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de la base:"));
            double exponente = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor del exponente:"));

            double potencia = Math.pow(base, exponente);
            JOptionPane.showMessageDialog(null, base + " elevado a la " + exponente + " es igual a " + potencia, "Potencia", JOptionPane.INFORMATION_MESSAGE);

            double valor = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor para calcular la raíz cuadrada:"));

            double raíz = Math.sqrt(valor);
            JOptionPane.showMessageDialog(null, "La raíz cuadrada de " + valor + " es igual a " + raíz, "Raíz Cuadrada", JOptionPane.INFORMATION_MESSAGE);

            try {
                double valorCalc = Double.parseDouble(JOptionPane.showInputDialog("Introduce un valor para calcular la raíz cuadrada mejorada:"));

                double raízMejorada = Math.sqrtMejorado(valorCalc);
                JOptionPane.showMessageDialog(null, "La raíz cuadrada mejorada de " + valorCalc + " es igual a " + raízMejorada, "Raíz Cuadrada Mejorada", JOptionPane.INFORMATION_MESSAGE);
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
