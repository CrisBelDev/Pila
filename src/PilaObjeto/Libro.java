/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PilaObjeto;

/**
 *
 * @author CHICHO
 */
public class Libro {
    private String titulo;
    private String autor;
    private String editorial;
    private int nroPaginas;
    private int edicion;
    private String area;

    public Libro() {
    }

    public Libro(String titulo, String autor, String editorial, int nroPaginas, int edicion, String area) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.nroPaginas = nroPaginas;
        this.edicion = edicion;
        this.area = area;
    }
    public void mostrarLibro(){
        System.out.println("titulo=" + titulo + ", " + autor + ", " + editorial + ", " + nroPaginas + ", " + edicion + ", " + area);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNroPaginas() {
        return nroPaginas;
    }

    public void setNroPaginas(int nroPaginas) {
        this.nroPaginas = nroPaginas;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    
    
}
