package principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import logica.Mascota;
import logica.vacunas;
import logica.Perro;
import logica.Gato;


public class App {

    public Mascota buscarMascotaPorNombre(String nombre, ArrayList<Mascota> lista_mascotas) {
        for (Mascota mascota : lista_mascotas) {
            if (mascota.getNombre().equalsIgnoreCase(nombre)) {
                return mascota;
            }
        }
        return null;
    }
    

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
                    
                    do{
                        System.out.println("Menú: ¿que mascota desea insertar?");
                        System.out.println("1. insertar perros");
                        System.out.println("2. insertar gatos");
                        System.out.println("3. Salir");
                        Scanner gato_perro = new Scanner(System.in);
                    
                        control = gato_perro.nextInt();
                        switch(control){
                            case 1:
                                //insertar perro
                                Scanner leer = new Scanner(System.in);
                                System.out.print("Ingrese el número de perros que desea agregar: ");
                                int numPerros = leer.nextInt();
                                for (int i = 0; i < numPerros; i++) {
                                    System.out.println("Ingresando datos para el perro " + (i+1) + "...");
                                    System.out.println("Ingrese el nombre del perro: ");
                                    String nombre = leer.next();
                                
                                    System.out.println("Ingrese la raza del perro: ");
                                    String raza = leer.nextLine();
                                
                                    System.out.println("Ingrese la edad del perro: ");
                                    byte edad = leer.nextByte();
                                
                                    System.out.println("Ingrese la longitud del pelaje del perro: ");
                                    String dientes = leer.next();
                                
                                    System.out.println("Ingrese la textura del pelaje del perro: ");
                                    String aullan = leer.nextLine();
                                
                                    vacunas vacuna = null;
                                    boolean vacunaValida = false;
                                    do {
                                        System.out.println("Seleccione la vacuna del gato:");
                                        System.out.println("1 - Malota");
                                        System.out.println("2 - Parbovirosis");
                                        System.out.println("3 - Pentavalente");
                                        System.out.println("4 - Rabia");
                                        Scanner scanner = new Scanner(System.in);
                                        int opcion = scanner.nextInt();

                                        switch (opcion) {
                                            case 1:
                                                vacuna = vacunas.MALOTA;
                                                vacunaValida = true;
                                                break;
                                            case 2:
                                                vacuna = vacunas.PARBOVIROSIS;
                                                vacunaValida = true;
                                                break;
                                            case 3:
                                                vacuna = vacunas.PENTAVALENTE;
                                                vacunaValida = true;
                                                break;
                                            case 4:
                                                vacuna = vacunas.RABIA;
                                                vacunaValida = true;
                                                break;
                                            default:
                                                System.out.println("Opción inválida. Intente nuevamente.");
                                                break;
                                        }
                                    } while (!vacunaValida);

                                    System.out.println("ingrese el costo de la mascota: ");
                                    double costos = leer.nextDouble();

                                    System.out.println("ingrese el pais de origen: ");
                                    String origen = leer.nextLine();
                                
                                    // Creamos el objeto perro de tipo Mascota con los datos ingresados por el usuario
                                    Mascota perro = new Perro(nombre, raza, edad, dientes, aullan, vacuna, costos, origen);
                                    lista_mascotas.add(perro);

                                }break;
                            //insertar gato
                            case 2:
                                Scanner leerG = new Scanner(System.in);
                                System.out.print("Ingrese el número de perros que desea agregar: ");
                                int numGatos = leerG.nextInt();
                                for (int i = 0; i < numGatos; i++) {
                                    System.out.println("Ingresando datos para el perro " + (i+1) + "...");
                                    System.out.println("Ingrese el nombre del perro: ");
                                    String nombre = leerG.nextLine();
                                
                                    System.out.println("Ingrese la raza del perro: ");
                                    String raza = leerG.nextLine();
                                
                                    System.out.println("Ingrese la edad del perro: ");
                                    byte edad = leerG.nextByte();
                                
                                    System.out.println("Ingrese la longitud del pelaje del perro: ");
                                    String dientes = leerG.next();
                                
                                    System.out.println("Ingrese la textura del pelaje del perro: ");
                                    String aullan = leerG.nextLine();
                                
                                    vacunas vacuna = null;
                                    boolean vacunaValida = false;
                                    do {
                                        System.out.println("Seleccione la vacuna del gato:");
                                        System.out.println("1 - Malota");
                                        System.out.println("2 - Parbovirosis");
                                        System.out.println("3 - Pentavalente");
                                        System.out.println("4 - Rabia");
                                        Scanner scanner = new Scanner(System.in);
                                        int opcion = scanner.nextInt();

                                        switch (opcion) {
                                            case 1:
                                                vacuna = vacunas.MALOTA;
                                                vacunaValida = true;
                                                break;
                                            case 2:
                                                vacuna = vacunas.PARBOVIROSIS;
                                                vacunaValida = true;
                                                break;
                                            case 3:
                                                vacuna = vacunas.PENTAVALENTE;
                                                vacunaValida = true;
                                                break;
                                            case 4:
                                                vacuna = vacunas.RABIA;
                                                vacunaValida = true;
                                                break;
                                            default:
                                                System.out.println("Opción inválida. Intente nuevamente.");
                                                break;
                                        }
                                    } while (!vacunaValida);

                                    System.out.println("ingrese el costo de la mascota: ");
                                    double costos = leerG.nextDouble();

                                    System.out.println("ingrese el pais de origen: ");
                                    String origen = leerG.nextLine();
                                
                                    // Creamos el objeto gato de tipo Mascota con los datos ingresados por el usuario
                                    Mascota gato = new Gato(nombre, raza, edad, dientes, aullan, vacuna, costos, origen);
                                    lista_mascotas.add(gato);
                            }break;
                        }
                    }while(control != 3);
                    break;
                // actualizar mascota
                case 2:
                    // Pide al usuario que seleccione la mascota que desea actualizar
                    System.out.println("Seleccione la mascota que desea actualizar:");
                    for (int i = 0; i < lista_mascotas.size(); i++) {
                        System.out.println(i + 1 + " - " + lista_mascotas.get(i).getNombre());
                    }
                    int opcionMascota = leer.nextInt();
                    Mascota mascota = lista_mascotas.get(opcionMascota - 1);

