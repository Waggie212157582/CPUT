/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Service.Crud.CrudImpl;

import Model.Student;
import Service.Crud.StudentCrudServiceInter;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author WAGGIE
 */
public class StudentCrudServiceImpl implements StudentCrudServiceInter{
    
    public StudentCrudServiceImpl() {
        
    }
    
    @Transactional(propagation = Propagation.SUPPORTS)
    public Student find(String s) {
        return null;
    }

    @Transactional(propagation = Propagation.MANDATORY)
    public Student persist(Student entity) {

        return null;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Student merge(Student entity) {
        return null;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public Student remove(Student entity) {
        return  null;
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Student> findAll() {
        return null;
    }
}
    