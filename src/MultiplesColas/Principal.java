/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MultiplesColas;

/**
 *
 * @author CHICHO
 */
public class Principal {
    public static void main(String[] args) {
        MColaS mc = new MColaS(3);
        mc.adiMPila("hola", 0);
        mc.adiMPila("buenos", 0);
        mc.adiMPila("la", 0);
        mc.adiMPila("ala", 1);
        mc.adiMPila("datos", 1);
        mc.adiMPila("mousesuom", 2);
        mc.mostrarMP();
        System.out.println("===========PALINDROMOS===========");
        mostrarPalindromos(mc);
        System.out.println("===========ORDENAR===========");
        ordenarMCola(mc);
        mc.mostrarMP();
    }
    public static void ordenarMCola(MColaS mc){
        for(int i = 0 ; i < mc.max;i++){
            
            Cola cs = mc.mc[i];
            ordenar(cs);
            
        }
        
    }
    public static void ordenar(Cola cs){
        Cola paux = new Cola(cs.max);
        Cola pord = new Cola(cs.max);
        int sw=0,cp=0,nro=cs.nroelementos();
        String x="",may;
        for(int c=1;c<=nro;c++){
            may=cs.elicola();
            while(!cs.esVacia()){
                x= cs.elicola();
                if(x.compareTo(may)>0){
                    paux.adicola(may);
                    may=x;
                }else{
                    paux.adicola(x);
                }
            }
            pord.adicola(may);
            cs.vaciarCola(paux);
        }
        cs.vaciarCola(pord);
    }
    public static void mostrarPalindromos(MColaS mc){
        for(int i = 0 ; i < mc.max;i++){
            System.out.println("----------- COLA "+i+" -----------");
            Cola cs = mc.mc[i];
            mostrarPal(cs);
        }
    }
    public static void mostrarPal(Cola cs){
        Cola caux = new Cola(cs.max);
        while(!cs.esVacia()){
            String x = cs.elicola();
            caux.adicola(x);
            if(esPalindromo(x)){
                System.out.println("  "+ x);
            }
        }
        cs.vaciarCola(caux);
    }
    public static boolean esPalindromo(String x){
        String inv="";
        for(int i=0;i<x.length();i++){
            inv=x.charAt(i)+inv;
        }
        if(x.equals(inv)){
            return true;
        }else{
            return false;
        }
    }
    
}
