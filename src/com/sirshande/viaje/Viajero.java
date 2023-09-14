package com.sirshande.viaje;

import java.util.ArrayList;
import java.util.List;

public class Viajero {
    private String apellidos;
    private int dni;
    private int edad;
    private int fechaNacimiento;
    private String nacionalidad;
    private String nombres;
    private String sexo;
    private List<Equipaje> equipajes;

    public Viajero(String apellidos, int dni, int edad, int fechaNacimiento, String nacionalidad, String nombres, String sexo) {
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.nombres = nombres;
        this.sexo = sexo;
        this.equipajes = new ArrayList<>();
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getNombres() {
        return nombres;
    }

    public String getSexo() {
        return sexo;
    }

    public void agregarEquipaje(Equipaje equipaje) {
        equipajes.add(equipaje);
    }
}
