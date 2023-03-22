/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ahorcado;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author damiansualdea
 */
public class Principal {

    /*
    El juego del ahorcado es un juego en el que el objetivo es adivinar una palabra oculta. 
    Se empieza con una palabra oculta formada por asteriscos (*), 
    y se van revelando sus letras a medida que el usuario adivina correctamente. 
    Si el usuario falla al adivinar una letra, se le resta una vida. 
    Si se acaban las vidas, el juego termina y el usuario ha perdido. 
    Si consigue adivinar la palabra antes de que se acaben las vidas, ha ganado.
     */
    public static void main(String[] args) {
        String palabra = "murciegalo";
        //Trabajar con arrays
        //Pasar la cadena a arrays, palabra.toCharArray();
        char[] palabraArray = new char[palabra.length()];

        for (int i = 0; i < palabraArray.length; i++) {
            palabraArray[i] = palabra.charAt(i);
        }
        System.out.println(Arrays.toString(palabraArray));
        //Crear la cadena de *'s
        char[] asteriscos = new char[palabra.length()];
        for (int i = 0; i < asteriscos.length; i++) {
            asteriscos[i] = '*';
        }
        System.out.println(Arrays.toString(asteriscos));

        Scanner teclado = new Scanner(System.in);
        int vidas = 3;
        String letraString;
        char letra;
        //terminado cuando acertamos o perdemos todas las vidas
        do {
            System.out.println("Introduce una letra, machot@: ");
            letraString = teclado.next();
            letra = letraString.charAt(0);
            if (palabra.contains(String.valueOf(letra))) {
                for (int i = 0; i < palabra.length(); i++) {
                    /*
                    if (palabra.equalsIgnoreCase(String.valueOf(letra))) {
                       
                    }
                     */
                    if (letra == palabra.charAt(i)) {
                        asteriscos[i] = letra;
                    }
                }
                System.out.println(Arrays.toString(asteriscos));

            } else {
                vidas--;
                System.out.println("Letra no encontrada, te quedan: " + vidas + " vidas");
            }
        } while (vidas > 0 && !Arrays.equals(asteriscos, palabraArray));
        
        if(vidas==0){
            System.out.println("Has perdido");
        }else {
            System.out.println("Has ganado, te han sobrado: "+vidas+" vidas");
        }
                

    }

}
