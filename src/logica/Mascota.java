package logica; 

public class Mascota {

    private String vacunas;
    private double costo;
    private String origen;
    
    // Constructor
    public Mascota(String vacunas, double costo, String origen){
        this.vacunas = vacunas;
        this.costo = costo;
        this.origen = origen;
    }
    
    //metodos Get y set
    public String getVacunas() {
        return vacunas;
    }

    public void setVacunas(String vacunas) {
        this.vacunas = vacunas;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
}