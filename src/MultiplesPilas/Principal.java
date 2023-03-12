package MultiplesPilas;

public class Principal {

    public static void main(String[] args) {
        Libro li1 = new Libro("pacion", "joyanes", "sn", 8, 2000, "prog");
        Libro li2 = new Libro("algebra", "rojo", "sn", 800, 1999, "mate");
        Libro li3 = new Libro("est datos", "joyanes", "sn", 600, 2010, "prog");
        Libro li4 = new Libro("calculo", "chungara", "sn", 120, 2020, "mate");
        Libro li5 = new Libro("estadistica", "chungara", "sn", 120, 2018, "mate");

        MPilaL mp = new MPilaL(3);

        mp.npilas = 3;
        mp.adiMPila(li1, 0);
        mp.adiMPila(li2, 0);
        mp.adiMPila(li3, 0);
        mp.adiMPila(li3, 1);
        mp.adiMPila(li4, 2);
        mp.adiMPila(li5, 2);
        mp.mostrarMP();
        System.out.println("===================================");
        mostrarAutor(mp, "rojo");
        System.out.println("===================================");
        mostrarArea(mp, "prog");
        System.out.println("================ORDENAR===================");
        ordenarMPila(mp);
        mp.mostrarMP();
        /*
        mp.llenarMP(2);
        mp.mostrarMP();
         */
    }

    public static void ordenarMPila(MPilaL mp) {
        for (int i = 0; i < mp.max; i++) {

            PilaLibro cs = mp.mp[i];
            ordenar(cs);

        }

    }

    public static void ordenar(PilaLibro cs) {
        PilaLibro paux = new PilaLibro(cs.max);
        PilaLibro pord = new PilaLibro(cs.max);
        int sw=0,cp=0;
        int x=0; int may=0;
        while(!cs.esVacia()){
            Libro lib =cs.eliPila();
            may = lib.getEdicion();
            while(!cs.esVacia()){
                Libro lib2= cs.eliPila();
                x= lib2.getEdicion();
                if(x>may){
                    paux.adiPila(lib);
                    may=x;
                    lib= lib2;
                }else{
                    paux.adiPila(lib2);
                }
            }
            pord.adiPila(lib);
          
            
            cs.vaciarPilaLibro(paux);
        }
        cs.vaciarPilaLibro(pord);
    }

    

    public static void mostrarArea(MPilaL MP, String area) {
        for (int i = 0; i < MP.npilas; i++) {
            System.out.println("*Fila " + i + "___");
            PilaLibro pli = MP.mp[i];
            mostrarLibrosArea(pli, area);
        }
    }

    public static void mostrarLibrosArea(PilaLibro c, String area) {
        PilaLibro paux = new PilaLibro(c.max);
        while (!c.esVacia()) {
            Libro x = c.eliPila();
            if (x.getArea().equals(area)) {
                x.mostrarLibro();
            }
            paux.adiPila(x);
        }
        c.vaciarPilaLibro(paux);
    }

    public static void mostrarAutor(MPilaL mp, String au) {
        for (int i = 0; i < mp.npilas; i++) {
            System.out.println("*Fila " + i + "___");

            PilaLibro paux = new PilaLibro(mp.max);
            Libro x;
            while (!mp.esVacia(i)) {
                x = mp.eliMPila(i);
                if (x.getAutor().equals(au)) {
                    x.mostrarLibro();
                }
                paux.adiPila(x);
            }
            mp.vaciarMP(paux, i);
        }
    }

}
