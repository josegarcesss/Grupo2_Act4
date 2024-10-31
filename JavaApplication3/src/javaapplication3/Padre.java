/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author JoseGarces
 */
public class Padre {
   protected String nombre;
    protected String apellido;
    protected Casa casa;
    protected Auto auto;

    public Padre(Auto auto) {
        this.nombre = "Papá";
        this.apellido = "López";
        construirCasa();
        comprarAuto(auto);
    }

    private void construirCasa() {
        this.casa = new Casa("Centro", 2, this);
    }

    private void comprarAuto(Auto auto) {
        this.auto = auto;
        auto.setDueno(this);
    }


    public void cantar() {
        System.out.println("Así canta tu padre, Don " + apellido);
    }

    public String getZonaCasa() {
        return(casa.getZona());
    }

    public Auto getAuto() {
        return auto;
    }
}
