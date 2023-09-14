package com.sirshande.viaje;

import javax.swing.JOptionPane;

public class MainViaje {

        public static void main(String[] args) {

                //Viajero
                String apellidos = JOptionPane.showInputDialog("Introduce los apellidos del Viajero:", "Fernandez Rojas");
                long dni = Long.parseLong(JOptionPane.showInputDialog("Introduce el DNI del Viajero:", "62490664"));
                int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad del Viajero:", "18"));
                int fechaNacimiento = Integer.parseInt(JOptionPane.showInputDialog("Introduce la fecha de nacimiento del Viajero (20041210):", "20041210"));
                String nacionalidad = JOptionPane.showInputDialog("Introduce la nacionalidad del Viajero:", "Perú");
                String nombres = JOptionPane.showInputDialog("Introduce los nombres del Viajero:", "Shande");
                String sexo = JOptionPane.showInputDialog("Introduce el sexo del Viajero:", "Hombre");

                Viajero viajero = new Viajero(apellidos, (int) dni, edad, fechaNacimiento, nacionalidad, nombres, sexo);

                //Equipaje
                int idEquipaje = Integer.parseInt(JOptionPane.showInputDialog("Introduce el ID del Equipaje:", "96452"));
                String tipoEquipaje = JOptionPane.showInputDialog("Introduce el tipo de Equipaje:", "Delicado");
                String propietarioEquipaje = JOptionPane.showInputDialog("Introduce el propietario del Equipaje:", "Shande");
                String colorEquipaje = String.valueOf(JOptionPane.showInputDialog("Introduce el color del Equipaje:", "Rojo"));
                double pesoEquipaje = Double.parseDouble(JOptionPane.showInputDialog("Introduce el peso del Equipaje(KG):", "21"));

                Equipaje equipaje = new Equipaje(idEquipaje, tipoEquipaje, propietarioEquipaje, colorEquipaje, (int) pesoEquipaje);

                //Crear equipaje al Viajero
                viajero.agregarEquipaje(equipaje);

                //Out Info
                String viajeroInfo = "Información del Viajero:\n";
                viajeroInfo += "Nombre Completo: " + viajero.getNombres().toUpperCase() + " " + viajero.getApellidos().toUpperCase() + "\n";
                viajeroInfo += "DNI: " + viajero.getDni() + "\n";
                viajeroInfo += "Edad: " + viajero.getEdad() + " años\n";
                viajeroInfo += "Nacionalidad: " + viajero.getNacionalidad().toUpperCase() + "\n";
                viajeroInfo += "Sexo: " + viajero.getSexo().toUpperCase() + "\n";

                String equipajeInfo = "Información del Equipaje:\n";
                equipajeInfo += "ID del Equipaje: " + equipaje.getId() + "\n";
                equipajeInfo += "Tipo: " + equipaje.getTipo().toUpperCase() + "\n";
                equipajeInfo += "Propietario: " + equipaje.getPropietario().toUpperCase() + "\n";
                equipajeInfo += "Color: " + equipaje.getColor() + "\n";
                equipajeInfo += "Peso: " + equipaje.getPeso() + " kg\n";

                //Ver datos
                JOptionPane.showMessageDialog(null, viajeroInfo, "Información del Viajero", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, equipajeInfo, "Información del Equipaje", JOptionPane.INFORMATION_MESSAGE);
        }
}

