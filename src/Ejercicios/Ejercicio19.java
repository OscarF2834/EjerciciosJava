package Ejercicios;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        //Pedir dos numeros y decir si son iguales
        System.out.println("Ejercicio 19 de logica de programacion en java");
        Scanner entrada = new Scanner(System.in);

        //Declaracion de las variables
        int numero1, numero2;

        System.out.println("Inserte por favor el numero 1: ");
        numero1 = entrada.nextInt();
        System.out.println("Inserte por favor el numero 2: ");
        numero2 = entrada.nextInt();

        //hacemos la condicion
        if (numero1==numero2){
            System.out.println("Los numeros son iguales");
        }else {
            System.out.println("Los numeros son diferentes");
        }
    }
}
