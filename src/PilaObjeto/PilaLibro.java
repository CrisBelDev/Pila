/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PilaObjeto;

/**
 *
 * @author CHICHO
 */
public class PilaLibro {
    int max, tope;
    private Libro p[];

    public PilaLibro(int z) {
        max=z;
        p=new Libro[max];
        tope=-1;
    }
    public boolean  esVacia(){
        if(tope==-1){
            return true;
        }else{
            return false;
        }
    }
    public boolean  esLlena(){
        if(tope==(max-1)){
            return true;
        }else{
            return false;
        }
    }
    public  void adiPilaLibro(Libro x){
        if(esLlena()){
            System.out.println("pila llena");
        }else{
            tope=tope+1;
            p[tope]=x;
        }
    }
    public Libro eliPilaLibro(){
        Libro x=new Libro();
        if(esVacia()){
            System.out.println("PilaLibro vacia");
        }else{
            x=p[tope];
            tope=tope-1;
        }
        return x;
    }
    public void mostrarPila(){
        PilaLibro paux = new PilaLibro(max);
        while(!esVacia()){
            Libro x = eliPilaLibro();
            x.mostrarLibro();
            paux.adiPilaLibro(x);
        }
        vaciarPilaLibro(paux);
    }
    public void vaciarPilaLibro(PilaLibro paux){
        while(!paux.esVacia()){
            Libro x = paux.eliPilaLibro();
            adiPilaLibro(x);
        }
    } 
}
