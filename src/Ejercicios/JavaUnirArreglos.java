//ESTE ES UN EJEMPLO PARA ESTUDIARLO MAS A FONDO

/*
Lo que tienes que entender primero es como funciona un Array de datos, una de las principales características
es que los Array son de una dimensión fija, esto tiene un trasfondo complejo pero en pocas palabras, cuando se
trabaja con un array los espacios se reservan en memoria desde el momento de su creación y si se permitiera
redimensionarlos el sistema tendría que verificar el espacio en memoria para determinar si es posible o se tendría
que alojar en un nuevo espacio, eso es genera más consumo de recursos y latencia, según qué tipo de programación
hagas (como sockets) te puede importar más o menos, para arreglos dinámicos se utilizan listas como por ejemplo
ArrayList.

Te dejo un ejemplo de cómo se unen 2 Arrays esto es más fácil o complejo según si utilizas tipos primitivos
cono int u objetos como Integer para el arreglo, pero ambos métodos se basan el la misma premisa crear un
nuevo array con el largo de los 2 array a unir y cargar dentro de este nuevo array los datos de ambos.
 */

package Ejercicios;

import java.util.Arrays;
import java.util.stream.Stream;

    public class JavaUnirArreglos {
        public static void main(String[] args) {
            // Uniendo Arrays de tipo primitivo int
            // Asigno los valores de esta forma para que se mas claro.
            int datosA [] = new int [5];
            datosA[0] = 0;
            datosA[1] = 1;
            datosA[2] = 2;
            datosA[3] = 3;
            datosA[4] = 4;

            int datosB [] = new int [5];
            datosB[0] = 5;
            datosB[1] = 6;
            datosB[2] = 7;
            datosB[3] = 8;
            datosB[4] = 9;

            int[] datosC = unirInt(datosA, datosB);
            System.out.println("union de int: " + Arrays.toString(datosC)); // Impresión de resultado.

            // Uniendo Arrays con Java 8+ Stream API

            Integer datosX [] = new Integer [5];
            datosX[0] = 0;
            datosX[1] = 1;
            datosX[2] = 2;
            datosX[3] = 3;
            datosX[4] = 4;

            Integer datosY [] = new Integer [5];
            datosY[0] = 5; datosY[1] = 6; datosY[2] = 7; datosY[3] = 8; datosY[4] = 9;

            Integer[] datosZ = unirIntegerStream(datosX, datosY);

            System.out.println("union de Integer: " + Arrays.toString(datosZ)); // Impresión de resultado.
        }

        public static int[] unirInt(int[] a, int[] b){
            //Obtenemos el largo de cada array
            int largoA = a.length;
            int largoB = b.length;

            // Creamos el nuevo array donde se uniran con la suma del largo de A y B
            int[] nuevoArray = new int[largoA + largoB];

            // Utilizamos el método System.arraycopy, pasamos el ArrayA
            // y que copie desde la posición 0 del ArrayA a la posición 0 del nuevoArray
            // el total del largo del ArrayA.
            System.arraycopy(a, 0, nuevoArray, 0, largoA);

            // Utilizamos el método System.arraycopy, pasamos el ArrayB
            // y que copie desde la posición 0 del ArrayB a la poscicion final que utilizo el ArrayA
            // el largo total del ArrayB.
            System.arraycopy(b, 0, nuevoArray, largoA, largoB);

            return nuevoArray;
        }

        public static Integer[] unirIntegerStream(Integer[] x, Integer[] y){
            // Utilizamos la API Stream para recorrer los Array y crear uno nuevo.
            Integer[] union = Stream.concat(Arrays.stream(x), Arrays.stream(y))
                    .toArray(Integer[]::new);
            return union;
        }
    }

