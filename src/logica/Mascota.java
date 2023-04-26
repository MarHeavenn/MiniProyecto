package logica; 
import logica.vacunas;

public class Mascota {

    private vacunas vacunas;
    private double costo;
    private String origen;
    
    // Constructor
    public Mascota(vacunas vacunas, double costo, String origen){
        this.vacunas = vacunas;
        this.costo = costo;
        this.origen = origen;
    }
    
    //metodos Get y set
    public vacunas getVacunas() {
        return vacunas;
    }

    public void setVacunas(vacunas vacunas) {
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