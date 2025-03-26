package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Ejercicio de bucles");
        System.out.println("Aqui va el proceso del ejercicio de Programacion");
        System.out.println(" ");
        /*
        Declaracion de las variables que estan involucradas en este sistema
         */
        Scanner entrada = new Scanner(System.in);
        int numero, suma = 0;
        do {
            System.out.println("Inserte por favor el numero: ");
            numero = entrada.nextInt();
            suma += numero;
        }while (numero != 0);
        System.out.println(" ");
        System.out.println("La suma de todos los numeros es de: " + suma);
    }
}
