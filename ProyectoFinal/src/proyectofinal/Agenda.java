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
    
    public void agregar(){
        UserControlador db = new UserControlador();
        ContactosDB eliminar = new ContactosDB(1);
        db.eliminar(eliminar);
    }
    
    
}
