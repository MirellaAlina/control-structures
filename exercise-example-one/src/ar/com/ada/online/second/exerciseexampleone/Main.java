package ar.com.ada.online.second.exerciseexampleone;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numberOne; //A
        int numberTwo; //B
        int mayor; //M

        Scanner keyboard = new Scanner(System.in);

        System.out.print("ingrese el primer numero a evaluar ");
        numberOne = keyboard.nextInt();

        System.out.print("Ingrese el segundo numero a evaluar ");
        numberTwo = keyboard.nextInt();

        if (numberOne > numberTwo) {
            // resultado true
            mayor = numberOne;
        } else {
            // resultado false
            mayor = numberTwo;
        }

        System.out.println("el numero mayor es " + mayor);
    }
}
