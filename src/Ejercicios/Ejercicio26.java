package Ejercicios;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 26 de logica de programacion en java");
        /*
        En este ejercicio lo que piden es hacer un ejercicio que me permita pedir numeros
        hasta que se inserte un numero cero y despues de eso contar los nuemros que se han contado
         */
        //Declaracion de las variables.
        Scanner entrada = new Scanner(System.in);
        int numero, condicion=0, cantidadNumeros = 0;

        while (condicion >= 0){
            System.out.println("Inserte por favor el numero: ");
            numero = entrada.nextInt();
            for (int i=0; i<=condicion; i++){
                cantidadNumeros++;
            }
            System.out.println("SI quiere seguir inserte un numero mayor a cero, si no uno negativo");
            condicion = entrada.nextInt();
            condicion++;
        }
        System.out.println(" ");
        System.out.println("La cantidad de numeros insertados es de: ");
        System.out.println(cantidadNumeros);
    }
}
