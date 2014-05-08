/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package managedbeans;

import entities.*;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import sessions.AreaFacadeLocal;
import sessions.ComunaFacadeLocal;
import sessions.ConsultorioFacadeLocal;
import sessions.EducacionFacadeLocal;
import sessions.EspecialidadFacadeLocal;
import sessions.EstadoConyugalFacadeLocal;
import sessions.GeneroFacadeLocal;
import sessions.LeyesSocialesFacadeLocal;
import sessions.PersonaFacadeLocal;
import sessions.PrevisionFacadeLocal;
import sessions.PuebloOriginarioFacadeLocal;
import sessions.ReligionFacadeLocal;
import sessions.TipoPrevisionFacadeLocal;

/**
 *
 * @author DevelUser
 */
@ManagedBean
@RequestScoped
public class ListasMB {
    @EJB
    private TipoPrevisionFacadeLocal tipoPrevisionFacade;
    @EJB
    private ReligionFacadeLocal religionFacade;
    @EJB
    private PuebloOriginarioFacadeLocal puebloOriginarioFacade;
    @EJB
    private PrevisionFacadeLocal previsionFacade;
    @EJB
    private PersonaFacadeLocal personaFacade;
    @EJB
    private LeyesSocialesFacadeLocal leyesSocialesFacade;
    @EJB
    private GeneroFacadeLocal generoFacade;
    @EJB
    private EstadoConyugalFacadeLocal estadoConyugalFacade;
    @EJB
    private EspecialidadFacadeLocal especialidadFacade;
    @EJB
    private EducacionFacadeLocal educacionFacade;
    @EJB
    private ConsultorioFacadeLocal consultorioFacade;
    @EJB
    private ComunaFacadeLocal comunaFacade;
    @EJB
    private AreaFacadeLocal areaFacade;

    private List<Area> listaAreas;
    private List<Comuna> listaComuna;
    private List<Consultorio> listaConsultorio;
    private List<Educacion> listaEducacion;
    private List<Especialidad> listaEspecialidad;
    private List<EstadoConyugal> listaEstados;
    private List<Genero> listaGenero;
    private List<LeyesSociales> listaLeyes;
    private List<Persona> listaPersonas;
    private List<Prevision> listaPrevision;
    private List<PuebloOriginario> listaPueblos;
    private List<Religion> listaReligion;
    private List<TipoPrevision> listaTipos; 
    /**
     * Creates a new instance of ListasMB
     */
    public ListasMB() {
    }
    
    @PostConstruct
    public void init(){
        listaAreas = areaFacade.findAll();
        listaComuna = comunaFacade.findAll();
        listaConsultorio = consultorioFacade.findAll();
        listaEducacion = educacionFacade.findAll();
        listaEspecialidad = especialidadFacade.findAll();
        listaEstados = estadoConyugalFacade.findAll();
        listaGenero = generoFacade.findAll();
        listaLeyes = leyesSocialesFacade.findAll();
        listaPersonas = personaFacade.findAll();
        listaPrevision = previsionFacade.findAll();
        listaPueblos = puebloOriginarioFacade.findAll();
        listaReligion = religionFacade.findAll();
        listaTipos = tipoPrevisionFacade.findAll();
    }

    public List<Area> getListaAreas() {
        return listaAreas;
    }

    public void setListaAreas(List<Area> listaAreas) {
        this.listaAreas = listaAreas;
    }

    public List<Comuna> getListaComuna() {
        return listaComuna;
    }

    public void setListaComuna(List<Comuna> listaComuna) {
        this.listaComuna = listaComuna;
    }

    public List<Consultorio> getListaConsultorio() {
        return listaConsultorio;
    }

    public void setListaConsultorio(List<Consultorio> listaConsultorio) {
        this.listaConsultorio = listaConsultorio;
    }

    public List<Educacion> getListaEducacion() {
        return listaEducacion;
    }

    public void setListaEducacion(List<Educacion> listaEducacion) {
        this.listaEducacion = listaEducacion;
    }

    public List<Especialidad> getListaEspecialidad() {
        return listaEspecialidad;
    }

    public void setListaEspecialidad(List<Especialidad> listaEspecialidad) {
        this.listaEspecialidad = listaEspecialidad;
    }

    public List<EstadoConyugal> getListaEstados() {
        return listaEstados;
    }

    public void setListaEstados(List<EstadoConyugal> listaEstados) {
        this.listaEstados = listaEstados;
    }

    public List<Genero> getListaGenero() {
        return listaGenero;
    }

    public void setListaGenero(List<Genero> listaGenero) {
        this.listaGenero = listaGenero;
    }

    public List<LeyesSociales> getListaLeyes() {
        return listaLeyes;
    }

    public void setListaLeyes(List<LeyesSociales> listaLeyes) {
        this.listaLeyes = listaLeyes;
    }

    public List<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(List<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public List<Prevision> getListaPrevision() {
        return listaPrevision;
    }

    public void setListaPrevision(List<Prevision> listaPrevision) {
        this.listaPrevision = listaPrevision;
    }

    public List<PuebloOriginario> getListaPueblos() {
        return listaPueblos;
    }

    public void setListaPueblos(List<PuebloOriginario> listaPueblos) {
        this.listaPueblos = listaPueblos;
    }

    public List<Religion> getListaReligion() {
        return listaReligion;
    }

    public void setListaReligion(List<Religion> listaReligion) {
        this.listaReligion = listaReligion;
    }

    public List<TipoPrevision> getListaTipos() {
        return listaTipos;
    }

    public void setListaTipos(List<TipoPrevision> listaTipos) {
        this.listaTipos = listaTipos;
    }
    
}
