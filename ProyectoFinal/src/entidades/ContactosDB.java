/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Gael
 */
@Entity
@Table(name = "contactos", catalog = "agenda", schema = "")
@NamedQueries({
    @NamedQuery(name = "ContactosDB.findAll", query = "SELECT c FROM ContactosDB c")})
public class ContactosDB implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idContacto", nullable = false)
    private Integer idContacto;
    @Basic(optional = false)
    @Column(name = "nombreContacto", nullable = false, length = 45)
    private String nombreContacto;
    @Basic(optional = false)
    @Column(name = "numeroContacto", nullable = false, length = 45)
    private String numeroContacto;

    public ContactosDB() {
    }

    public ContactosDB(Integer idContacto) {
        this.idContacto = idContacto;
    }

    public ContactosDB(Integer idContacto, String nombreContacto, String numeroContacto) {
        this.idContacto = idContacto;
        this.nombreContacto = nombreContacto;
        this.numeroContacto = numeroContacto;
    }

    public Integer getIdContacto() {
        return idContacto;
    }

    public void setIdContacto(Integer idContacto) {
        this.idContacto = idContacto;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idContacto != null ? idContacto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContactosDB)) {
            return false;
        }
        ContactosDB other = (ContactosDB) object;
        if ((this.idContacto == null && other.idContacto != null) || (this.idContacto != null && !this.idContacto.equals(other.idContacto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.ContactosDB[ idContacto=" + idContacto + " ]";
    }
    
}
