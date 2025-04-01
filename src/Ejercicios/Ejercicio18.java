package Ejercicios;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 18 de logica de programacion en java");
        //Declaracion de las variables.
        Scanner entrada = new Scanner(System.in);
        float radio;
        System.out.println("Inserte por favor el radio: ");
        radio = entrada.nextFloat();

        //Ahora, calculamos la longitud de la circunferencia:
        float longitud = (float) (2*Math.PI*radio);

        System.out.println("La longitud de la circunferencia es de: " + longitud);
    }
}
