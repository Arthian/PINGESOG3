/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessions;

import entities.PuebloOriginario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author DevelUser
 */
@Stateless
public class PuebloOriginarioFacade extends AbstractFacade<PuebloOriginario> implements PuebloOriginarioFacadeLocal {
    @PersistenceContext(unitName = "edu.pingeso.primeraapp_HospitalApp-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PuebloOriginarioFacade() {
        super(PuebloOriginario.class);
    }
    
}
