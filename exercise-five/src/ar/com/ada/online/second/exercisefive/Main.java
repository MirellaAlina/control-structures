package ar.com.ada.online.second.exercisefive;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Se tiene el nombre y la edad de tres personas.
        // Se desea saber el nombre y la edad de la persona de menor edad.

        System.out.println("Saber nombre y edad de la persona de menor edad");

        String nameOne;
        String nameTwo;
        String nameThree;
        int ageOne;
        int ageTwo;
        int ageThree;
        String youngerPerson = "none";
        int youngerPersonAge = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la primer persona a evaluar: ");
        nameOne = keyboard.next();
        System.out.print("Ingrese la edad: ");
        ageOne = keyboard.nextInt();

        System.out.print("ingrese el nombre de la segunda persona a evaluar: ");
        nameTwo = keyboard.next();
        System.out.print("Ingrese la edad: ");
        ageTwo = keyboard.nextInt();

        System.out.print("ingrese el nombre de la tercera persona a evaluar: ");
        nameThree = keyboard.next();
        System.out.print("Ingrese la edad: ");
        ageThree = keyboard.nextInt();

        if (ageOne < ageTwo && ageOne < ageThree) {
            youngerPerson = nameOne;
            youngerPersonAge = ageOne;
        } else if (ageTwo < ageThree && ageTwo < ageOne) {
            youngerPerson = nameTwo;
            youngerPersonAge = ageTwo;
        } else if (ageThree < ageOne && ageThree < ageTwo) {
            youngerPerson = nameThree;
            youngerPersonAge = ageThree;
        }

        System.out.println("La persona de edad es: " + youngerPerson);
        System.out.println("su edad es: " + youngerPersonAge);


    }
}
