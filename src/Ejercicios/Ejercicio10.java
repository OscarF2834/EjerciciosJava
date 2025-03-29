package Ejercicios;

import javax.swing.*;

public class Ejercicio10 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Ejercicio 10 de Logica de Programación en Java");
        System.out.println(" ");
        /*
        Este ejercicio consiste en utilizar el JOptionPane y consiste en introducir N sueldos
        estos los inserta el usuario y luego decir cual es el sueldo mayor insertado
         */
        //Declaracion de las variables
        float sueldo, sueldoMayor=0;
        byte CantidadSueldos, Condicion=1;
        CantidadSueldos = Byte.parseByte(JOptionPane.showInputDialog("Inserte la cantidad de sueldos"));

        while (Condicion<=CantidadSueldos){
            sueldo = Float.parseFloat(JOptionPane.showInputDialog("Inserte el sueldo"));
            //hacemos la condicion:
            for (int i=0; i<CantidadSueldos; i++){
                if (sueldoMayor<sueldo){
                    sueldoMayor = sueldo;
                }
            }
            Condicion++;
        }
        JOptionPane.showMessageDialog(null,"El sueldo mayor es: " + sueldoMayor);
    }
}
