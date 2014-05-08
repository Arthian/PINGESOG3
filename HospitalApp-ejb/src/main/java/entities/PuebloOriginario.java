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
@Table(name = "pueblo_originario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PuebloOriginario.findAll", query = "SELECT p FROM PuebloOriginario p"),
    @NamedQuery(name = "PuebloOriginario.findByReliNombre", query = "SELECT p FROM PuebloOriginario p WHERE p.reliNombre = :reliNombre"),
    @NamedQuery(name = "PuebloOriginario.findByIdPueblooriginario", query = "SELECT p FROM PuebloOriginario p WHERE p.idPueblooriginario = :idPueblooriginario")})
public class PuebloOriginario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 64)
    @Column(name = "reli_nombre")
    private String reliNombre;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pueblooriginario")
    private Integer idPueblooriginario;
    @OneToMany(mappedBy = "idPueblooriginario")
    private Collection<Persona> personaCollection;

    public PuebloOriginario() {
    }

    public PuebloOriginario(Integer idPueblooriginario) {
        this.idPueblooriginario = idPueblooriginario;
    }

    public String getReliNombre() {
        return reliNombre;
    }

    public void setReliNombre(String reliNombre) {
        this.reliNombre = reliNombre;
    }

    public Integer getIdPueblooriginario() {
        return idPueblooriginario;
    }

    public void setIdPueblooriginario(Integer idPueblooriginario) {
        this.idPueblooriginario = idPueblooriginario;
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
        hash += (idPueblooriginario != null ? idPueblooriginario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PuebloOriginario)) {
            return false;
        }
        PuebloOriginario other = (PuebloOriginario) object;
        if ((this.idPueblooriginario == null && other.idPueblooriginario != null) || (this.idPueblooriginario != null && !this.idPueblooriginario.equals(other.idPueblooriginario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.PuebloOriginario[ idPueblooriginario=" + idPueblooriginario + " ]";
    }
    
}
