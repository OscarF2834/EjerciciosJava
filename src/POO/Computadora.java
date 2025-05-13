package POO;

public class Computadora extends Producto{
    public int memoriaRam;

    //metodo constructor con parametros:
    public Computadora(String nombre, double precio, int memoriaRam){
        super(nombre,precio);
        this.memoriaRam = memoriaRam;
    }

    //Ahora, vamos hacer uso del metodo abstracto:

    @Override
    public double calcularPrecio() {
        return precio + (memoriaRam*0.1);
    }
}
