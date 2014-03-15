/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Service.Crud.CrudImpl;

import Model.Registration;
import Service.Crud.RegistrationCrudServiceInter;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author WAGGIE
 */
public class RegistrationCrudServiceImpl implements RegistrationCrudServiceInter{
    
    public RegistrationCrudServiceImpl() {
        
    }
    
    @Transactional(propagation = Propagation.SUPPORTS)
    public Registration find(String s) {
        return null;
    }

    @Transactional(propagation = Propagation.MANDATORY)
    public Registration persist(Registration entity) {

        return null;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Registration merge(Registration entity) {
        return null;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public Registration remove(Registration entity) {
        return  null;
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Registration> findAll() {
        return null;
    }
}
