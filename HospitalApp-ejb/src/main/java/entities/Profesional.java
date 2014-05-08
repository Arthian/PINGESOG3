/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DevelUser
 */
@Entity
@Table(name = "profesional")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Profesional.findAll", query = "SELECT p FROM Profesional p"),
    @NamedQuery(name = "Profesional.findByIdProfesional", query = "SELECT p FROM Profesional p WHERE p.idProfesional = :idProfesional"),
    @NamedQuery(name = "Profesional.findByUserIngresa", query = "SELECT p FROM Profesional p WHERE p.userIngresa = :userIngresa"),
    @NamedQuery(name = "Profesional.findByUserFingresa", query = "SELECT p FROM Profesional p WHERE p.userFingresa = :userFingresa"),
    @NamedQuery(name = "Profesional.findByUserModifica", query = "SELECT p FROM Profesional p WHERE p.userModifica = :userModifica"),
    @NamedQuery(name = "Profesional.findByUserFmodifica", query = "SELECT p FROM Profesional p WHERE p.userFmodifica = :userFmodifica")})
public class Profesional implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_profesional")
    private Integer idProfesional;
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
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    @ManyToOne
    private Usuario idUsuario;
    @JoinColumn(name = "id_persona", referencedColumnName = "id_persona")
    @ManyToOne
    private Persona idPersona;
    @JoinColumn(name = "id_especialidad", referencedColumnName = "id_especialidad")
    @ManyToOne
    private Especialidad idEspecialidad;
    @JoinColumn(name = "id_cargo", referencedColumnName = "id_cargo")
    @ManyToOne
    private Cargo idCargo;

    public Profesional() {
    }

    public Profesional(Integer idProfesional) {
        this.idProfesional = idProfesional;
    }

    public Integer getIdProfesional() {
        return idProfesional;
    }

    public void setIdProfesional(Integer idProfesional) {
        this.idProfesional = idProfesional;
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

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Persona getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Persona idPersona) {
        this.idPersona = idPersona;
    }

    public Especialidad getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(Especialidad idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public Cargo getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Cargo idCargo) {
        this.idCargo = idCargo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProfesional != null ? idProfesional.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Profesional)) {
            return false;
        }
        Profesional other = (Profesional) object;
        if ((this.idProfesional == null && other.idProfesional != null) || (this.idProfesional != null && !this.idProfesional.equals(other.idProfesional))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Profesional[ idProfesional=" + idProfesional + " ]";
    }
    
}
