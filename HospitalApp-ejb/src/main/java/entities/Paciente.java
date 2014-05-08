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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DevelUser
 */
@Entity
@Table(name = "paciente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Paciente.findAll", query = "SELECT p FROM Paciente p"),
    @NamedQuery(name = "Paciente.findByIdPaciente", query = "SELECT p FROM Paciente p WHERE p.idPaciente = :idPaciente"),
    @NamedQuery(name = "Paciente.findByIdGenero6", query = "SELECT p FROM Paciente p WHERE p.idGenero6 = :idGenero6"),
    @NamedQuery(name = "Paciente.findByPaciNficha", query = "SELECT p FROM Paciente p WHERE p.paciNficha = :paciNficha"),
    @NamedQuery(name = "Paciente.findByPersFfallecimiento", query = "SELECT p FROM Paciente p WHERE p.persFfallecimiento = :persFfallecimiento")})
public class Paciente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_paciente")
    private Integer idPaciente;
    @Column(name = "id_genero6")
    private Integer idGenero6;
    @Size(max = 20)
    @Column(name = "paci_nficha")
    private String paciNficha;
    @Column(name = "pers_ffallecimiento")
    @Temporal(TemporalType.DATE)
    private Date persFfallecimiento;
    @JoinColumn(name = "id_prevision", referencedColumnName = "id_prevision")
    @ManyToOne
    private Prevision idPrevision;
    @JoinColumn(name = "id_persona", referencedColumnName = "id_persona")
    @ManyToOne
    private Persona idPersona;
    @JoinColumn(name = "id_consultorio", referencedColumnName = "id_consultorio")
    @ManyToOne
    private Consultorio idConsultorio;

    public Paciente() {
    }

    public Paciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Integer getIdGenero6() {
        return idGenero6;
    }

    public void setIdGenero6(Integer idGenero6) {
        this.idGenero6 = idGenero6;
    }

    public String getPaciNficha() {
        return paciNficha;
    }

    public void setPaciNficha(String paciNficha) {
        this.paciNficha = paciNficha;
    }

    public Date getPersFfallecimiento() {
        return persFfallecimiento;
    }

    public void setPersFfallecimiento(Date persFfallecimiento) {
        this.persFfallecimiento = persFfallecimiento;
    }

    public Prevision getIdPrevision() {
        return idPrevision;
    }

    public void setIdPrevision(Prevision idPrevision) {
        this.idPrevision = idPrevision;
    }

    public Persona getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Persona idPersona) {
        this.idPersona = idPersona;
    }

    public Consultorio getIdConsultorio() {
        return idConsultorio;
    }

    public void setIdConsultorio(Consultorio idConsultorio) {
        this.idConsultorio = idConsultorio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPaciente != null ? idPaciente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paciente)) {
            return false;
        }
        Paciente other = (Paciente) object;
        if ((this.idPaciente == null && other.idPaciente != null) || (this.idPaciente != null && !this.idPaciente.equals(other.idPaciente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Paciente[ idPaciente=" + idPaciente + " ]";
    }
    
}
