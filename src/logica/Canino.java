package logica;

public abstract class Canino extends Mamifero{

    private String dientes;
    private String aullan;

    public Canino(String dientes,
    String aullan, boolean tieneHijos){
        super(tieneHijos);
        this.dientes = dientes;
        this.aullan = aullan;
    }

    

    public String getDientes() {
        return dientes;
    }



    public void setDientes(String dientes) {
        this.dientes = dientes;
    }



    public String getAullan() {
        return aullan;
    }

    public void setAullan(String aullan) {
        this.aullan = aullan;
    }



    public abstract String comoOrinan();
    
}
