/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author JoseGarces
 */
public class Main {
    public static void main(String[] args) {
        Auto autoCascajo = new Auto("123LATA", "Renault 12");
        Auto autoFord = new Auto("999POWR", "Ford Focus");
        Celular celular = new Celular("Movistar", "123456789", 100.0);

        Padre padre = new Padre(autoFord);
        System.out.println("Papá me dejó esta casa en zona: " + padre.getZonaCasa());

        Hijo hijo = new Hijo("Juan Carlos", celular, autoCascajo);
        System.out.println("Papá me dejó este auto: " + hijo.getAuto().getModelo());
        hijo.conducirAuto(autoFord);
        hijo.jugarFutbol();
        hijo.bailar();
        System.out.println("SALIO EL NUMERO DE LA SUERTE: " + hijo.jugarLoteria());
        hijo.cantar();
        hijo.heredarDinero(2000);
        System.out.println("Jugando al futbol, hoy has hecho: " + hijo.hacerGoles() + " goles.");
    }
    
}
