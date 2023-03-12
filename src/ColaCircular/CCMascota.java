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
public class CCMascota {
    private int ini,fin;
    int max;
    private Mascota v[];

    public CCMascota(int z) {
        max = z+1;
        v = new Mascota[max];
        ini = fin = 0;
    }

    int nroelem() {
        return (max + fin - ini) % max;
    }

    public boolean esvacia() {
        if(ini == fin){
            return true;
            
        }else{
            return false;
        }
    }

    public boolean eslleno() {
        if ((max - 1) == nroelem()){
            return true;
        }else{
            return false;
        }
    }

    public void adicionar(Mascota elem) {
        if (!eslleno()) {
            fin = (fin + 1) % max;
            v[fin] = elem;
        } else {
            System.out.println("cola llena");
        }
    }
    public Mascota eliminar() {
        Mascota elem = null;
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
/*
    public void llenar(int n) {
        for (int i = 0; i < n; i++) {
            Mascota p = new Mascota();
            p.leer();
            adicionar(p);
        }
    }
*/
    

    public void mostrar() {
        CCMascota aux = new CCMascota(max);
        while (!esvacia()) {
            Mascota x = eliminar();
            x.mostrar();
            aux.adicionar(x);
        }
        vaciar(aux);
    }

    public void vaciar(CCMascota w) {
        while (!w.esvacia()) {
            adicionar(w.eliminar());
        }
    }
}
