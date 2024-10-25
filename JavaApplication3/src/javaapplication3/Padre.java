/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author xxjos
 */
public class Padre {
    private String nombre = "Papá";
    private String apellido = "López";
    private Casa patrimonio;
    private Auto auto;

    public Padre(Auto auto) {
        this.auto = auto;
        this.patrimonio = construirCasa();
        comprarAuto(auto);
    }

    private Casa construirCasa() {
        return new Casa("Centro");
    }

    private void comprarAuto(Auto auto) {
        this.auto = auto;
    }

    public void cantar() {
        System.out.println("Así canta tu padre, Don " + apellido);
    }

    public String getZonaCasa() {
        return patrimonio.getZona();
    }

    public Auto getAuto() {
        return auto;
    }
}
