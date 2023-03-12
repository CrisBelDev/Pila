/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica;

/**
 *
 * @author CHICHO
 */
public class Huesped {
    private String carnet;
    private String nombre;
    private int cantidadDias;
    private Habitacion hab;
    private PilaConsumo pli;

    public Huesped() {
    }

    public Huesped(String carnet, String nombre, int cantidadDias, Habitacion hab, PilaConsumo pli) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.cantidadDias = cantidadDias;
        this.hab = hab;
        this.pli = pli;
    }
    public void mostrar(){
        System.out.println("-------------------------------------");
        System.out.println("ci: "+carnet+" | nombre: "+nombre+" | dias:"+cantidadDias);
        hab.mostrar();
        System.out.println("_____Consumo pila:_____ ");
        pli.mostrarPila();
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    public Habitacion getHab() {
        return hab;
    }

    public void setHab(Habitacion hab) {
        this.hab = hab;
    }

    public PilaConsumo getPli() {
        return pli;
    }

    public void setPli(PilaConsumo pli) {
        this.pli = pli;
    }
    
}
