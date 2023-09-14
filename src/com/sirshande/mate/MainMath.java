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

            double a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número, coeficiente 'a':", "10"));
            double b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número, coeficiente 'b':", "11"));
            double c = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número, coeficiente 'c':", "12"));

            double[] coeficientes = { a, b, c };
            Ecuacion ecuacion = new Ecuacion(coeficientes);

            double x = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de x:", "8"));
            double resultado = ecuacion.resolver(x);
            JOptionPane.showMessageDialog(null, "El resultado de la ecuación para x=" + x + " es: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);

            double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la base:", "9"));
            double exponente = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del exponente:", "2"));

            double potencia = Math.pow(base, exponente);
            JOptionPane.showMessageDialog(null, base + " elevado a la " + exponente + " es igual a " + potencia, "Potencia", JOptionPane.INFORMATION_MESSAGE);

            double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor para calcular la raíz cuadrada:", "36"));

            double raíz = Math.sqrt(valor);
            JOptionPane.showMessageDialog(null, "La raíz cuadrada de " + valor + " es igual a " + raíz, "Raíz Cuadrada", JOptionPane.INFORMATION_MESSAGE);

            try {
                double valorCalc = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un valor para calcular la raíz cuadrada mejorada:", "25"));

                double raízMejorada = Math.sqrtMejorado(valorCalc);
                JOptionPane.showMessageDialog(null, "La raíz cuadrada mejorada de " + valorCalc + " es igual a " + raízMejorada, "Raíz Cuadrada Mejorada", JOptionPane.INFORMATION_MESSAGE);
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
