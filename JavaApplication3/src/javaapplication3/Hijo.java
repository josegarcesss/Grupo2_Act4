/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author xxjos
 */
class Hijo extends Padre implements Madre, Tio, Hermano {
    private String nombre;
    private double billetera;
    private Celular celular;

    public Hijo(String nombre, Celular celular, Auto auto) {
        super(auto);
        this.nombre = nombre;
        this.celular = celular;
        this.billetera = 0.0;
    }

    public void conducirAuto(Auto auto) {
        System.out.println("Conduciendo un auto de un amigo: " + auto.getModelo());
    }

    @Override
    public void cantar() {
        super.cantar();
        System.out.println("Así canta Juan Carlos");
    }

    @Override
    public void bailar() {
        System.out.println("Se bailar como mi madre");
    }

    @Override
    public int jugarLoteria() {
        billetera += FORTUNA;
        System.out.println("Heredaste la Fortuna de " + FORTUNA + " de tu madre la ROSA!!");
        return NROSUERTE;
    }

    @Override
    public void heredarDinero(double money) {
        billetera += money;
        System.out.println("Tío Lucas te regala estos dolaritos!");
    }

    @Override
    public void jugarFutbol() {
        System.out.println("Sé jugar futbol gracias a mi hermano");
    }

    @Override
    public int hacerGoles() {
        return (int) (Math.random() * 10); // Simulación de goles
    }
}
