package POO;

public class Main {
    public static void main(String[] args) {
        //Vamos a crear esto
        int numero = 10;
        //instanciar un objeto: reservar espacio en memoria para ese objeto
        Persona personaEspañola = new Persona("Oscar Alvarado", 20);
        personaEspañola.saludar();
        Persona personaPolaca = new Persona("Tyzon", 30);
        personaPolaca.saludar();

        //Ahora, vamos a utilizar lo que creamos, la interface, y las clases perro y gato
        //Instanciamos para crear el objeto tony y toby
        Perro tony = new Perro();
        Gato toby = new Gato();

        //AQUI LLAMAMOS A LOS METODOS QUE CREAMOS E IMPLEMENTAMOS DE LA INTERFACE

        //que sonido hace el perro y el gato
        System.out.println("El sonido que hace el perro es: " + tony.hacerSonido());
        System.out.println("El sonido que hace el gato es: " + toby.hacerSonido());

        //numero de patas del perro y del gato
        System.out.println("El perro tiene " + tony.numeroDePatas() + " patas");
        System.out.println("El gato tiene " + toby.numeroDePatas() + " patas");

        //El tipo que es ese objeto
        System.out.println("El perro es de tipo: " + tony.getTipo());
        System.out.println("El gato es de tipo: " + toby.getTipo());

        //AHORA, VAMOS CON LA CLASE DE CIUDADES:
        Ciudad ciudad = new Ciudad();
        //Vamos a imprimir la informacion de esa ciudad
        ciudad.nombre = "Bucaramanga";
        ciudad.añoFundacion = 1656;
        ciudad.informacionCiudad();

        //VAMOS A UTILIZAR EL CONCEPTO DE HERENCIA
        Circulo circulo = new Circulo("Circulo",5.0);
        System.out.println("El area del circulo es de: " + circulo.calcularArea());
        /*
        Aqui estamos utilizando el metodo dibujar que esta en la clase FORMAGEOMETRICA, sin embargo
        se esta utilizando en la clase circulo, esto se debe a que se esta heredando ese metodo a la
        clase circulo
         */
        circulo.dibujar();

        //Vamos a utilizar el concepto de ABSTRACCION
        /*
        Con esto vamos hablar de lo que es las clases bastractas y de lo que es en
        si el concepto de abstraccion
        -La clase abstracta no se puede instanciar, es decir que no se puede crear objetos con ella-OJO
         */
        Computadora thinkpad = new Computadora("lenovo thinkpad", 1000000, 90);
        thinkpad.mostrarDetalles();
        System.out.println("El precio de la computadora es de: " + thinkpad.calcularPrecio());

        /*
        Ahora, vamos con el concepto de ENCAPSULAMIENTO que es otro concepto de
        Programación orientada a objetos con Java
         */

        Humanos h1 = new Humanos("Oscar Alvarado", 20);
        h1.mostrarInformacion();
        String nombre = h1.getNombre();
        System.out.println(nombre);
    }
}