                    //ingrese la nueva edad de la mascota
                    System.out.println("Ingrese la nueva edad de la mascota:");
                    byte nuevaEdad = leer.nextByte();
                    mascota.setEdad(nuevaEdad);

                    //seleccione la nueva vacuna de la mascota
                    Vacunas nuevaVacuna = null;
                    boolean vacunaValida = false;
                    do {
                        System.out.println("Seleccione la nueva vacuna de la mascota:");
                        System.out.println("1 - Malota");
                        System.out.println("2 - Parbovirosis");
                        System.out.println("3 - Pentavalente");
                        System.out.println("4 - Rabia");
                        int opcionVacuna = leer.nextInt();
                    
                        switch (opcionVacuna) {
                            case 1:
                                nuevaVacuna = Vacunas.MALOTA;
                                vacunaValida = true;
                                break;
                            case 2:
                                nuevaVacuna = Vacunas.PARBOVIROSIS;
                                vacunaValida = true;
                                break;
                            case 3:
                                nuevaVacuna = Vacunas.PENTAVALENTE;
                                vacunaValida = true;
                                break;
                            case 4:
                                nuevaVacuna = Vacunas.RABIA;
                                vacunaValida = true;
                                break;
                            default:
                                System.out.println("Opción inválida. Intente nuevamente.");
                                break;
                        }
                    } while (!vacunaValida);

                    // atributos actualizados
                    mascota.setVacuna(nuevaVacuna);
                    System.out.println("Mascota actualizada correctamente.");
                    break;
                //elminas la mascota del indice digitado
                case 3:
                    // imprime las mascotas
                    System.out.println("Lista de mascotas:");
                    for (int i = 0; i < lista_mascotas.size(); i++) {
                        System.out.println(i + 1 + " - " + lista_mascotas.get(i).getNombre());
                    }
                    
                    // eliga la que desee eliminar
                    System.out.println("Seleccione la mascota que desea eliminar:");
                    int opcionMascota = leer.nextInt();
                    Mascota mascotaAEliminar = lista_mascotas.get(opcionMascota - 1);
                    
                    // mascota eliminada :,D
                    lista_mascotas.remove(mascotaAEliminar);
                    System.out.println("Mascota eliminada correctamente.");
                    break;
                //compara el nombre qu ingresas con el nombre de cada mascota con el metodo getNombre 
                case 4:
                    System.out.println("Ingrese el nombre de la mascota a buscar:");
                    String nombreBuscar = leer.nextLine();
                    
                    boolean encontrado = false;
                    for (Mascota mascota : lista_mascotas) {
                        if (mascota.getNombre().equalsIgnoreCase(nombreBuscar)) {
                            System.out.println("Mascota encontrada:");
                            System.out.println(mascota);
                            encontrado = true;
                            break;
                        }
                    }
                
                    if (!encontrado) {
                        System.out.println("No hay mascotas con ese nombre.");
                    }
                    break;
                //imprimir todas las mascotas
                case 5:
                    System.out.println("Lista de mascotas:");
                    for (Mascota mascota : lista_mascotas) {
                        System.out.println(mascota);
                    }
                    break;
                
                
                                 
            }
        }while(variable_control != 6);
        
        
        do {
            System.out.println("Menú: ¿que mascota desea insertar?");
            System.out.println("1. opcion para saber que mascotas tienen la vacuna malota");
            System.out.println("2. de mayor a menor en el precio de la mascota");
            System.out.println("3. Salir");
            int control2 = scanner.nextint();
            switch(control2){
            case 1:
                System.out.println("Lista de mascotas con la vacuna MALOTA:");
                boolean hayMascotas = false;
                for (Mascota mascota : lista_mascotas) {
                    if (mascota.getVacunas(vacunas.MALOTA)) {
                        System.out.println(mascota);
                        hayMascotas = true;
                    }
                }
                if (!hayMascotas) {
                    System.out.println("No hay mascotas con la vacuna MALOTA.");
                }
                break;
            //ordenar todas las mascotas de mayor a menor
            case 2:
                Collections.sort(lista_mascotas, new Comparator<Mascota>() {
                @Override
                public int compare(Mascota m1, Mascota m2) {
                    return Double.compare(m2.getCosto(), m1.getCosto());
                    }
                });
        
                System.out.println("Mascotas ordenadas por costo de mayor a menor:");
                for (Mascota mascota : lista_mascotas) {
                    System.out.println(mascota);
                }break;
        }while(control2 != 3);
    }
    
}