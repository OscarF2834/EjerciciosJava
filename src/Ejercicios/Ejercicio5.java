package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Ejercicio numero 5");
        /*
        Solo se deben capturar numeros positivos y con respecto a ello
        solo se debe contar el promedio de esos numeros positivos
         */
        Scanner entrada = new Scanner(System.in);
        int numero=0,i = 0;
        float promedio = 0, suma = 0;
        while (numero>=0){
            System.out.println("Inserta por favor el numero: ");
            numero = entrada.nextInt();
            suma += numero;
            promedio = suma/i;
            i++;
        }
        System.out.println("El promedio de los numeros es de: " + promedio);
    }
}
