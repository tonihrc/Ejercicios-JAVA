/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer002;

/**
 *
 * @author damiansualdea
 */
public class Principal {
    public static void main(String[] args) {
        Cafetera deLonghi = new Cafetera();
        Cafetera nessPresso = new Cafetera(1500);
        Cafetera dolceGusto = new Cafetera(1600, 2000);
        
        deLonghi.setNombre("deLonghi");
        nessPresso.setNombre("nessPresso");
        dolceGusto.setNombre("dolceGusto");
        

        deLonghi.mostrarContenido();
        nessPresso.mostrarContenido();
        dolceGusto.mostrarContenido();
        
        deLonghi.llenarCafetera();
        deLonghi.mostrarContenido();
        
        nessPresso.servirTaza(600);
        nessPresso.mostrarContenido();
        nessPresso.servirTaza(800);
        nessPresso.mostrarContenido();
        nessPresso.servirTaza(1000);
        nessPresso.mostrarContenido();
        
        dolceGusto.vaciarCafetera();
        dolceGusto.mostrarContenido();
        
        
    }
}
