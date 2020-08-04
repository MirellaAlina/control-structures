package ar.com.ada.online.second.exercisethree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // El 14 de febrero una persona desea comprarle un regalo
        // al ser querido que más aprecia en ese momento,
        // su dilema radica en qué regalo puede hacerle,
        // las alternativas que tiene son las siguientes:

        //REGALO
        //Tarjeta
        //$10.00 o menos
        //Chocolates
        //$11.00 a $100.00
        //Flores
        //$101.00 a $250.00
        //Anillo
        //Más de $251.00

        System.out.println("Programa para determinar que regalo puede comprar");

        double availableMoney;
        String present;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el dinero disponible: ");
        availableMoney = keyboard.nextDouble();

        if (availableMoney <= 10) {
            present = "Tarjeta";
        } else if (availableMoney <=100) {
            present = "Chocolates";
        } else if (availableMoney <= 250) {
            present = "Flores";
        } else {
            present = "Anillo";
        }

        System.out.print("El regalo que puede comprar es: " + present);
    }
}
