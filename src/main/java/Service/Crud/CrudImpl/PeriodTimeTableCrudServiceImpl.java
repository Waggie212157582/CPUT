/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Service.Crud.CrudImpl;

import Model.PeriodTimeTable;
import Service.Crud.PeriodTimeTableCrudServiceInter;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author WAGGIE
 */
public class PeriodTimeTableCrudServiceImpl implements PeriodTimeTableCrudServiceInter{
    
    public PeriodTimeTableCrudServiceImpl() {
        
    }
    
    @Transactional(propagation = Propagation.SUPPORTS)
    public PeriodTimeTable find(String s) {
        return null;
    }

    @Transactional(propagation = Propagation.MANDATORY)
    public PeriodTimeTable persist(PeriodTimeTable entity) {

        return null;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public PeriodTimeTable merge(PeriodTimeTable entity) {
        return null;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public PeriodTimeTable remove(PeriodTimeTable entity) {
        return  null;
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<PeriodTimeTable> findAll() {
        return null;
    }

    
    
}
