package Ejercicios;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 23 de logica de programacion en java");
        /*
        Este ejercicio consiste en leer un numero y mostrar su cuadrado, este proceso se debe
        repetir hasta que el usuario inserte un numero negativo
         */
        //Declaracion de las variables
        Scanner entrada = new Scanner(System.in);
        int numero, condicion=0;

        while (condicion>=0){
            System.out.println("Inserte por favor el numero para mostrar su cuadrado: ");
            numero = entrada.nextInt();
            int cuadrado = (int)(Math.pow(numero,2));
            System.out.println("El cuadrado del numero es: " + cuadrado);
            System.out.println(" ");
            System.out.println("Si quiere seguir con el programa pulse un numero positivo, si no uno menor que 0");
            condicion = entrada.nextInt();
            condicion++;
        }
    }
}
