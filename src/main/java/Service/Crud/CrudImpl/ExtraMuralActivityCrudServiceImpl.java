/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Service.Crud.CrudImpl;

import Model.ExtraMuralActivity;
import Service.Crud.ExtraMuralActivityCrudServiceInter;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author WAGGIE
 */
public class ExtraMuralActivityCrudServiceImpl implements ExtraMuralActivityCrudServiceInter{
    
    public ExtraMuralActivityCrudServiceImpl() {
        
    }
    
    @Transactional(propagation = Propagation.SUPPORTS)
    public ExtraMuralActivity find(String s) {
        return null;
    }

    @Transactional(propagation = Propagation.MANDATORY)
    public ExtraMuralActivity persist(ExtraMuralActivity entity) {

        return null;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public ExtraMuralActivity merge(ExtraMuralActivity entity) {
        return null;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public ExtraMuralActivity remove(ExtraMuralActivity entity) {
        return  null;
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<ExtraMuralActivity> findAll() {
        return null;
    }

    
    
}
