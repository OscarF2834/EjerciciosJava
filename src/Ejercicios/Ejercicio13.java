package Ejercicios;

import javax.swing.*;

public class Ejercicio13 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Ejercicio 13 de Logica de Programación en java");
        /*
        Este programa se trata de insertar 10 numeros a un arreglo y despues
        imprimirlos en forma de que el primero sea con el ultimo, el segundo con el penultimo
        y asi sucesivamente
         */
        int Arreglo[] = new int[10];

        //Ahora lo llenamos con el ciclo
        for (int i=0; i< Arreglo.length; i++){
            Arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero: " + i));
        }

        //Ahora lo recorremos
        for (int j = 0; j < 5; j++){
            JOptionPane.showMessageDialog(null,Arreglo[j]);
            JOptionPane.showMessageDialog(null, Arreglo[9-j]);
        }
    }
}
