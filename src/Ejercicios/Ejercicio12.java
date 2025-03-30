package Ejercicios;

import javax.swing.*;

public class Ejercicio12 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Ejercicio 12 de Logica de Programación en Java");
        /*
        Vamos hacer la declaracion de las variables que estan involucradas en este programa
        El ejercicio consiste en guardar los datos y mostralos en su orden inverso
         */
        int Arreglo[] = new int[5];

        //Ahora, vamos a llenarlo
        for (int i=0; i< Arreglo.length; i++){
            Arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero en la posicion " + i));
        }
        //Ahora, vamos a recorrerlo de forma inversa
        for (int i=4; i>=0; i--){
            JOptionPane.showMessageDialog(null,Arreglo[i]);
        }
    }
}
