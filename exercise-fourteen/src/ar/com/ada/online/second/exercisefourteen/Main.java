package ar.com.ada.online.second.exercisefourteen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Realice un algoritmo que, con base en una calificación proporcionada (0-10),
        // indique con letra la calificación que le corresponde: 10 es “A”, 9 es “B”,
        // 8 es “C”, 7 y 6 son “D”, y de 5 a 0 son “F”

        System.out.println("Programa que indica con letra la calificacion");

        int numericalRating;
        char alphabeticalRating;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la calificación numérica: ");
        numericalRating = keyboard.nextInt();

        switch (numericalRating) {
            case 10:
                alphabeticalRating = 'A';
                break;
            case 9:
                alphabeticalRating = 'B';
                break;
            case 8:
                alphabeticalRating = 'C';
                break;
            case 7:
            case 6:
                alphabeticalRating = 'D';
                break;
            default:
                alphabeticalRating = 'F';
        }
        System.out.println("La calificación es: " + alphabeticalRating);

    }
}

