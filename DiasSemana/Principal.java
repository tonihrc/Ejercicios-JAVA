/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DiasSemana;

import java.util.Scanner;

/**
 *
 * @author damiansualdea
 */
public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //ASIGNACIONES

        double n1 = 90;
        double n2;

        n2 = n1;

        n2 = n2 * 2;

        n2 += 2;

        n2++;
        n2 += 1;
        int i;

        {
            i = 4;
        }

        //el usuario introduce un número del 1 al 7, decirle el día de la semana
        System.out.println("Introduce el número de la semana");
        int dia = teclado.nextInt();
        String nomDia;
        switch (dia) {
            case 1:
                nomDia="Lunes";
                break;
            case 2:
                nomDia="Martes";
                break;
            case 3:
                nomDia="Miercoles";
                break;
            case 4:
                nomDia="Jueves";
                break;
            case 5:
                nomDia="Viernes";
                break;
            case 6:
                nomDia="Sábado";
                break;
            case 7:
                nomDia="Domingo";
                break;
            default:
                nomDia="no válido";
        }
        System.out.println("El día es... "+nomDia);

    }
}
