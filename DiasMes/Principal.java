/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DiasMes;

import java.util.Scanner;

/**
 *
 * @author damiansualdea
 */
public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //número de días que tiene un mes

        System.out.println("Introduce el número del mes");
        int mes = teclado.nextInt();
        int dias;
        int anyo;
        switch (mes) {
            case 1,3,5,7,8,10,12:
                dias = 31;
                break;
            case 2://preguntar si es bisiesto
                System.out.println("Introduce el año...");
                anyo = teclado.nextInt();

                if ((anyo % 4 == 0) && ((anyo % 100 != 0) || (anyo % 400 == 0))) {
                    dias = 29;
                }else
                    dias = 28;
            case 4,6,9,11:
                dias = 30;
                break;
            default:
                System.out.println("Te has colao, mes no válido");
                dias = -1;
        }

    }

}
