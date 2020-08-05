package ar.com.ada.online.second.exercisefour;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// determinar cuánto debe cobrar por el uso
        // del estacionamiento a sus clientes.
        // Las tarifas que se tienen son las siguientes:
        // a. Las dos primeras horas a $5.00 c/u.
        // b. Las siguientes tres a $4.00 c/u.
        // c. Las cinco siguientes a $3.00 c/u.
        // d. Después de diez horas el costo por cada una es de dos pesos.

        System.out.println("Programa para determinar el costo de un estacionamiento");

        double parkingValue =0;
        double hoursSpent;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese las horas que estuvo estacionado: ");
        hoursSpent = keyboard.nextDouble();

        if (hoursSpent <= 2) {
            parkingValue = hoursSpent * 5;
        } else if (hoursSpent <= 5) {
            parkingValue = (hoursSpent - 2) * 4 + 10;
        } else if (hoursSpent <= 10) {
            parkingValue = (hoursSpent - 5) * 3 + 22;
        } else if (hoursSpent > 10) {
            parkingValue = (hoursSpent - 10) * 2 + 37;
        }

        System.out.print("El valor del estacionamiento es: $" + parkingValue);
    }
}
