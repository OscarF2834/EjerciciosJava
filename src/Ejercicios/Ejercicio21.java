package Ejercicios;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        //pedir dos numeros y decir si un numero es multiplo de otro
        Scanner entrada = new Scanner(System.in);
        //Declaracion de las variables
        int numero1 , numero2;
        System.out.println("Inserta por favor el numero 1: ");
        numero1 = entrada.nextInt();
        System.out.println("Inserta por favor el numero 2: ");
        numero2 = entrada.nextInt();

        //Ahora, vamos haciendo la condicion:
        if (numero1 % numero2 ==0){
            System.out.println("El numeros son multiplos");
        }else {
            System.out.println("no son multiplos uno con el otro");
        }
    }
}
