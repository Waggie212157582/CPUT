/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Service.Crud.CrudImpl;

import Model.Results;
import Service.Crud.ResultsCrudServiceInter;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author WAGGIE
 */
public class ResultsCrudServiceImpl implements ResultsCrudServiceInter{
    
    public ResultsCrudServiceImpl() {
        
    }
    
    @Transactional(propagation = Propagation.SUPPORTS)
    public Results find(String s) {
        return null;
    }

    @Transactional(propagation = Propagation.MANDATORY)
    public Results persist(Results entity) {

        return null;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Results merge(Results entity) {
        return null;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public Results remove(Results entity) {
        return  null;
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Results> findAll() {
        return null;
    }
}