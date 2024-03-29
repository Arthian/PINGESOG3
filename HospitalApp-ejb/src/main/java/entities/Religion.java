/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author DevelUser
 */
@Entity
@Table(name = "religion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Religion.findAll", query = "SELECT r FROM Religion r"),
    @NamedQuery(name = "Religion.findByReliNombre", query = "SELECT r FROM Religion r WHERE r.reliNombre = :reliNombre"),
    @NamedQuery(name = "Religion.findByIdReligion", query = "SELECT r FROM Religion r WHERE r.idReligion = :idReligion")})
public class Religion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 64)
    @Column(name = "reli_nombre")
    private String reliNombre;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_religion")
    private Integer idReligion;
    @OneToMany(mappedBy = "idReligion")
    private Collection<Persona> personaCollection;

    public Religion() {
    }

    public Religion(Integer idReligion) {
        this.idReligion = idReligion;
    }

    public String getReliNombre() {
        return reliNombre;
    }

    public void setReliNombre(String reliNombre) {
        this.reliNombre = reliNombre;
    }

    public Integer getIdReligion() {
        return idReligion;
    }

    public void setIdReligion(Integer idReligion) {
        this.idReligion = idReligion;
    }

    @XmlTransient
    public Collection<Persona> getPersonaCollection() {
        return personaCollection;
    }

    public void setPersonaCollection(Collection<Persona> personaCollection) {
        this.personaCollection = personaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idReligion != null ? idReligion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Religion)) {
            return false;
        }
        Religion other = (Religion) object;
        if ((this.idReligion == null && other.idReligion != null) || (this.idReligion != null && !this.idReligion.equals(other.idReligion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Religion[ idReligion=" + idReligion + " ]";
    }
    
}
