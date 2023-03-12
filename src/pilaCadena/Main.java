/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilaCadena;

/**
 *
 * @author CHICHO
 */
public class Main {
    public static void main(String[] args) {
        Pila b = new Pila(5);
        b.adiPila("info");
        b.adiPila("datos");
        b.adiPila("local");
        b.adiPila("casa");
        b.adiPila("oso");
        b.mostrarPila();
        System.out.println("-----");
        mostrarPalindromo(b);
    }
    public static void mostrarPalindromo(Pila B){
        Pila paux = new Pila(B.max);
        String x;
        while(!B.esVacia()){
            x=B.eliPila();
            if(esPalindromo(x)){
                System.out.println("palindromo: "+x);
            }
            paux.adiPila(x);
        }
        B.vaciarPila(paux);
    }
    public static boolean esPalindromo(String x){
        String inv="";
        for(int i=0;i< x.length();i++){
            inv=x.charAt(i)+ inv;
        }
        if(inv.equals(x)){
            return true;
        }else{
            return false;
        }
    }
}
