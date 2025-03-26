package Ejercicios;

public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Ejercicio numero 6 de logica de programacion con java");
        //Declaracion de las variables.
        int numero;
        float suma = 0;
        for (int i=1; i<20; i=i+2){
            //El cuerpo del ciclo
            System.out.println("Los numeros son: " + i);
            suma += i;
        }
        System.out.println("La suma de estos numeros es de: " + suma);
    }
}
