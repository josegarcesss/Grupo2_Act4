/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author JoseGarces
 */
public class Auto {
    private String patente;
    private String modelo;
    private double combustible = 50.0;
    private Padre dueno;

    public Auto(String patente, String modelo) {
        this.patente = patente;
        this.modelo = modelo;
    }

    public void setDueno(Padre dueno) {
        this.dueno = dueno;
    }

    public String getModelo() {
        return modelo;
    }


    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }
    
}
