/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinal;

import java.util.Scanner;

/**
 *
 * @author Gael Mario Fernanda
 */
public class ProyectoFinal {

    /**
     * @param args the command line arguments
     */

    public void menu() {

        Scanner leer = new Scanner(System.in);
        int op = 0;
        String numero, nombre;
        Integer id;
        Agenda ag = new Agenda();
        // String
        do {
            System.out.println("ELIGE UNA OPCION");
            System.out.println("""
                    [1] VER CONTACTO
                    [2] AGREGAR CONTACTO
                    [3] MODIFICAR CONTACTO
                    [4] ELIMINAR CONTACTO
                    [5] LISTAR CONTACTOS
                    [6] SALIR
                    """);
            op = leer.nextInt();
            switch (op) {
                case 1:
                    System.out.println("----VER CONTACTO----");
                    System.out.println("Ingresa el numero de telefono:");
                    nombre = leer.next();
                    ag.verContacto(nombre);
                    break;
                case 2:
                    System.out.println("----AGREGAR CONTACTOS----");
                    System.out.println("Ingresa los datos para guardar el contacto\n");

                    System.out.println("Ingresa el nombre:");
                    nombre = leer.next();

                    System.out.println("Ingresa el numero de telefono:");
                    numero = leer.next();

                    id = Integer.parseInt(nombre.toLowerCase().trim());
                    ag.agregar(id, nombre, numero);

                    break;
                case 3:
                    System.out.println("----MODIFICAR CONTACTO----");
                    System.out.println("Ingresa el nombre del contacto que deseas editar:");
                    nombre = leer.next();

                    ag.modificar(nombre);
                    break;
                case 4:
                    System.out.println("----ELIMINAR CONTACTO----");
                    System.out.println("Ingresa el nombre del contacto que deseas eliminar:");
                    nombre = leer.next();
                    ag.eliminar(nombre);
                    break;
                case 5:
                    System.out.println("----LISTAR CONTACTOS----");
                    ag.listar();
                    break;
                case 6:
                    System.out.println("SALIR");
                    break;
                default:
                    System.out.println("OPCION INVALIDA");
            }
        } while (op != 6);
    }

    public static void main(String[] args) {

    }

}
