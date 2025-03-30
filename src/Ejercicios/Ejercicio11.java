package Ejercicios;

import javax.swing.*;

public class Ejercicio11 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Ejercicio 11 de Logica de Programación en Java");
        /*
        Declaracion de las variables que estan involucradas en este programa son las
        siguientes:
         */
        float nota;
        byte Condicion=0, alumnosAprobados=0, alumnosDesaprobados =0;

        while (Condicion<5){
            //Aqui va el componente del bucle
            nota = Float.parseFloat(JOptionPane.showInputDialog("Inserte la nota del alumno numero " + Condicion));
            for (int i=0; i<5; i++){
                if (nota>=7){
                    alumnosAprobados++;
                }else {
                    alumnosDesaprobados++;
                }
            }
            Condicion++;
        }
        JOptionPane.showMessageDialog(null, "Los alumnos que aprobaron fueron: " + alumnosAprobados);
        JOptionPane.showMessageDialog(null, "Los alumnos que Desaprobaron fueron: " + alumnosDesaprobados);
    }
}
