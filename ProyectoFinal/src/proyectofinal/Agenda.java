/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

import controlador.UserControlador;
import entidades.ContactosDB;

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

    public void modificar(Integer id) {
        UserControlador db = new UserControlador();
        ContactosDB agregar = new ContactosDB(id);
        db.editar(agregar);
    }

    public void eliminar(Integer id) {

    }

    public void listar() {

    }

    public void verContacto(Integer id) {

    }
}
