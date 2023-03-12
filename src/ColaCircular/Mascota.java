/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColaCircular;

/**
 *
 * @author AREA PROGRAMACION
 */
public class Mascota {
    private String nombre,raza;
    private int edad;
    private String incapacidad;

    public Mascota() {
    }

    public Mascota(String nombre, String raza, int edad, String incapacidad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.incapacidad = incapacidad;
    }
    public void mostrar(){
        System.out.println(nombre+" "+raza+" |inc_:"+incapacidad+" |edad:"+edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getIncapacidad() {
        return incapacidad;
    }

    public void setIncapacidad(String incapacidad) {
        this.incapacidad = incapacidad;
    }
    
}
