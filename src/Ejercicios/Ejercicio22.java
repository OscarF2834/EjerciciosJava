package Ejercicios;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 22 de logica de programacion en java");
        /*
        Este ejercicio se trata de hacer que el usuario inserte una fecha, y esta tiene que decir
        si la fecha esta bien o esta mal, teniendo en cuenta que los meses tienen 31 dias o menos
         */
        Scanner entrada = new Scanner(System.in);
        //Declaracion de las variables de este programa:
        byte dia, mes;
        int año;
        System.out.println("Inserte por favor el numero del dia: ");
        dia = entrada.nextByte();
        System.out.println("Inserte por favor el numero del mes: ");
        mes = entrada.nextByte();
        System.out.println("Inserte por favor el numero del año: ");
        año = entrada.nextInt();

        //Ahora, vamos hacer el condicional:
        if (dia<31 && mes<12){
            System.out.println("La fecha que introduciste esta bien");
        }else {
            System.out.println("La fecha que introduciste esta mal");
        }
    }
}
