package principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import logica.Mascota;
import logica.Canino;
import logica.Perro;
import logica.Gato;
import logica.felino;

public class App {

    public static void main(String[] args) {

        //de aqui para abajo es lo nuevo
        ArrayList<Mascota> lista_mascotas = new ArrayList<Mascota>();
        Scanner scannermenu = new Scanner(System.in);
        int variable_control;
        do {
            System.out.println("Menu, escoja su opcion:\n1.Inserta mascota\n2.Actualizar mascota\n3.Eliminar mascota\n4.Buscar mascota por nombre\n5.Listar todas las mascotas\n6. salir");

            variable_control = scannermenu.nextInt();
            switch (variable_control){

                case 1:
                    System.out.println("Menú: ¿que mascota desea insertar?");
                    System.out.println("1. insertar perros");
                    System.out.println("2. insertar gatos");
                    System.out.println("3. Salir");
                    Scanner gato_perro = new Scanner(System.in);
                    int control;
                    do{
                        control = gato_perro.nextInt();
                        switch(control){
                            case 1:
                                //insertar perro
                                Scanner scanner = new Scanner(System.in);                            
                                Scanner leer = new Scanner(System.in);
                                System.out.print("Ingrese el número de perros que desea agregar: ");
                                int numPerros = leer.nextInt();
                                for (int i = 0; i < numPerros; i++) {
                                    System.out.println("Ingresando datos para el perro " + (i+1) + "...");
                                    System.out.println("Ingrese el nombre del perro: ");
                                    String nombre = scanner.nextLine();
                                
                                    System.out.println("Ingrese la raza del perro: ");
                                    String raza = scanner.nextLine();
                                
                                    System.out.println("Ingrese la edad del perro: ");
                                    byte edad = scanner.nextByte();
                                
                                    System.out.println("Ingrese la longitud del pelaje del perro: ");
                                    String dientes = scanner.next();
                                
                                    System.out.println("Ingrese la textura del pelaje del perro: ");
                                    String aullan = scanner.nextLine();
                                
                                    System.out.println("ingrese las vacunas: ");
                                    String vacunas = scanner.nextLine();

                                    System.out.println("ingrese el costo de la mascota: ");
                                    int costos = scanner.nextInt();

                                    System.out.println("ingrese el pais de origen: ");
                                    String origen = scanner.nextLine();
                                
                                    // Creamos el objeto de tipo Perro con los datos ingresados por el usuario
                                    Perro perro = new Perro(nombre, raza, edad, dientes, aullan, vacunas, costos, origen);
                                    lista_mascotas.add(perro);

                                }break;
                            case 2:

                            break;
                            //insertar gato
                        }
                    }while(control != 3);
                    break;
                case 2: 
                break;
                                 
            }
        }while(variable_control != 6);
    }
}