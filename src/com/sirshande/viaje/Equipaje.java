package com.sirshande.viaje;

/**
 *
 * @author Administrator
 */
public class Equipaje {
    private int id;
    private String tipo;
    private String propietario;
    private String color;
    private int peso;

    public Equipaje(int id, String tipo, String propietario, String color, int peso) {
        this.id = id;
        this.tipo = tipo;
        this.propietario = propietario;
        this.color = color;
        this.peso = peso;
    }
    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public String getPropietario() {
        return propietario;
    }

    public String getColor() {
        return color;
    }
    public int getPeso() {
        return peso;
    }
}