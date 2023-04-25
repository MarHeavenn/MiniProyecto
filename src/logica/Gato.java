package logica;

public class Gato implements MejorAmigo, Dioses{

    @Override
    public String saludar() {
        return "miau";
    }

    @Override
    public String apodo() {
        return "michi";
    }

    @Override
    public String tributo() {
        return "murcielago";
    }
    
}
