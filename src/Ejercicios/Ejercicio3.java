package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        /*
        Vamos a declarar las variables que estan involucradas
        en este sistema. Este problema es poner el total a pagar junto con el
        descuento que se le va hacer
         */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese por favor la cantidad de piezas de pan");
        int CantidadPiezas = entrada.nextInt();
        Double PiezaPan = 5.0;
        Double ValorPagar = 0.0;

        //Ahora, vamos hacer las condiciones
        if (CantidadPiezas>=50 && CantidadPiezas<100){
            PiezaPan = 4.50;
            ValorPagar = PiezaPan * CantidadPiezas;
            System.out.println("El valor a pagar es de: " + ValorPagar);
        } else if (CantidadPiezas>=100) {
            PiezaPan = 4.0;
            ValorPagar = PiezaPan * CantidadPiezas;
            System.out.println("El valor total que le salio es de: " + ValorPagar);
        }else if (CantidadPiezas<50){
            PiezaPan = 5.0;
            ValorPagar = PiezaPan * CantidadPiezas;
            System.out.println("El valor total que le salio es de: " + ValorPagar);
        }
    }
}
