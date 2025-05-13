package Ejercicios;

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 28 de logica de programacion en java");
        /*
        El ejercicio consiste en poner numeros hasta que se inserte un cero, ya cuando se
        inserte ese numero entonces se tiene que sumar los valores de los numeros
         */
        Scanner entrada = new Scanner(System.in);
        int numero, condicion=0, suma=0;

        do {
            System.out.println("Inserte por favor el numero: ");
            numero = entrada.nextInt();
            suma += numero;
            System.out.println("si quiere seguir por favor inserte un numero menos el cero");
            condicion = entrada.nextInt();
        }while (condicion!=0);

        System.out.println(" ");
        System.out.println("La suma de los numeros es de: " + suma);
    }
}
