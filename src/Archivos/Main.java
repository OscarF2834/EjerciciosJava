package Archivos;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        /*
        La clase file sirve para crear archivos, esta es una herramienta incluida en java
         */
        File miArchivo = new File("miArchivo.txt");

        /*
        El try y catch lo que hace es el manejo de la accion, lanza la creacion del archivo y si
        acaso dale error, entonces capta el error como IOException y despues hace que el throw new
        hace que se lanze una nueva excepcion. TIRAR NUEVO
         */
        try {
            miArchivo.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Escribir un texto en un archivo creado previamente, esto se hace con BufferedWritter
        /*
        Se pone el objeto writter al lado del try porque sigue un comportamiento llamado try-with-resources
        esto se hace para que nosotros no tengamos que cerrar el recurso que le pasamos entre paranetesis,
        sera cerrado automaticamente, Java lo hace.
         */
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("miArchivo.txt"))){
            writer.write("Este es un texto escrito desde el lenguaje de Programación Java");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Ahora, vamos a leer desde un archivo:
        //se hace con el BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader("miArchivo.txt"))){
            String linea;
            while ((linea=reader.readLine())!=null){
                System.out.println(linea);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
