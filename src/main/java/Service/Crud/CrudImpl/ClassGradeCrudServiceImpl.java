/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Service.Crud.CrudImpl;

import Model.ClassGrade;
import Service.Crud.ClassGradeCrudServiceInter;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author WAGGIE
 */
public class ClassGradeCrudServiceImpl implements ClassGradeCrudServiceInter{
    
    public ClassGradeCrudServiceImpl() {
        
    }
    
    @Transactional(propagation = Propagation.SUPPORTS)
    public ClassGrade find(String s) {
        return null;
    }

    @Transactional(propagation = Propagation.MANDATORY)
    public ClassGrade persist(ClassGrade entity) {

        return null;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public ClassGrade merge(ClassGrade entity) {
        return null;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public ClassGrade remove(ClassGrade entity) {
        return  null;
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<ClassGrade> findAll() {
        return null;
    }
    
}
