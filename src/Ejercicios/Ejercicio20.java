package Ejercicios;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        //Decir si un numero es positivo o negativo
        System.out.println("Ejercicio 20 de logica de programacion en java");
        Scanner entrada = new Scanner(System.in);

        int numero;
        System.out.println("Ingresa por favor el numero");
        numero = entrada.nextInt();

        //Ahora, hacemos la condicion.
        if (numero<0){
            System.out.println("el numero es negativo");
        } else if (numero>0) {
            System.out.println("El numero es positivo");
        }else {
            System.out.println("El numero equivale a cero");
        }
    }
}
