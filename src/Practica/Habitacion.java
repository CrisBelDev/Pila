/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica;

/**
 *
 * @author CHICHO
 */
class Habitacion {
    private int nroHab,piso,nroCamas,precioDia;

    public Habitacion() {
    }

    public Habitacion(int nroHab, int piso, int nroCamas, int precioDia) {
        this.nroHab = nroHab;
        this.piso = piso;
        this.nroCamas = nroCamas;
        this.precioDia = precioDia;
    }
    public void mostrar(){
        System.out.println("hab: "+ nroHab+ " | piso: "+piso+" | camas: "+nroCamas+" | precio: "+precioDia);
    }

    public int getNroHab() {
        return nroHab;
    }

    public void setNroHab(int nroHab) {
        this.nroHab = nroHab;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public int getNroCamas() {
        return nroCamas;
    }

    public void setNroCamas(int nroCamas) {
        this.nroCamas = nroCamas;
    }

    public int getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(int precioDia) {
        this.precioDia = precioDia;
    }
    
}
