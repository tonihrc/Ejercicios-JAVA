/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer001;

/**
 *
 * @author damiansualdea
 */
public class Cancion {

    private String titulo;
    private String autor;

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Cancion() {
        titulo = "";
        autor = "";
    }

    public String dameTitulo() {
        return titulo;
    }
    public String getTitulo() {
        return titulo;
    }
    public String dameAutor() {
        return autor;
    }
    public String getAutor() {
        return autor;
    }

    public void ponTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
   
    public void ponAutor(String autor) {
        this.autor = autor;
    }

}
