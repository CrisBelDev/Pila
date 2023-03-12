package MultiplesPilas;

public class PilaLibro {

    int max, tope;
    private Libro p[];

    public PilaLibro(int z) {
        max = z;
        p = new Libro[max];
        tope = -1;
    }
    public int nroElementos(){
        return tope;
    }

    public boolean esVacia() {
        if (tope == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esLlena() {
        if (tope == (max - 1)) {
            return true;
        } else {
            return false;
        }
    }

    public void adiPila(Libro x) {
        if (esLlena()) {
            System.out.println("Pila llena");
        } else {
            tope = tope + 1;
            p[tope] = x;
        }
    }

    public Libro eliPila() {
        Libro x = new Libro();
        if (esVacia()) {
            System.out.println("Pila vacia");
        } else {
            x = p[tope];
            tope = tope - 1;
        }
        return x;
    }

    public void mostrarPila() {
        PilaLibro paux = new PilaLibro(max);
        while (!esVacia()) {
            Libro x = eliPila();
            x.mostrarLibro();
            paux.adiPila(x);
        }
        vaciarPilaLibro(paux);
    }

    public void llenarPila(int x) {
        for (int i = 0; i < x; i++) {
            Libro li1 = new  Libro();
            li1.llenarLibro();
            adiPila(li1);
        }
    }

    public void vaciarPilaLibro(PilaLibro paux) {
        while (!paux.esVacia()) {
            Libro x = paux.eliPila();
            adiPila(x);
        }
    }
    
    public void mostrarLibrosArea(PilaLibro c, String area){
        PilaLibro paux = new PilaLibro(c.max);
        while(!c.esVacia()){
            Libro x = c.eliPila();
            if(x.getArea().equals(area))
                x.mostrarLibro();
            paux.adiPila(x);
        }
        c.vaciarPilaLibro(paux);
    }
}
