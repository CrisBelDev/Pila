/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica;

/**
 *
 * @author CHICHO
 */
class PilaConsumo {
    int max, tope;
    private Consumo p[];

    public PilaConsumo(int z) {
        max = z;
        p = new Consumo[max];
        tope = -1;
    }
    public int nroElementos(){
        return tope;
    }

    public boolean esVacia() {
        if (tope == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esLlena() {
        if (tope == (max - 1)) {
            return true;
        } else {
            return false;
        }
    }

    public void adiPila(Consumo x) {
        if (esLlena()) {
            System.out.println("Pila llena");
        } else {
            tope = tope + 1;
            p[tope] = x;
        }
    }

    public Consumo eliPila() {
        Consumo x = new Consumo();
        if (esVacia()) {
            System.out.println("Pila vacia");
        } else {
            x = p[tope];
            tope = tope - 1;
        }
        return x;
    }

    public void mostrarPila() {
        PilaConsumo paux = new PilaConsumo(max);
        while (!esVacia()) {
            Consumo x = eliPila();
            x.mostrar();
            paux.adiPila(x);
        }
        vaciarPilaConsumo(paux);
    }
/*
    public void llenarPila(int x) {
        for (int i = 0; i < x; i++) {
            Consumo li1 = new  Consumo();
            li1.llenarLibro();
            adiPila(li1);
        }
    }
*/
    public void vaciarPilaConsumo(PilaConsumo paux) {
        while (!paux.esVacia()) {
            Consumo x = paux.eliPila();
            adiPila(x);
        }
    }
}
