package Ejercicios;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 25 de logica de programacion en java");
        /*
        El programa consiste en decir si el numero es par o es impar, y esto se debe hacer siempre
        y cuando el usuario no inserte un cero
         */
        Scanner entrada = new Scanner(System.in);
        //Declaracion de las variables
        int numero, condicion = 0;

        while (condicion!=0){
            System.out.println("Inserte por favor el numero: ");
            numero = entrada.nextInt();
            if (numero%2==0){
                System.out.println("El numero es par");
            }else {
                System.out.println("El numero es impar");
            }
            System.out.println("Si quiere seguir pulse un numero diferente de cero");
            condicion = entrada.nextInt();
            condicion++;
        }
    }
}
