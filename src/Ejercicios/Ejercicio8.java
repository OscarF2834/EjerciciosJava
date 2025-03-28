package Ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println("Ejercicio numero 8 de logica de programacion");
        /*
        Este ejercicio se enfoca en la gestion de facturas y tenemos que cumplir con una serie
        de requisitos y son las siguentes
        Se ingresara el codigo del producto vendido
        se ingresara la cantidad de kilos vendida y el total a pagar por kilos
        De 5 facturas se pide el valor total de las facturas, cantidad de kilos vendida y cuantas
        facturas emitidas fueron por mas de 1000
         */

        Scanner entrada = new Scanner(System.in);
        System.out.println("Sistema de Gestion de facturas");
        System.out.println(" ");
        //Declaracion de las variables
        int CodigoFactura, x=0,  FacturasMayores=0;
        float CantidadKilos, ValorKilo, ValorFactura = 0, SumaFactura=0;

        while (x<5){
            System.out.println("Ingrese el valor por kilo de azucar: ");
            ValorKilo = entrada.nextFloat();
            System.out.println("Ingrese el codigo de la factura: ");
            CodigoFactura = entrada.nextInt();
            System.out.println("La cantidad de kilos de azucar vendidas es de: ");
            CantidadKilos = entrada.nextFloat();

            //El valor de la factura:
            ValorFactura = ValorKilo * CantidadKilos;
            SumaFactura += ValorFactura;

            //Ahora, hacemos una condicion.
            if (ValorFactura>=1000){
                FacturasMayores++;
            }
            x++;
        }
        System.out.println(" ");
        System.out.println("El valor total de las facturas es de: " + SumaFactura);
        System.out.println("Las facturas mayores a mil son de: " + FacturasMayores);
    }
}
