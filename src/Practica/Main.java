/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica;

/**
 *
 * @author CHICHO
 */
public class Main {
    public static void main(String[] args) {
        //-----------habitacion obj
        Habitacion hab1=new Habitacion(10, 1, 2, 70);
        Habitacion hab2=new Habitacion(11, 1, 1, 40);
        Habitacion hab3=new Habitacion(12, 2, 2, 70);
        Habitacion hab4=new Habitacion(13, 2, 3, 90);
        Habitacion hab5=new Habitacion(14, 3, 1, 40);
        //-----------consumo obj
        Consumo c1=new Consumo("pollo dorado", 25);
        Consumo c2=new Consumo("desayuno", 5);
        Consumo c3=new Consumo("charquecan", 45);
        Consumo c4=new Consumo("chancho a la cruz", 65);
        //-----------pilaConsumo obj
        PilaConsumo pliConsumo=new PilaConsumo(3);
        pliConsumo.adiPila(c1);
        pliConsumo.adiPila(c2);
        
        PilaConsumo pliConsumo2=new PilaConsumo(3);
        pliConsumo2.adiPila(c1);
        pliConsumo2.adiPila(c4);
        pliConsumo2.adiPila(c3);
        
        PilaConsumo pliConsumo3=new PilaConsumo(3);
        pliConsumo3.adiPila(c2);
        pliConsumo3.adiPila(c3);
        pliConsumo3.adiPila(c4);
        //-----------huesped obj
        Huesped h1= new Huesped("12452572", "cristian", 4, hab1, pliConsumo);
        Huesped h2= new Huesped("98763344", "alicia", 3, hab2, pliConsumo2);
        Huesped h3= new Huesped("14566664", "paola", 1, hab3, pliConsumo3);
        
        ColaHuesped cs = new ColaHuesped(5);
        cs.adicola(h1);
        cs.adicola(h2);
        cs.adicola(h3);
        cs.mostrarCola();
        //ejercicios
        System.out.println("==================================================");
        mostrarCliente(cs, "12452572");
        System.out.println("==================================================");
        mostrarCantCancelar(cs, "12452572");
    }
    public static void mostrarCantCancelar(ColaHuesped cs,String ci){
        ColaHuesped caux = new ColaHuesped(cs.max);
        int sw=0;
        int precioEstancia=0;
        int precioConsumo=0;
        while (!cs.esVacia()) {
            Huesped x = cs.elicola();
            if(x.getCarnet().equals(ci)){
                precioEstancia=x.getCantidadDias()*x.getHab().getPrecioDia();
                precioConsumo = obtConsumoPrecio(x.getPli());
                int total = precioEstancia + precioConsumo;
                System.out.println("precio estancia: "+precioEstancia);
                System.out.println("precio consumo: "+precioConsumo);
                System.out.println("total: "+total);
                sw=1;
            }
            
            caux.adicola(x);
        }
        cs.vaciarCola(caux);
        if(sw==0){
            System.out.println("El cliente no se encuentra alojado en el hotel");
        }
    }
    public static int obtConsumoPrecio(PilaConsumo pli){
        PilaConsumo paux = new PilaConsumo(pli.max);
        int precioConsumo=0;
        while (!pli.esVacia()) {
            Consumo x = pli.eliPila();
            precioConsumo = precioConsumo + x.getPrecio();
            paux.adiPila(x);
        }
        pli.vaciarPilaConsumo(paux);
        return precioConsumo;
    }
    public static void mostrarCliente(ColaHuesped cs , String ci){
        ColaHuesped caux = new ColaHuesped(cs.max);
        int sw=0;
        
        while (!cs.esVacia()) {
            Huesped x = cs.elicola();
            if(x.getCarnet().equals(ci)){
                System.out.println("EL CI: "+ci +" esta alojado en el hotel");
                x.getHab().mostrar();
                System.out.println("__PILA CONSUMO__");
                x.getPli().mostrarPila();
                sw=1;
            }
            
            caux.adicola(x);
        }
        cs.vaciarCola(caux);
        if(sw==0){
            System.out.println("El cliente no se encuentra alojado en el hotel");
        }
    }
}
