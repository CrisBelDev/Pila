
package pilaCadena;

/**
 *
 * @author CHICHO
 */
public class Pila {
    int max, tope;
    private String p[];

    public Pila(int z) {
        max=z;
        p=new String[max];
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
    public  void adiPila(String x){
        if(esLlena()){
            System.out.println("pila llena");
        }else{
            tope=tope+1;
            p[tope]=x;
        }
    }
    public String eliPila(){
        String x="";
        if(esVacia()){
            System.out.println("Pila vacia");
        }else{
            x=p[tope];
            tope=tope-1;
        }
        return x;
    }
    public void mostrarPila(){
        Pila paux = new Pila(max);
        while(!esVacia()){
            String x = eliPila();
            System.out.println(" "+x);
            paux.adiPila(x);
        }
        vaciarPila(paux);
    }
    public void vaciarPila(Pila paux){
        while(!paux.esVacia()){
            String x = paux.eliPila();
            adiPila(x);
        }
    } 
}
