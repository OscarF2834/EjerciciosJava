package Ejercicios;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 17 de Logica de Programacion en Java");
        Scanner entrada = new Scanner(System.in);

        //Declaracion de las variables:
        float radio;
        System.out.println("Inserte por favor el radio del circulo: ");
        radio = entrada.nextFloat();

        //Ahora, calculamos su area:
        float area = (float) (Math.PI*Math.pow(radio,2));

        System.out.println("El area del circulo es de: " + area);
    }
}
