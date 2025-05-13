package Ejercicios;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 27 de logica de programacion en java");
        /*
        Hacer un juego que permita ir pdidiendo numeros y despues ir diciendo si el numero es mayor
        o menor al numero que inserte y eso ir haciendolo hasta que se acierte el numero
         */
        Scanner entrada = new Scanner(System.in);

        int numero, n;

        System.out.println("Inserte por favor el numero: ");
        numero = entrada.nextInt();

        System.out.println("Inserte el numero que ahy que acertar: ");
        n = entrada.nextInt();

        //hacemos el ciclo:
        while (numero!=n){
            if (numero<n){
                System.out.println("El numero es menor");
            }else {
                System.out.println("El numero es mayor");
            }
            System.out.println("Introduce el numero: ");
            numero = entrada.nextInt();
        }
        System.out.println("ACERTASTE");

        final int pi = (int)(3.14159);

        //operador ternario es una forma de hacer un CONDICIONAL
        byte numero3 = 5;
        String resultado = (numero3%2==0) ? "PAR" : "IMPAR";
        System.out.println("El numero 5 es: " + resultado);
    }
}
