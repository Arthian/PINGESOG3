/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package managedbeans;

import entities.Comuna;
import entities.Consultorio;
import entities.Educacion;
import entities.EstadoConyugal;
import entities.Genero;
import entities.LeyesSociales;
import entities.Persona;
import entities.Prevision;
import entities.PuebloOriginario;
import entities.Religion;
import entities.TipoPrevision;
import java.awt.event.ActionEvent;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import sessions.PersonaFacadeLocal;

/**
 *
 * @author DevelUser
 */
@ManagedBean
@RequestScoped
public class PacienteMB {
    @EJB
    private PersonaFacadeLocal personaFacade;
    @EJB
    private sessions.EstadoConyugalFacadeLocal estadoConyugalFacade;
    Persona persona;
    
    private String nombres;    
    private String apellidoPaterno; 
    private String apellidoMaterno;    
    private String email;
    private String celular;
    private String telefono;
    private String telefonoContacto;
    private String direccion;
    private String nacionalidad;    
    private String ocupacion;
    private String actividadEconomica;
    private String digitoVerificador;
    private String numeroDepartamento; // Falta como campo
    private Date fechaNacimiento;
    private int comunaId;
    private int rut;    
    private int educacionId;
    private int puebloOriginarioId;
    private int religionId;
    private int estadoConyugalId;
    private int previsionId;
    private int tipoPrevisionId;
    private int leyesSocialesId;
    private int generoId;
    private int consultorioId;
    private int ley16744Id;
    private Genero genero;
    private Educacion educacion;
    private PuebloOriginario puebloOriginario;
    private Religion religion;
    private EstadoConyugal estadoConyugal;
    private Prevision prevision;
    private TipoPrevision tipoPrevision;
    private LeyesSociales leyesSociales;    
    private Comuna comuna;
    private Consultorio consultorio;
    private String ley16744; //Este debe ser una entities
    
    //Listas
    private List<EstadoConyugal> listaEstados;
    /**
     * Creates a new instance of EstadoConyugalMB
     */
    public PacienteMB() {
    }
    
    @PostConstruct
    public void init(){
        persona = new Persona();
        listaEstados = estadoConyugalFacade.findAll();        
    }
    public void saluda(){
        System.out.println("HOLAAA!!!!");
    }
    public void agregarPaciente(){
        System.out.println(nombres+" "+apellidoPaterno+" "+apellidoMaterno+" "+rut);
        System.out.println(comunaId+" "+educacionId+" "+puebloOriginarioId+" "+religionId+" "+estadoConyugalId+" "+previsionId+" "+generoId);
        comuna = new Comuna(comunaId);
        educacion = new Educacion(educacionId);
        puebloOriginario =  new PuebloOriginario(puebloOriginarioId);
        religion = new Religion(religionId);
        estadoConyugal = new EstadoConyugal(estadoConyugalId);
        prevision = new Prevision(previsionId);
        tipoPrevision = new TipoPrevision(tipoPrevisionId);
        leyesSociales = new LeyesSociales(leyesSocialesId);
        genero = new Genero(generoId);
        consultorio = new Consultorio(consultorioId);
        //FALTA INSTANCIAR EL OBJETO DE LA LEY 16744
        persona.setIdComuna(comuna);
        persona.setIdEducacion(educacion);
        persona.setIdEstadoconyugal(estadoConyugal);
        persona.setIdGenero(genero);
        persona.setIdPueblooriginario(puebloOriginario);
        persona.setIdReligion(religion);
        persona.setPersActividad(actividadEconomica);
        persona.setPersApematerno(apellidoMaterno);
        persona.setPersApepaterno(apellidoPaterno);
        persona.setPersCelular(celular);
        persona.setPersDireccion(direccion);
        persona.setPersDv(digitoVerificador);
        persona.setPersEmail(email);
        persona.setPersFnacimiento(fechaNacimiento);
        persona.setPersNacionalidad(nacionalidad);
        persona.setPersNdepartamento(numeroDepartamento);
        persona.setPersNombres(nombres);
        persona.setPersRut(rut);
        persona.setPersTelcontacto(telefonoContacto);
        persona.setPersTelefono(telefono);
        
        personaFacade.create(persona);
        
        
    }

