package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Ejercicio de matrices o de arrays o vectores ");
        /*
        Vamos a declarar las variables que estan involucradas en este sistema o en
        este software
         */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Inserte por favor la cantidad de ventas que quiere ingresar en el arreglo: ");
        int CantidadVentas = entrada.nextInt();
        int Ventas[] = new int[CantidadVentas];
        int CantidadMayores=0;

        //Ahora vamos a llenar el vector:
        for (int i=0; i< Ventas.length; i++){
            //Aqui vamos a llenar el vector de la ventas
            System.out.println("Inserte por favor el valor de la venta en la posicion: " + i);
            Ventas[i] = entrada.nextInt();
        }
        System.out.println(" ");
        //Ahora, el siguiente paso es recorrerlo y poder hacer las condiciones:
        for (int i=0; i<Ventas.length; i++){
            if (Ventas[i]>= 2000){
                CantidadMayores++;
                System.out.println("Las ventas mayores a dos mil son: ");
                System.out.println(Ventas[i]);
            }
        }
        System.out.println(" ");
        System.out.println("La cantidad de ventas mayores a 2000 es de: " + CantidadMayores);
    }
}