/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import javax.persistence.*;
import conexion.Conexion;
import entidades.ContactosDB;
import java.util.List;

/**
 *
 * @author Gael
 */
public class UserControlador {
    
    public void crear(ContactosDB u){
        
        EntityManager en = entityManager();
        try{
            en.getTransaction().begin();
            en.persist(u);
            en.getTransaction().commit();
        } catch(Exception e){
            en.getTransaction().rollback();
        } 
        
    }
    
    public void editar(ContactosDB u){
        
        EntityManager en = entityManager();
        try{
            en.getTransaction().begin();
            en.merge(u);
            en.getTransaction().commit();
        } catch(Exception e){
            en.getTransaction().rollback();
        } 
        
    }
    
    public void eliminar(ContactosDB u){
        
        EntityManager en = entityManager();
        try{
            en.getTransaction().begin();
            en.remove(en.merge(u));
            en.getTransaction().commit();
        } catch(Exception e){
            //en.getTransaction().rollback();
            System.out.println(e.getCause());
        } 
        
    }
    
    public List<ContactosDB> todosLosUsuarios(){
        Query q = entityManager().createQuery("SELECT u FROM ContactosDB U");
        return q.getResultList();
    }
    
    private EntityManager entityManager(){
        return Conexion.getInstancia().getFabrica().createEntityManager();
    }
}
