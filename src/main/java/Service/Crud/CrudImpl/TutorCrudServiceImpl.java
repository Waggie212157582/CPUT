/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Service.Crud.CrudImpl;

import Model.Tutor;
import Service.Crud.TutorCrudServiceInter;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author WAGGIE
 */
public class TutorCrudServiceImpl implements TutorCrudServiceInter{
    
    public TutorCrudServiceImpl() {
        
    }
    
    @Transactional(propagation = Propagation.SUPPORTS)
    public Tutor find(String s) {
        return null;
    }

    @Transactional(propagation = Propagation.MANDATORY)
    public Tutor persist(Tutor entity) {

        return null;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Tutor merge(Tutor entity) {
        return null;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public Tutor remove(Tutor entity) {
        return  null;
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Tutor> findAll() {
        return null;
    }
}
