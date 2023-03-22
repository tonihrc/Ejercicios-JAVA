/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer16;

import java.util.Scanner;

/**
 *
 * @author damiansualdea
 */
public class Principal {

    /*
    Hacer un programa que lea dos cadenas de caracteres y forme una tercera intercalando los
    caracteres de las palabras de las dos primeras cadenas. Escribir las tres cadenas.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce cadena 1: ");
        String cadena1 = teclado.nextLine();
        System.out.println("Introduce cadena 2: ");
        String cadena2 = teclado.nextLine();

        System.out.println(cadena1 + cadena2);
        String cadena3 = "";
        //método de concatenación

        cadena3 += cadena1.charAt(0);
        System.out.println(cadena3);
        cadena3 = "";
        //Recorrer la cadena más larga
        int tamMax = Math.max(cadena1.length(), cadena2.length());

        for (int i = 0; i < tamMax; i++) {
            if(i<cadena1.length() && i<cadena2.length()){
                cadena3=cadena3.concat(String.valueOf(cadena1.charAt(i))+String.valueOf(cadena2.charAt(i)));
            }else if (i>=cadena1.length()){
                cadena3=cadena3.concat(String.valueOf(cadena2.charAt(i)));
            }else{
                cadena3=cadena3.concat(String.valueOf(cadena1.charAt(i)));
            }  
        }
        System.out.println(cadena3);
    }
}
