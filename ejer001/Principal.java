/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer001;

/**
 *
 * @author damiansualdea
 */
public class Principal {

    public static void main(String[] args) {
        Cancion c1 = new Cancion();
        Cancion c2 = new Cancion();
        Cancion c3 = new Cancion("Viva la fiesta", "Paco Pil");
        Cancion c4 = new Cancion("Esta sí esta no", "Chimo bayo");

        c1.ponAutor("Shakira");
        c1.ponTitulo("Sesión 53... salPiké");

        c2.ponAutor("Extremo duro");
        c2.ponTitulo("Jesucristo García");

        System.out.println(c1.dameTitulo() + " " + c1.dameAutor());
        System.out.println(c2.dameTitulo() + " " + c2.dameAutor());
        System.out.println(c3.dameTitulo() + " " + c3.dameAutor());
        System.out.println(c4.dameTitulo() + " " + c4.dameAutor());
    }
}
