package Ejercicios;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        System.out.println("Ejercicio de logica de Programacion en Java");
        Scanner entrada = new Scanner(System.in);
        int a,b,c;
        double x1, x2;
        System.out.println("Inserte por favor el valor del coeficiente a: ");
        a = entrada.nextInt();
        System.out.println("Inserte por favor el valor del coeficiente b: ");
        b = entrada.nextInt();
        System.out.println("Inserte por favor el valor del coeficiente c: ");
        c = entrada.nextInt();

        //Ahora, hacemos la solucion de esa ecuacion, teniendo los coeficientes
        x1 = -b + (Math.sqrt(Math.pow(b,2) - 4*a*c)) / 2*a;
        x2 = -b - (Math.sqrt(Math.pow(b,2) - 4*a*c)) / 2*a;
        System.out.println(" ");
        System.out.println("El primer resultado es: " + x1);
        System.out.println("El segundo resultado es: " + x2);
    }
}
