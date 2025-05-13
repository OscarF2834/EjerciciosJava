package POO;

public class Circulo extends FormaGeometrica{
    double radio = 0.0;

    public Circulo(String tipo, double radio){
        super(tipo);
        this.radio = radio;
    }

    //metodo para calcular el area de un circulo
    public double calcularArea(){
        return Math.PI*Math.pow(radio,2);
    }
}
