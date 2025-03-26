package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        /*
        Vamos hacer el segundo ejercicio de logica de programacion en java
         */
        //Saber cual es el numero mayor de un arreglo.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese por favor la cantidad de datos del vector: ");
        System.out.println(" ");
        int Cantidad = entrada.nextInt();
        int numeros[] = new int[Cantidad];
        int Numeromayor = 0;

        //Ahora, vamos a llenar ese vector:
        for (int i=0; i< numeros.length; i++){
            System.out.println("Ingrese el numero es la posicion " + i);
            numeros[i] = entrada.nextInt();
        }

        //Ahora, vamos a hacer las respectivas condiciones:
        for (int i=0; i<numeros.length; i++){
            if(numeros[i]>Numeromayor){
                Numeromayor = numeros[i];
            }
        }
        System.out.println(" ");
        System.out.println("El numero mayor es: " + Numeromayor);
    }
}
