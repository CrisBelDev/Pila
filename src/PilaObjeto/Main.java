/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PilaObjeto;

import java.util.Scanner;

/**
 *
 * @author CHICHO
 */
public class Main {
    public static void main(String[] args) {
        Libro l1=new Libro("programacion", "joyanes", "sn", 500, 2000, "programacion");
        Libro l2=new Libro("algebra", "rojo", "sn", 200, 2020, "mate");
        Libro l3=new Libro("est datos", "joyanes", "sn", 800, 2010, "programacion");
        Libro l4=new Libro("calculo", "chungara", "sn", 100, 2020, "programacion");
        
        PilaLibro c = new PilaLibro(5);
        c.adiPilaLibro(l1);
        c.adiPilaLibro(l2);
        c.adiPilaLibro(l3);
        c.adiPilaLibro(l4);
        c.mostrarPila();
        /*
        System.out.println("___mostrar area");
        mostrarLibrosArea(c, "programacion");
        System.out.println("___mostrar autor");
        mostrarLibrosAutor(c, "chungara");
        System.out.println("___mostrar edicion");
        mostrarLibrosEdicion(c, 2010 );
        System.out.println("___modificar editorial");
        modificarEditorial(c, "rojo");
        c.mostrarPila();
        System.out.println("___elimina por titulo");
        eliminaLibroTitulo(c,"algebra");
        c.mostrarPila();
        */
        System.out.println("oredenarrrr por titulo");
        ordenar(c);
        c.mostrarPila();
    }
    public static void ordenar(PilaLibro cs) {
        PilaLibro paux = new PilaLibro(cs.max);
        PilaLibro pord = new PilaLibro(cs.max);
        int sw=0,cp=0;
        int x=0; int may=0;
        while(!cs.esVacia()){
            Libro lib =cs.eliPilaLibro();
            may = lib.getNroPaginas();
            while(!cs.esVacia()){
                Libro lib2= cs.eliPilaLibro();
                x= lib2.getNroPaginas();
                if(x>may){
                    paux.adiPilaLibro(lib);
                    may=x;
                    lib= lib2;
                }else{
                    paux.adiPilaLibro(lib2);
                }
            }
            pord.adiPilaLibro(lib);
          
            
            cs.vaciarPilaLibro(paux);
        }
        cs.vaciarPilaLibro(pord);
    }
    public static void eliminaLibroTitulo(PilaLibro c,String titulo){
        PilaLibro paux = new PilaLibro(c.max);
        while(!c.esVacia()){
            Libro x = c.eliPilaLibro();
            if(!x.getTitulo().equals(titulo)){
                paux.adiPilaLibro(x);
            }
        }
        c.vaciarPilaLibro(paux);
    }
    public static void modificarEditorial(PilaLibro c, String autor){
        Scanner leer= new Scanner(System.in);
        PilaLibro paux = new PilaLibro(c.max);
        boolean sw=false;
        while(!c.esVacia()){
            Libro x = c.eliPilaLibro();
            if(x.getAutor().equals(autor)){
                System.out.println("escriba editorial");
                String edit = leer.next();
                x.setEditorial(edit);
                sw=true;
            }
            paux.adiPilaLibro(x);
        }
        c.vaciarPilaLibro(paux);
        if(sw==false){
            System.out.println("libro no encontrado");
        }
    }
    public static void mostrarLibrosEdicion(PilaLibro c, int anio){
        PilaLibro paux = new PilaLibro(c.max);
        while(!c.esVacia()){
            Libro x = c.eliPilaLibro();
            if(x.getEdicion()>= anio){
                x.mostrarLibro();
            }
            paux.adiPilaLibro(x);
        }
        c.vaciarPilaLibro(paux);
    }
    public static void mostrarLibrosAutor(PilaLibro c, String autor){
        PilaLibro paux = new PilaLibro(c.max);
        while(!c.esVacia()){
            Libro x = c.eliPilaLibro();
            if(x.getAutor().equals(autor))
                x.mostrarLibro();
            paux.adiPilaLibro(x);
        }
        c.vaciarPilaLibro(paux);
    }
    public static void mostrarLibrosArea(PilaLibro c, String area){
        PilaLibro paux = new PilaLibro(c.max);
        while(!c.esVacia()){
            Libro x = c.eliPilaLibro();
            if(x.getArea().equals(area))
                x.mostrarLibro();
            paux.adiPilaLibro(x);
        }
        c.vaciarPilaLibro(paux);
    }
}
