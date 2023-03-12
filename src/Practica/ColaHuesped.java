/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica;

import java.util.Scanner;

/**
 *
 * @author CHICHO
 */
public class ColaHuesped {
    private Huesped c[];
    int max;
    private int frente, fin;

    public ColaHuesped(int z) {
        frente = -1;
        fin = -1;
        max = z;
        c = new Huesped[max];
    }

    public boolean esVacia() {
        if (frente == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esLlena() {
        if (fin == (max - 1)) {
            return true;
        } else {
            return false;
        }
    }

    public void adicola(Huesped d) {
        if (esLlena()) {
            System.out.println("Cola llena");
        } else {
            fin = fin + 1;
            c[fin] = d;
            if (frente == -1) {
                frente = 0;
            }
        }
    }

    public Huesped elicola() {
        Huesped dato = new Huesped();
        if (esVacia()) {
            System.out.println("Cola Vacia");
        } else {
            dato = c[frente];
            if (fin == frente) {
                frente = -1;
                fin = -1;
            } else {
                frente = frente + 1;
            }
        }
        return dato;
    }
/*
    public void llenar(int n) {
        Scanner leer = new Scanner(System.in);
        int c;
        Huesped x;
        System.out.println("Escriba los elementos");
        for (c = 1; c <= n; c++) {
            x = leer.next();
            adicola(x);
        }
    }
*/
    public int nroelementos() {
        return fin - frente + 1;
    }

    public void mostrarCola() {
        System.out.println("=====DATOS DE LA COLA======");
        ColaHuesped caux = new ColaHuesped(max);
        Huesped x= new Huesped();
        
        while (!esVacia()) {
            x = elicola();
            x.mostrar();
            caux.adicola(x);
        }
        vaciarCola(caux);
    }

    public void vaciarCola(ColaHuesped aux) {
        Huesped x= new Huesped();
        while (!aux.esVacia()) {
            x = aux.elicola();
            adicola(x);
        }
    }

}
