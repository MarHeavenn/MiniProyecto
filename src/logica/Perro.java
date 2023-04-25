package logica;

import java.util.ArrayList;

public class Perro extends Canino implements MejorAmigo {
    
    private String nombre;
    private Raza raza;
    private byte edad;
    ArrayList <Pulga> pulgas;
    public static byte NUMERO_PERROS = 0;
    
    public Perro(String nombre, 
    Raza raza, byte edad,
    String dientes,
    String aullan, boolean tieneHijos){
        super(dientes, aullan, tieneHijos);
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        pulgas = new ArrayList<Pulga>();
        NUMERO_PERROS++;
    }

    
    @Override
    public void finalize(){
        NUMERO_PERROS--;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public void insertarPulga(Pulga pulga){
        pulgas.add(pulga);
    }   

    public void imprimirPulgas(){
        for(int i = 0; i < pulgas.size(); i++){
            System.out.println(pulgas.get(i).getNombre());
        }
    }

    public static void ladran(){
        System.out.println("WOFF!!!");
        
    }

    @Override
    public String comoOrinan() {
        return "Alza la pata";
    }


    @Override
    public String saludar() {
        return "Con la cola";
    }


    @Override
    public String apodo() {
        return "Firulais";
    }
    
}