/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Service.Crud.CrudImpl;

import Model.Subject;
import Service.Crud.SubjectCrudServiceInter;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author WAGGIE
 */
public class SubjectCrudServiceImpl implements SubjectCrudServiceInter{
    
    public SubjectCrudServiceImpl() {
        
    }
    
    @Transactional(propagation = Propagation.SUPPORTS)
    public Subject find(String s) {
        return null;
    }

    @Transactional(propagation = Propagation.MANDATORY)
    public Subject persist(Subject entity) {

        return null;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Subject merge(Subject entity) {
        return null;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public Subject remove(Subject entity) {
        return  null;
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Subject> findAll() {
        return null;
    }
}