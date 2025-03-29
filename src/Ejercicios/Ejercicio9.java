package Ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 9 de Logica de Programación en Java");
        System.out.println(" ");
        /*
        El programa se trata de insertar 6 notas de alumnos y decir cuantos aprobaron y desaprobaron
         */
        Scanner entrada = new Scanner(System.in);
        float nota;
        int Contador = 1, NotaAprobada=0, NotaDesaprobada=0;

        while (Contador<=6){
            System.out.println("Ingrese por favor la nota numero: " + Contador);
            nota = entrada.nextFloat();
            //Ahora, hacemos la condicion de los que pasaron y no pasaron:
            if (nota>=7){
                NotaAprobada++;
            }else {
                NotaDesaprobada++;
            }
            Contador++;
        }
        System.out.println(" ");
        System.out.println("La cantidad de notas aprobadas es de: " + NotaAprobada);
        System.out.println("La cantidad de notas desaprobadas es de: " + NotaDesaprobada);
    }
}
