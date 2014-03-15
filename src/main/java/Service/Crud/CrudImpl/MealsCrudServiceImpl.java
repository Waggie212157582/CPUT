/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Service.Crud.CrudImpl;

import Model.Meals;
import Service.Crud.MealsCrudServiceInter;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author WAGGIE
 */
public class MealsCrudServiceImpl implements MealsCrudServiceInter{
    
    public MealsCrudServiceImpl() {
        
    }
    
    @Transactional(propagation = Propagation.SUPPORTS)
    public Meals find(String s) {
        return null;
    }

    @Transactional(propagation = Propagation.MANDATORY)
    public Meals persist(Meals entity) {

        return null;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Meals merge(Meals entity) {
        return null;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public Meals remove(Meals entity) {
        return  null;
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Meals> findAll() {
        return null;
    }

    
    
}
