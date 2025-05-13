package POO;

public abstract class Producto {

    public String nombre;
    public double precio;

    //metodo constructor con parametros:
    public Producto (String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    //Ahora, vamos hacer un metodo abstracto o una funcion que va de la siguiente manera:
    public abstract double calcularPrecio();

    public void mostrarDetalles(){
        System.out.println("El producto es: " + nombre);
        System.out.println("El precio del producto es: " + precio);
    }
}
