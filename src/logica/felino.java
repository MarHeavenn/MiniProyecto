package logica;

public abstract class felino extends Mascota {
    private String maullan;
    private String colmillos;

    public felino (String colmillos, String maullan, 
    vacunas vacunas, double costo, String origen){
        super(vacunas,costo,origen);
        this.colmillos = colmillos;
        this.maullan = maullan;
    }
    // Método get para la variable de "maullan"
    public String getMaullan() {
        return maullan;
    }

    // Método set para la variable de "maullan"
    public void setMaullan(String maullan) {
        this.maullan = maullan;
    }

    // Método get para la variable de "colmillos"
    public String getColmillos() {
        return colmillos;
    }

    // Método set para la variable de "colmillos"
    public void setColmillos(String colmillos) {
        this.colmillos = colmillos;
    }
}

