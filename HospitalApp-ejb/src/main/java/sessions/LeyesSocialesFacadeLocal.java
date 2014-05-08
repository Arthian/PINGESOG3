/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessions;

import entities.LeyesSociales;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DevelUser
 */
@Local
public interface LeyesSocialesFacadeLocal {

    void create(LeyesSociales leyesSociales);

    void edit(LeyesSociales leyesSociales);

    void remove(LeyesSociales leyesSociales);

    LeyesSociales find(Object id);

    List<LeyesSociales> findAll();

    List<LeyesSociales> findRange(int[] range);

    int count();
    
}
