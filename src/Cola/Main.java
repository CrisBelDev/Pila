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
public class Main {
    public static void main(String[] args) {
        Cola cs = new Cola(5);
        cs.adicola("hola");
        cs.adicola("buenos");
        cs.adicola("dias");
        cs.adicola("a");
        cs.adicola("sistemas");
        
        cs.mostrar();
        System.out.println("");
        System.out.println("\n Nro elementos en la cola: "+ cs.nroelementos());
        System.out.println("*******************************");
        modificar(cs);
        cs.mostrar();
        System.out.println("");
        System.out.println("*******************************");
        eliminar(cs);
        cs.mostrar();
        System.out.println("");
        System.out.println("*************ORDENADO******************");
        ordenar(cs);
        cs.mostrar();
        System.out.println("");
        System.out.println("************CONTAR VOCALES*****************");
        contarvocales(cs);
    }
    public static void modificar(Cola cs){
        Scanner leer= new  Scanner(System.in);
        Cola caux= new Cola(cs.max);
        int sw=0,cp=0;
        String x,el;
        System.out.println("\n Escriba elemento a modificar: ");
        el=leer.next();
        while(!cs.esVacia()){
            x= cs.elicola();
            if(x.equals(el)){
                System.out.println("elemento encontrado");
                System.out.print("\n escriba nuevo Valor:");
                x=leer.next();
                sw=1;
            }
            caux.adicola(x);
        }
        if(sw==0){
            System.out.println("elemento no encontrado");
        }else{
            System.out.println("modificado");
        }
        cs.vaciar(caux);
    }
    public static void eliminar(Cola cs){
        Scanner leer= new Scanner(System.in);
        Cola caux= new Cola(cs.max);
        int sw=0,cp=0;
        String x,el;
        System.out.print("\n Escriba elemento a eliminar: ");
        el= leer.next();
        while(!cs.esVacia()){
            x=cs.elicola();
            if(!x.equals(el)){
                caux.adicola(x);
            }else{
                sw=1;
            }
        }
        if(sw==0){
            System.out.println("elemntos no encontrado");
        }else{
            System.out.println("eliminado : "+ el);
        }
        cs.vaciar(caux);
    }
    public static void ordenar(Cola cs){
        Cola paux = new Cola(cs.max);
        Cola pord = new Cola(cs.max);
        int sw=0,cp=0,nro=cs.nroelementos();
        String x="",min;
        for(int c=1;c<=nro;c++){
            min=cs.elicola();
            while(!cs.esVacia()){
                x= cs.elicola();
                if(x.compareTo(min)<0){
                    paux.adicola(min);
                    min=x;
                }else{
                    paux.adicola(x);
                }
            }
            pord.adicola(min);
            cs.vaciar(paux);
        }
        cs.vaciar(pord);
    }
    public static void contarvocales(Cola cs){
        Cola caux= new Cola(cs.max);
        int cp=0;
        String x;
        while(!cs.esVacia()){
            x= cs.elicola();
            System.out.println(x+"-- tiene vocales: "+ cuentavocal(x));
            caux.adicola(x);
        }
        cs.vaciar(caux);
    }
    public static int cuentavocal(String x){
        int c=0;
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)=='a' | x.charAt(i)=='e' | x.charAt(i)=='i' | x.charAt(i)=='o' | x.charAt(i)=='u'){
                c++;
            }
        }
        return c;
    }
}
