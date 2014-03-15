/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Service.Crud.CrudImpl;

import Model.Salary;
import Service.Crud.SalaryCrudServiceInter;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author WAGGIE
 */
public class SalaryCrudServiceImpl implements SalaryCrudServiceInter{
    
    public SalaryCrudServiceImpl() {
        
    }
    
    @Transactional(propagation = Propagation.SUPPORTS)
    public Salary find(String s) {
        return null;
    }

    @Transactional(propagation = Propagation.MANDATORY)
    public Salary persist(Salary entity) {

        return null;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Salary merge(Salary entity) {
        return null;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public Salary remove(Salary entity) {
        return  null;
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Salary> findAll() {
        return null;
    }
}
