package Ejercicios;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 24 de logica de programacion en java");
        /*
        Este programa consiste en decir si el numero que inserta el usuario es un numero positivo
        o negativo, asi hasta que el usuario inserte como condicion un numero 0
         */
        Scanner entrada = new Scanner(System.in);
        //Declaracion de las variables:
        int numero, condicion=0;

        do {
            System.out.println("Inserte por favor el numero: ");
            numero = entrada.nextInt();
            if (numero<0){
                System.out.println("El numero es negativo");
            } else if (numero>0) {
                System.out.println("El numero es positivo");
            }else {
                System.out.println("El numero es neutro o cero");
            }
            System.out.println(" ");
            System.out.println("Si quiere seguir con el programa, inserte un numero que no sea cero y positivo");
            condicion = entrada.nextInt();
            condicion++;
        }while (condicion!=0);
    }
}
