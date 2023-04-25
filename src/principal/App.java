package principal;


import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

import logica.Canino;
import logica.Gato;
import logica.MejorAmigo;
import logica.Perro;
import logica.Pulga;
import logica.Raza;

public class App {

    static Perro perro4 = new Perro("Rex", Raza.Labrador, (byte)50, "curvos", "medio", false);

    public static void main(String[] args) {
        perro4.getNombre();
        Perro sasha = new Perro("Sasha", Raza.Pug, (byte)400, "pequeños","pacito", true);
        
        System.out.println(sasha.getNombre());
        sasha.insertarPulga(new Pulga("Grillo",5000));
        Pulga pulguita = new Pulga("Eva", 600);
        sasha.insertarPulga(pulguita);
        sasha.imprimirPulgas();
        String nombres [] = {"Ana","Mateo","Diana"};
        System.out.println(Arrays.toString(nombres));
        pulguita = null;
        
        Perro perro2 = new Perro("Rex", Raza.Labrador, (byte)50, "largos", "duro", false);
        System.out.println(Perro.NUMERO_PERROS);
        JOptionPane.showMessageDialog(null, "hola", "Titulo", JOptionPane.WARNING_MESSAGE);
        Perro.ladran();
        perro2 = null;
        System.gc();
        //Canino canino = new Canino("largo","pequño", false);
        Gato gatico = new Gato();
        MejorAmigo amigo = new Gato();
        MejorAmigo amigo2 = new Perro("Rex", Raza.Pastor, (byte)50, "largos", "pacito", true);
        Canino canino = new Perro("Rex", Raza.Labrador, (byte)50, "largos", "duro", false);
        ArrayList <MejorAmigo> lista = new ArrayList<MejorAmigo>();
        lista.add(gatico);
        lista.add(perro2);
        

        
    }        
}
