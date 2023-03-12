/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica;

/**
 *
 * @author CHICHO
 */
public class Consumo {
    private String nombreProd;
    private int precio;

    public Consumo() {
    }

    public Consumo(String nombreProd, int precio) {
        this.nombreProd = nombreProd;
        this.precio = precio;
    }
    public void mostrar(){
        System.out.println(" "+ nombreProd+ " "+precio);
    }

    public String getNombreProd() {
        return nombreProd;
    }

    public void setNombreProd(String nombreProd) {
        this.nombreProd = nombreProd;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
}
