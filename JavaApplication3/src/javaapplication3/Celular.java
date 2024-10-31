/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author JoseGarces
 */
public class Celular {
 private String compañia;
    private String numero;
    private double saldo;
    private Hijo propietario;

    public Celular(String compañia, String numero, double saldo) {
        this.compañia = compañia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public void setPropietario(Hijo propietario) {
        this.propietario = propietario;
    }


    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
