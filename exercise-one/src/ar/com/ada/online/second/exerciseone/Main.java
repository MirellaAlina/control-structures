package ar.com.ada.online.second.exerciseone;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Realice un algoritmo para determinar si una persona
        // puede votar con base en su edad en las próximas elecciones
        System.out.println("Programa que determina si una persona puede votar");

        int age;
        String result;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la edad: ");
        age = keyboard.nextInt();

        if (age >= 16) {
             result = "Puede votar";
        } else {
            result = "no puede votar";
        }

        System.out.println("La persona " + result);
    }
}
