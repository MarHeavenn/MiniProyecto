package logica;

public class Gato extends felino {
    private String nombre;
    private String raza;
    private int edad;

    public Gato(String nombre, String raza, int edad, 
    String colmillos, String maullan, vacunas vacunas,
     int costos, String origen) {
        super(colmillos, maullan, vacunas, costos,origen);
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}