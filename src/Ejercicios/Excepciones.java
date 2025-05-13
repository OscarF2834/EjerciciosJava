package Ejercicios;

import java.util.*;

public class Excepciones {
    public static void main(String[] args) {
        /*
        Vamos a explicar lo que son las excepciones en java que se suelen
        escribir con las palabras reservadas try y catch, a continuacion se explica
        como es:
         */
        int resultado = 0;
        try{
            //Codigo que puede fallar o lanzar una excepcion
             resultado = 10/2;
        }catch (ArithmeticException e1){
            //Codigo para manejar la excepcion
            System.out.println("Se ha producido una excepcion de tipo " + e1.getMessage());
        }finally {
            //Codigo que se ejecutara siempre
            System.out.println("La operacion se realizo correctamente y da: " + resultado);
        }
        int[] numeros = new int[5];
        int[] numeros1 = {10,20,30,40,50};

        System.out.println(numeros1[3]);
        for (int i = 0; i < numeros1.length; i++) {
            System.out.println("Los numeros son: " + numeros1[i]);
        }

        //Tema de LISTAS
        ArrayList<String> nombres =  new ArrayList<>();

        nombres.add("Oscar");
        nombres.add("Maria");
        nombres.add("Juan");
        //Vamos a llamar al elemento que se encuentra en la posicion 0:
        System.out.println(nombres.get(0));

        //Vamos a imprimir todos los nombres:
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }

        //Ahora, vamos hacer lo mismo pero con un foreach
        for(String nombre:nombres){
            System.out.println(nombre);
        }

        //SET
        Set<Integer> numerosUnicos = new HashSet<>();
        numerosUnicos.add(10);
        numerosUnicos.add(20);
        numerosUnicos.add(30);

        for(int num: numerosUnicos){
            System.out.println(num);
        }

        //MAPS
        //Esta lista puede recibir dos parametros, en este caso STRING e INTEGER
        Map<String,Integer> edades = new HashMap<>();
        edades.put("Oscar Alvarado", 20);
        edades.put("Maria Jaimes", 70);
        edades.put("Rosalba Muñoz", 67);
        //Esto se hace para traer la edad de la persona, se escribe el nombre de la persona
        System.out.println(edades.get("Oscar Alvarado"));
    }
}
