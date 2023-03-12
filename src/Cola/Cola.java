/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cola;

import java.util.Scanner;

/**
 *
 * @author CHICHO
 */
public class Cola {
    Scanner leer= new Scanner(System.in);
    private String c[];
    int max;
    private int frente,fin;

    public Cola(int z) {
        frente=-1;
        fin=-1;
        max=z;
        c= new String[max];
    }
    public boolean esVacia(){
        if(frente==-1){
            return true;
        }else{
            return false;
        }
    }
    public boolean esLlena(){
        if(fin==(max-1)){
            return true;
        }else{
            return false;
        }
    }
    public void adicola(String d){
        if(esLlena()){
            System.out.println("Cola llena");
        }else{
            fin=fin+1;
            c[fin]= d;
            if(fin==0){
                frente=0;
            }
        }
    }
    public String elicola(){
        String dato="";
        if(esVacia()){
            System.out.println("Cola Vacia");
        }else{
            dato=c[frente];
            if(fin==frente){
                frente=-1;
                fin=-1;
            }else{
                frente=frente+1;
            }
        }
        return dato;
    }
    public void llenar(int n){
        int c;
        String x;
        System.out.println("Escriba los elementos");
        for(c=1;c<=n;c++){
            x=leer.next();
            adicola(x);
        }
    }
    public int nroelementos(){
        return fin-frente+1;
    }
    public void mostrar(){
        Cola caux = new Cola(max);
        String x;
        System.out.println("Los elementos de la cola son:");
        while(!esVacia()){
            x=elicola();
            System.out.print("["+x+"]");
            caux.adicola(x);
        }
        vaciar(caux);
    }
    public void vaciar(Cola aux){
        String x;
        while(!aux.esVacia()){
            x=aux.elicola();
            adicola(x);
        }
    }
    
}
