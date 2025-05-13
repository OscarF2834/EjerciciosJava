package POO;

public class Persona {

    //Los atributos son las caracteristicas de ese objeto
    String nombre;
    int edad;

    //El contructor seria de la siguiente manera a continuacion:

    //constructor por defecto
    /*
    El constructor sirve inicialmente para poder inicializar un objeto que sea del
    tipo de que es la clase, en este caso Persona
     */
    public Persona(){}
    //Constructor con parametros:
    //Estamos inicializando el objeto, dandole valores
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    //Y los metodos son las acciones de ese objeto, lo que hace
    public void saludar(){
        System.out.println("Hola a todos soy una persona");
    }
}
