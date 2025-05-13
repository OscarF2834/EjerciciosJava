package POO;

public class Perro implements Animal{

    @Override
    public String hacerSonido() {
        return "Guau";
    }

    @Override
    public int numeroDePatas() {
        return 4;
    }

    public String getTipo(){
        return Tipo;
    }
}
