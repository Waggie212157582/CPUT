/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Service.Crud.CrudImpl;

import Model.StudentLevel;
import Service.Crud.StudentLevelCrudServiceInter;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author WAGGIE
 */
public class StudentLevelCrudServiceImpl implements StudentLevelCrudServiceInter{
    
    public StudentLevelCrudServiceImpl() {
        
    }
    
    @Transactional(propagation = Propagation.SUPPORTS)
    public StudentLevel find(String s) {
        return null;
    }

    @Transactional(propagation = Propagation.MANDATORY)
    public StudentLevel persist(StudentLevel entity) {

        return null;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public StudentLevel merge(StudentLevel entity) {
        return null;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public StudentLevel remove(StudentLevel entity) {
        return  null;
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<StudentLevel> findAll() {
        return null;
    }
}
    