    public List<EstadoConyugal> getListaEstados() {
        return listaEstados;
    }

    public void setListaEstados(List<EstadoConyugal> listaEstados) {
        this.listaEstados = listaEstados;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getDigitoVerificador() {
        return digitoVerificador;
    }

    public void setDigitoVerificador(String digitoVerificador) {
        this.digitoVerificador = digitoVerificador;
    }

    public int getComunaId() {
        return comunaId;
    }

    public void setComunaId(int comunaId) {
        this.comunaId = comunaId;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getEducacionId() {
        return educacionId;
    }

    public void setEducacionId(int educacionId) {
        this.educacionId = educacionId;
    }

    public int getPuebloOriginarioId() {
        return puebloOriginarioId;
    }

    public void setPuebloOriginarioId(int puebloOriginarioId) {
        this.puebloOriginarioId = puebloOriginarioId;
    }

    public int getReligionId() {
        return religionId;
    }

    public void setReligionId(int religionId) {
        this.religionId = religionId;
    }

    public int getEstadoConyugalId() {
        return estadoConyugalId;
    }

    public void setEstadoConyugalId(int estadoConyugalId) {
        this.estadoConyugalId = estadoConyugalId;
    }

    public int getPrevisionId() {
        return previsionId;
    }

    public void setPrevisionId(int previsionId) {
        this.previsionId = previsionId;
    }

    public int getTipoPrevisionId() {
        return tipoPrevisionId;
    }

    public void setTipoPrevisionId(int tipoPrevisionId) {
        this.tipoPrevisionId = tipoPrevisionId;
    }

    public int getLeyesSocialesId() {
        return leyesSocialesId;
    }

    public void setLeyesSocialesId(int leyesSocialesId) {
        this.leyesSocialesId = leyesSocialesId;
    }

    public int getLey16744Id() {
        return ley16744Id;
    }

    public void setLey16744Id(int ley16744Id) {
        this.ley16744Id = ley16744Id;
    }

    public Comuna getComuna() {
        return comuna;
    }

    public void setComuna(Comuna comuna) {
        this.comuna = comuna;
    }

    public String getNumeroDepartamento() {
        return numeroDepartamento;
    }

    public void setNumeroDepartamento(String numeroDepartamento) {
        this.numeroDepartamento = numeroDepartamento;
    }

    public int getGeneroId() {
        return generoId;
    }

    public void setGeneroId(int generoId) {
        this.generoId = generoId;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    

   
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getActividadEconomica() {
        return actividadEconomica;
    }

    public void setActividadEconomica(String actividadEconomica) {
        this.actividadEconomica = actividadEconomica;
    }

    public Educacion getEducacion() {
        return educacion;
    }

    public void setEducacion(Educacion educacion) {
        this.educacion = educacion;
    }

    public PuebloOriginario getPuebloOriginario() {
        return puebloOriginario;
    }

    public void setPuebloOriginario(PuebloOriginario puebloOriginario) {
        this.puebloOriginario = puebloOriginario;
    }

    public Religion getReligion() {
        return religion;
    }

    public void setReligion(Religion religion) {
        this.religion = religion;
    }

    public EstadoConyugal getEstadoConyugal() {
        return estadoConyugal;
    }

    public void setEstadoConyugal(EstadoConyugal estadoConyugal) {
        this.estadoConyugal = estadoConyugal;
    }

    public Prevision getPrevision() {
        return prevision;
    }

    public void setPrevision(Prevision prevision) {
        this.prevision = prevision;
    }

    public TipoPrevision getTipoPrevision() {
        return tipoPrevision;
    }

    public void setTipoPrevision(TipoPrevision tipoPrevision) {
        this.tipoPrevision = tipoPrevision;
    }

    public LeyesSociales getLeyesSociales() {
        return leyesSociales;
    }

    public void setLeyesSociales(LeyesSociales leyesSociales) {
        this.leyesSociales = leyesSociales;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getLey16744() {
        return ley16744;
    }

    public void setLey16744(String ley16744) {
        this.ley16744 = ley16744;
    }
    
}
