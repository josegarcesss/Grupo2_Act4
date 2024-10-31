/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author JoseGarces
 */
class Casa {
   private String zona;
    private int pisos;
    private final Padre propietario;

    public Casa(String zona, int pisos, Padre propietario) {
        this.zona = zona;
        this.pisos = pisos;
        this.propietario = propietario;
    }

    public String getZona() {
        return zona;
    }

    public int getPisos() {
        return pisos;
    }
    
    public void setPisos(int pisos){
        this.pisos=pisos;
    }
}
