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
public class Main {
    public static void main(String[] args) {
        Mascota m1 = new Mascota("toto", "beagle", 8, "no");
        Mascota m2 = new Mascota("nana", "chapi", 1, "no");
        Mascota m3 = new Mascota("vader", "beagle", 1, "si");
        Mascota m4 = new Mascota("cader", "beagle", 3, "no");
        Mascota m5 = new Mascota("tete", "chapi", 2, "si");
        
        
        CCMascota a = new CCMascota(5);
        a.adicionar(m1);
        a.adicionar(m2);
        a.adicionar(m3);
        a.adicionar(m4);
        a.adicionar(m5);
        a.adicionar(m5);
        
       
        System.out.println(",,,,,,,,,,,,,,,,,,,,,,");
        a.mostrar();
        System.out.println("---------colocarFrente---------");
        colocarFrente(a, "si");
        a.mostrar();
        System.out.println("--------eliminarMascota----------");
        eliminarMascota2(a, "beagle");
        a.mostrar();
        System.out.println("---------llevarAlFinal---------");
        llevarAlFinal(a, 1);
        a.mostrar();
    }
    public static void llevarAlFinal(CCMascota a ,int edad){
        CCMascota aux = new CCMascota(a.max);
        for(int i=1;i<=a.nroelem();i++){
            Mascota b = a.eliminar();
            if(b.getEdad()==edad){
                aux.adicionar(b);
            }else{
                a.adicionar(b);
            }
        }
        a.vaciar(aux);
        
        
        //a.vaciar(aux);
    }
    public static void eliminarMascota(CCMascota a ,String raza){
       CCMascota aux = new CCMascota(a.max);
        while (!a.esvacia()) {
            Mascota x = a.eliminar();
            if(!x.getRaza().equals(raza)){
                aux.adicionar(x);
            }
        }
        a.vaciar(aux);   
    }
    public static void eliminarMascota2(CCMascota a ,String raza){
      
       int n=a.nroelem();
        for(int i = 1 ; i<=n;i++) {
            Mascota x = a.eliminar();
            if(!x.getRaza().equals(raza)){
                a.adicionar(x);
            }
        }
           
    }
    public static void colocarFrente(CCMascota a ,String inc){
        CCMascota aux = new CCMascota(a.max);
        for(int i=1;i<=a.nroelem();i++){
            Mascota b = a.eliminar();
            if(b.getIncapacidad().equals(inc)){
                a.adicionar(b);
            }else{
                aux.adicionar(b);
            }
           
        }
        
        Mascota b = a.eliminar();
        if(b.getIncapacidad().equals(inc)){
            a.adicionar(b);
        }else{
            aux.adicionar(b);
        }
        
        a.vaciar(aux);
    }
}
