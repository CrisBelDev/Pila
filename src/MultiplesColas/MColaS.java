/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MultiplesColas;

import java.util.Scanner;

/**
 *
 * @author CHICHO
 */
public class MColaS {
    int max;
    int ncolas;
    Cola mc[];

    public MColaS(int z) {
        max=z;
        mc= new Cola[max];
        for(int i = 0 ;i<max;i++){
            mc[i] = new Cola(z);
        }
        ncolas = 0;
    }
    public boolean esVacia(int i){
        return mc[i].esVacia();
    }
    public boolean esLlena(int i){
        return mc[i].esLlena();
    }
    public void adiMPila(String x , int i){
        if(mc[i].esLlena()){
            System.out.println("Cila posicion "+ i + " esta llena..!");
        }else{
            mc[i].adicola(x);
        }
    }
    public String eliMPila(int i){
        String x = "";
        if (mc[i].esVacia()){
            System.out.println("Cila posicion "+ i + " esta vacia..!");
        }else{
            x = mc[i].elicola();
        }
        return x;
    }
    public void mostrarMP(){
       
        for(int i = 0 ; i < max;i++){
            System.out.println("----------- COLA "+i+" -----------");
            mc[i].mostrarCola();
        }
    }
    public void llenarMP(int n){
        ncolas = n;
        Scanner leer = new Scanner(System.in);
        for(int i = 0 ;i<n;i++){
            System.out.print("ingrese tam de la cola : ");
            int x = leer.nextInt();
            mc[i].llenar(x);
        }
    }
    public void vaciarMP(Cola cs, int i){
        mc[i].vaciarCola(cs); 
    }
    
}
