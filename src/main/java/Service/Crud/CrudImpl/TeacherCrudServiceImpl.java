/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Service.Crud.CrudImpl;

import Model.Teacher;
import Service.Crud.TeacherCrudServiceInter;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author WAGGIE
 */
public class TeacherCrudServiceImpl implements TeacherCrudServiceInter{
    
    public TeacherCrudServiceImpl() {
        
    }
    
    @Transactional(propagation = Propagation.SUPPORTS)
    public Teacher find(String s) {
        return null;
    }

    @Transactional(propagation = Propagation.MANDATORY)
    public Teacher persist(Teacher entity) {

        return null;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Teacher merge(Teacher entity) {
        return null;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public Teacher remove(Teacher entity) {
        return  null;
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Teacher> findAll() {
        return null;
    }
}
