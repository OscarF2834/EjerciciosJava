package POO;

public class FormaGeometrica {
    String tipo = null;

    //metodo constructor
    public FormaGeometrica(String tipo){
        this.tipo = tipo;
    }

    //metodo para dibujar una figura
    public void dibujar(){
        System.out.println("Dibujando un " + tipo);
    }
}
