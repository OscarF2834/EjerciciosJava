package Ejercicios;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        /*
        Ejercicio que consiste en tener dos arreglos, y el tercero tener que llenarlo de tal forma
        que contenga 3 del primero, 3 del segundo y asi sucesivamente
         */
        System.out.println("Ejercicio 15 de Logica de Programación en Java");
        Scanner entrada = new Scanner(System.in);

        //Declaracion de las variables
        int A[] = new int[12];
        int B[] = new int[12];
        int C[] = new int[24];

        System.out.println(" ");
        //Ahora, vamos a llenar los vectores A y B
        System.out.println("Insercion de los valores en el vector A");
        for (int i = 0; i < A.length; i++) {
            System.out.println("Inserte por favor el numero en la posicion: " + i);
            A[i] = entrada.nextInt();
        }

        System.out.println(" ");
        System.out.println("Insercion de los valores en el vector B");
        for (int i = 0; i < B.length; i++) {
            System.out.println("Inserte por favor el numero en la posicion: " + i);
            B[i] = entrada.nextInt();
        }
        System.out.println(" ");
        //Ahora, se viene la parte complicada del ejercicio, hacer el ordenamiento:
        int i=0, j=0;

        while (i<12){
            for (int k=0; k<3; k++){
                C[j] = A[i+k];
                j++;
            }
            for (int k=0; k<3; k++){
                C[j] = B[i+k];
            }
            i+=3;
        }
        System.out.println(" ");
        System.out.println("El arreglo C, quedaria de la siguiente manera: ");
        for (j=0; j<24; j++){
            System.out.println(C[j]);
        }
    }
}
