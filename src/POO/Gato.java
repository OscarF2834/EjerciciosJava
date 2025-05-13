package POO;

public class Gato implements Animal{

    @Override
    public String hacerSonido() {
        return "Miau";
    }

    @Override
    public int numeroDePatas() {
        return 4;
    }

    public String getTipo(){
        return Tipo;
    }
}
