/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CHICHO
 */
public class Main {
    public static void main(String[] args) {
        Pila A = new Pila(6);
        A.adiPila(1);
        A.adiPila(2);
        A.adiPila(3);
        A.adiPila(4);
        A.adiPila(59);
        A.adiPila(6);
        
        A.mostrarPila();
        System.out.println("--primos");
        mostrarPrimos(A);
        
    }
    public static void mostrarPrimos(Pila A){
        Pila paux = new Pila(A.max);
        int x;
        while(!A.esVacia()){  
            x = A.eliPila();
            if (esPrimo(x)){
                System.out.println(x);
            }
            paux.adiPila(x); 
        }
        A.vaciarPila(paux);
    }
    public static boolean esPrimo(int n){
        int sw=0;
        for(int i = 1 ; i<=n;i++){
            if(n%i==0){
                sw++;
            }
        }
        if(sw==2)
            return true;
        return false;
    }
}
