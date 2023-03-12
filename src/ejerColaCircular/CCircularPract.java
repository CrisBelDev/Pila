/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerColaCircular;

/**
 *
 * @author CHICHO
 */
public class CCircularPract {

    private int ini, fin, max = 50;
    private Practica[] v = new Practica[max + 1];

    CCircularPract() {
        ini = fin = 0;
    }

    int nroelem() {
        return (max + fin - ini) % max;
    }

    public boolean esvacia() {
        return nroelem() == 0;
    }

    public boolean eslleno() {
        return (max - 1) == nroelem();
    }

    public void adicionar(Practica elem) {
        if (!eslleno()) {
            fin = (fin + 1) % max;
            v[fin] = elem;
        } else {
            System.out.println("cola llena");
        }
    }
    public Practica eliminar() {
        Practica elem = null;
        if (!esvacia()) {
            ini = (ini + 1) % max;
            elem = v[ini];
            if (ini == fin) {
                ini = fin = 0;
            }
        } else {
            System.out.println("cola vacia");
        }
        return elem;
    }

    public void llenar(int n) {
        for (int i = 0; i < n; i++) {
            Practica p = new Practica();
            p.leer();
            adicionar(p);
        }
    }

    public void llenar() {
        Practica x = new Practica();
        x.setCi(234);
        x.setNota(100);
        x.setNroP(1);
        Practica y = new Practica();
        y.setCi(345);
        y.setNota(100);
        y.setNroP(2);
        Practica z = new Practica();
        z.setCi(234);
        z.setNota(100);
        z.setNroP(2);
        Practica w = new Practica();
        w.setCi(123);
        w.setNota(30);
        w.setNroP(1);
        Practica q = new Practica();
        q.setCi(123);
        q.setNota(70);
        q.setNroP(2);
        adicionar(x);
        adicionar(y);
        adicionar(z);
        adicionar(w);
        adicionar(q);
    }

    public void mostrar() {
        CCircularPract aux = new CCircularPract();
        while (!esvacia()) {
            Practica x = eliminar();
            x.mostrar();
            aux.adicionar(x);
        }
        vaciar(aux);
    }

    public void vaciar(CCircularPract w) {
        while (!w.esvacia()) {
            adicionar(w.eliminar());
        }
    }
}
