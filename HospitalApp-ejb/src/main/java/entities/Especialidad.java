/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author DevelUser
 */
@Entity
@Table(name = "especialidad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Especialidad.findAll", query = "SELECT e FROM Especialidad e"),
    @NamedQuery(name = "Especialidad.findByIdEspecialidad", query = "SELECT e FROM Especialidad e WHERE e.idEspecialidad = :idEspecialidad"),
    @NamedQuery(name = "Especialidad.findByEspeNombre", query = "SELECT e FROM Especialidad e WHERE e.espeNombre = :espeNombre"),
    @NamedQuery(name = "Especialidad.findByUserIngresa", query = "SELECT e FROM Especialidad e WHERE e.userIngresa = :userIngresa"),
    @NamedQuery(name = "Especialidad.findByUserFingresa", query = "SELECT e FROM Especialidad e WHERE e.userFingresa = :userFingresa"),
    @NamedQuery(name = "Especialidad.findByUserModifica", query = "SELECT e FROM Especialidad e WHERE e.userModifica = :userModifica"),
    @NamedQuery(name = "Especialidad.findByUserFmodifica", query = "SELECT e FROM Especialidad e WHERE e.userFmodifica = :userFmodifica")})
public class Especialidad implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_especialidad")
    private Integer idEspecialidad;
    @Size(max = 256)
    @Column(name = "espe_nombre")
    private String espeNombre;
    @Size(max = 50)
    @Column(name = "user_ingresa")
    private String userIngresa;
    @Column(name = "user_fingresa")
    @Temporal(TemporalType.DATE)
    private Date userFingresa;
    @Size(max = 50)
    @Column(name = "user_modifica")
    private String userModifica;
    @Column(name = "user_fmodifica")
    @Temporal(TemporalType.DATE)
    private Date userFmodifica;
    @OneToMany(mappedBy = "idEspecialidad")
    private Collection<Profesional> profesionalCollection;
    @JoinColumn(name = "id_area", referencedColumnName = "id_area")
    @ManyToOne
    private Area idArea;

    public Especialidad() {
    }

    public Especialidad(Integer idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public Integer getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(Integer idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getEspeNombre() {
        return espeNombre;
    }

    public void setEspeNombre(String espeNombre) {
        this.espeNombre = espeNombre;
    }

    public String getUserIngresa() {
        return userIngresa;
    }

    public void setUserIngresa(String userIngresa) {
        this.userIngresa = userIngresa;
    }

    public Date getUserFingresa() {
        return userFingresa;
    }

    public void setUserFingresa(Date userFingresa) {
        this.userFingresa = userFingresa;
    }

    public String getUserModifica() {
        return userModifica;
    }

    public void setUserModifica(String userModifica) {
        this.userModifica = userModifica;
    }

    public Date getUserFmodifica() {
        return userFmodifica;
    }

    public void setUserFmodifica(Date userFmodifica) {
        this.userFmodifica = userFmodifica;
    }

    @XmlTransient
    public Collection<Profesional> getProfesionalCollection() {
        return profesionalCollection;
    }

    public void setProfesionalCollection(Collection<Profesional> profesionalCollection) {
        this.profesionalCollection = profesionalCollection;
    }

    public Area getIdArea() {
        return idArea;
    }

    public void setIdArea(Area idArea) {
        this.idArea = idArea;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEspecialidad != null ? idEspecialidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Especialidad)) {
            return false;
        }
        Especialidad other = (Especialidad) object;
        if ((this.idEspecialidad == null && other.idEspecialidad != null) || (this.idEspecialidad != null && !this.idEspecialidad.equals(other.idEspecialidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Especialidad[ idEspecialidad=" + idEspecialidad + " ]";
    }
    
}
