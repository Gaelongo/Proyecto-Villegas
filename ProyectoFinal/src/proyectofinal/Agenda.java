/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

import controlador.UserControlador;
import entidades.ContactosDB;
import java.util.List;

/**
 *
 * @author Gael
 */
public class Agenda {

    public void agregar(Integer id, String nombre, String numero) {
        UserControlador db = new UserControlador();
        ContactosDB agregar = new ContactosDB(id, nombre, numero);
        db.crear(agregar);
    }

    public void modificar(Integer id, String nombre, String numero) {
        UserControlador db = new UserControlador();
        ContactosDB modificar = new ContactosDB(id, nombre, numero);
        db.editar(modificar);
    }

    public void eliminar(Integer id) {
        UserControlador db = new UserControlador();
        ContactosDB contacto = new ContactosDB(eliminarContacto(id).getIdContacto(), eliminarContacto(id).getNombreContacto(), eliminarContacto(id).getNumeroContacto());
        System.out.println(contacto.getNombreContacto());
        db.eliminar(contacto);
    }

    public void listar() {
        UserControlador db = new UserControlador();
        List<ContactosDB> contactos = db.todosLosUsuarios();
        for (ContactosDB contacto : contactos) {
            System.out.println("");
            System.out.println("ID: " + contacto.getIdContacto());
            System.out.println("Nombre: " + contacto.getNombreContacto());
            System.out.println("Numero: " + contacto.getNumeroContacto());
            System.out.println("--------------------------");
        }

    }

    public void verContacto(Integer id) {
        UserControlador db = new UserControlador();
        List<ContactosDB> contactos = db.todosLosUsuarios();
        for (ContactosDB contacto : contactos) {
            if (contacto.getIdContacto() == id) {
                System.out.println("");
                System.out.println("Nombre: " + contacto.getNombreContacto());
                System.out.println("Numero: " + contacto.getNumeroContacto());
                System.out.println("--------------------------");
            }
        }
    }
    public ContactosDB eliminarContacto(Integer id) {
        UserControlador db = new UserControlador();
        List<ContactosDB> contactos = db.todosLosUsuarios();
        for (ContactosDB contacto : contactos) {
            if (contacto.getIdContacto() == id) {
                return contacto;
            }
        }
        return null;
    }
}
