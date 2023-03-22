/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerNotas;

import java.util.Scanner;

/**
 *
 * @author damiansualdea
 */
public class Principal {

    public static void main(String[] args) {
        /*  
        programa que dependiendo de la nota que introduzca el docente
        nos diga si ha sido un notable, bien, suficiente, sobresaliente, suspenso, matrícula de honor
            0-4.99 no llegando al 5 suspenso
            5 - 6 no llegando al 6 es suficiente
            6 - 7 bien
            7-9 notable
            9-9.999 es sobresaliente
            10 MH
        en la condición números enteros
         */

        //ENTRADA DE DATOS
        Scanner teclado = new Scanner(System.in);
        double nota = teclado.nextDouble();

        //ALGORITMO --> 1º a pensar
        //< > <= >= != == operadores de comparación
        //! && || operaadores lógicos
        //---------**AA
        if (nota < 0) {
            System.out.println("Te has flipaooo por abajo");
        } else //nota >= 0
        if (nota < 5) {
            System.out.println("Suspenso");
        } else //nota >= 5
        if (nota < 6) {
            System.out.println("Suficiente");
        } else // nota >= 6 .... nota >=5
        if (nota < 7) {
            System.out.println("Bieeeen");
        } else // nota >=7
        if (nota < 9) {
            System.out.println("Notable");
        } else //nota >= 9
        if (nota < 10) {
            System.out.println("Sobresaliente");
        } else //nota >= 10
        if (nota == 10) {
            System.out.println("Matrícula de honor");
        } else { //nota > 10
            System.out.println("Te has flipaooo por arriba");
        }

        //SALIDA DE DATOS
        String salida = "";
        if (nota < 0) {
            salida = "Te has flipaooo por abajo";
        } else //nota >= 0
        if (nota < 5) {
            salida = "Suspenso";
        } else //nota >= 5
        if (nota < 6) {
            salida = "Aprobado";
        } else // nota >= 6 .... nota >=5
        if (nota < 7) {
            salida = "bien";
        } else // nota >=7
        if (nota < 9) {
            salida = "Notable";
        } else //nota >= 9
        if (nota < 10) {
            salida = "Sobresaliente";
        } else //nota >= 10
        if (nota == 10) {
            salida = "Matrícula de honor";
        } else { //nota > 10
            salida = "Te has flipaooo por arriba";
        }
        //SALIDA DE DATOS
        System.out.println(salida);

        //! && || operadores lógicos
        // && --> Y --> AND
        // true && true --> true
        // true && false --> falsa
        // false && true --> falsa
        // false && false --> falsa
        //|| --> O --> OR
        // true || true --> true
        // true || false --> true
        // false || true --> true
        // false || false --> falsa
        //-----********-------
        //TRABAJAR CON IF INDEPENDIENTES
        if ((nota >= 0) && (nota < 5)) {
            System.out.println("SUSPENSO");
        } else if ((nota >= 5) && (nota < 6)) {
            System.out.println("APROBADO");
        } else if ((nota >= 6) && (nota < 7)) {
            System.out.println("BIEN");
        } else if ((nota >= 7) && (nota < 9)) {
            System.out.println("NOTABLE");
        } else if ((nota >= 9) && (nota < 10)) {
            System.out.println("SOBRESALIENTE");
        } else if (nota == 10) {
            System.out.println("Matrícula de honor");
        } else // TODO LO QUE NO HEMOS DEFINIDO EN LOS RANGOS
        if (nota < 0) {
            System.out.println("Tas colaaaaooooooo por abajo");
        } else {
            System.out.println("Te has colaooooo por arriba");
        }
//menu
//==
//< > <= >= --> NO LO HACE SWITCH

//== !=
        int nota2 = teclado.nextInt();
        switch (nota2) {
            case 0:
                System.out.println("SUSPENSO");
                break;
            case 1:
                System.out.println("SUSPENSO");
                break;
            case 2:
                System.out.println("SUSPENSO");
                break;
            case 3:
                System.out.println("SUSPENSO");
                break;
            case 4:
                System.out.println("SUSPENSO");
                break;
            case 5:
                System.out.println("APROBADO");
                break;
            case 6:
                System.out.println("BIEN");
                break;
            case 7:
                System.out.println("BIEN");
                break;
            case 8:
                System.out.println("NOTABLE");
                break;
            case 9:
                System.out.println("SOBRESALIENTE");
                break;
            case 10:
                System.out.println("MATRÍCULA DE HONOR");
                break;
            default:
                if (nota2 < 0) {
                    System.out.println("Tas colaaaaooooooo por abajo");
                } else {
                    System.out.println("Te has colaooooo por arriba");
                }
        }
    }

}
