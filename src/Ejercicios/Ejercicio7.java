package Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Ejercicio numero 7 de logica de programacion");
        /*
        El programa pedira 10 numeros enteros y tenemos que hallar primero que
        el promedio de los numeros impares y despues el primedio de los numeros
        pares y saber cuantos ceros se registraron en el programa
         */
        Scanner entrada = new Scanner(System.in);
        //Declaracion de las variables:
        int numero, CantidadNegativos = 0, CantidadPositivos = 0, CantidadCeros = 0;
        float PromedioPositivos = 0, SumaPositivos = 0, PromedioNegativos = 0, SumaNegativos = 0;

        for (int i=0; i<10; i++){
            System.out.println("Ingresa por favor el numero: ");
            numero = entrada.nextInt();
            //Hacemos la condicion del problema:
            if (numero < 0){
                CantidadNegativos++;
                SumaNegativos += numero;
                PromedioNegativos = SumaNegativos / CantidadNegativos;
            } else if (numero > 0) {
                CantidadPositivos++;
                SumaPositivos += numero;
                PromedioPositivos = SumaPositivos / CantidadPositivos;
            }else {
                CantidadCeros++;
            }
        }
        //Ahora, imprimimos los resultados
        System.out.println(" ");
        System.out.println("La El promedio de los numeros positivos es de: " + PromedioPositivos);
        System.out.println("El promedio de los numeros negativos es de: " + PromedioNegativos);
        System.out.println("La cantidad de ceros que inserto es de:" + CantidadCeros);
    }
}
