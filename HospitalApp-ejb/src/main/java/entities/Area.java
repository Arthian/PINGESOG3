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
@Table(name = "area")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Area.findAll", query = "SELECT a FROM Area a"),
    @NamedQuery(name = "Area.findByIdArea", query = "SELECT a FROM Area a WHERE a.idArea = :idArea"),
    @NamedQuery(name = "Area.findByAreaNombre", query = "SELECT a FROM Area a WHERE a.areaNombre = :areaNombre"),
    @NamedQuery(name = "Area.findByUserIngresa", query = "SELECT a FROM Area a WHERE a.userIngresa = :userIngresa"),
    @NamedQuery(name = "Area.findByUserFingresa", query = "SELECT a FROM Area a WHERE a.userFingresa = :userFingresa"),
    @NamedQuery(name = "Area.findByUserModifica", query = "SELECT a FROM Area a WHERE a.userModifica = :userModifica"),
    @NamedQuery(name = "Area.findByUserFmodifica", query = "SELECT a FROM Area a WHERE a.userFmodifica = :userFmodifica")})
public class Area implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_area")
    private Integer idArea;
    @Size(max = 250)
    @Column(name = "area_nombre")
    private String areaNombre;
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
    @OneToMany(mappedBy = "idArea")
    private Collection<Especialidad> especialidadCollection;

    public Area() {
    }

    public Area(Integer idArea) {
        this.idArea = idArea;
    }

    public Integer getIdArea() {
        return idArea;
    }

    public void setIdArea(Integer idArea) {
        this.idArea = idArea;
    }

    public String getAreaNombre() {
        return areaNombre;
    }

    public void setAreaNombre(String areaNombre) {
        this.areaNombre = areaNombre;
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
    public Collection<Especialidad> getEspecialidadCollection() {
        return especialidadCollection;
    }

    public void setEspecialidadCollection(Collection<Especialidad> especialidadCollection) {
        this.especialidadCollection = especialidadCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idArea != null ? idArea.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Area)) {
            return false;
        }
        Area other = (Area) object;
        if ((this.idArea == null && other.idArea != null) || (this.idArea != null && !this.idArea.equals(other.idArea))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Area[ idArea=" + idArea + " ]";
    }
    
}
