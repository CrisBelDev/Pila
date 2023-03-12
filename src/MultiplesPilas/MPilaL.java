
package MultiplesPilas;

import java.util.Scanner;

public class MPilaL {
    public int max;
    public PilaLibro mp[];
    public int npilas;

    public MPilaL(int z) {
        max = z;
        mp = new PilaLibro[max];
        for(int i = 0; i < max; i++){
            mp[i] = new PilaLibro(max);
        }
        npilas = 0;
    }
    public boolean esVacia(int i){
        return mp[i].esVacia();
    }
    public boolean esLlena(int i){
        return mp[i].esLlena();
    }
    public void adiMPila(Libro x , int i){
        if(mp[i].esLlena()){
            System.out.println("Pila posicion "+ i + " esta llena..!");
        }else{
            mp[i].adiPila(x);
        }
    }
    public Libro eliMPila(int i){
        Libro x = new Libro();
        if (mp[i].esVacia()){
            System.out.println("Pila posicion "+ i + " esta vacia..!");
        }else{
            x = mp[i].eliPila();
        }
        return x;
    }
    public void mostrarMP(){
       
        for(int i = 0 ; i < npilas;i++){
            System.out.println("----------- PILA "+i+" -----------");
            mp[i].mostrarPila();
        }
    }
    public void llenarMP(int n){
        npilas = n;
        Scanner leer = new Scanner(System.in);
        for(int i = 0 ;i<n;i++){
            System.out.print("ingrese tam de la pila : ");
            int x = leer.nextInt();
            mp[i].llenarPila(x);
        }
    }
    public void vaciarMP(PilaLibro pli, int i){
        mp[i].vaciarPilaLibro(pli); 
    }
}
