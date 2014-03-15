/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Service.Crud.CrudImpl;

import Model.StudentBalance;
import Service.Crud.StudentBalanceCrudServiceInter;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author WAGGIE
 */
public class StudentBalanceCrudServiceImpl implements StudentBalanceCrudServiceInter{
    
    public StudentBalanceCrudServiceImpl() {
        
    }
    
    @Transactional(propagation = Propagation.SUPPORTS)
    public StudentBalance find(String s) {
        return null;
    }

    @Transactional(propagation = Propagation.MANDATORY)
    public StudentBalance persist(StudentBalance entity) {

        return null;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public StudentBalance merge(StudentBalance entity) {
        return null;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public StudentBalance remove(StudentBalance entity) {
        return  null;
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<StudentBalance> findAll() {
        return null;
    }
}

