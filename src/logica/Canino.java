package logica;

public abstract class Canino extends Mascota{

    private String dientes;
    private String aullan;

    public Canino(String dientes, String aullan, 
    String vacunas, double costo, String origen){
        super(vacunas,costo,origen);
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
}
