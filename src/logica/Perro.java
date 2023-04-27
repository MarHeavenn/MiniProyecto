package logica;


public class Perro extends Canino {
    
    private String nombre;
    private String raza;
    private byte edad;
    
    public Perro(String nombre, String raza, 
    byte edad, String dientes, String aullan,
     vacunas vacunas, Double costo, String origen){
        super(dientes, aullan, vacunas, costo, origen);
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }


    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

}