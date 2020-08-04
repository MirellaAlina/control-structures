package ar.com.ada.online.second.exercisetwo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //  realice un algoritmo para determinar el sueldo semanal
        //  de un trabajador con base en las horas trabajadas y el
        //  pago por hora, considerando que después de las 40 horas
        //  cada hora se considera como excedente y se paga el doble.

        System.out.println("Programa para calcular sueldo semanal");

        double weeklySalary;
        double hoursWorked;
        double hourly;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese las horas trabajadas: ");
        hoursWorked = keyboard.nextDouble();

        System.out.print("Ingrese el pago por hora: ");
        hourly = keyboard.nextDouble();

        if (hoursWorked < 40) {
            weeklySalary = hourly * hoursWorked;
        } else {
            weeklySalary = hourly * (hoursWorked - 40)* 2 + 40;
        }
        System.out.print("El sueldo semanal es: " + weeklySalary);

    }
}
