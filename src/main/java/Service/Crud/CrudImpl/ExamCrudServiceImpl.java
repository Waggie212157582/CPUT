/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Service.Crud.CrudImpl;

import Model.Exam;
import Service.Crud.ExamCrudServiceInter;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author WAGGIE
 */
public class ExamCrudServiceImpl implements ExamCrudServiceInter{
    
    public ExamCrudServiceImpl() {
        
    }
    
    @Transactional(propagation = Propagation.SUPPORTS)
    public Exam find(String s) {
        return null;
    }

    @Transactional(propagation = Propagation.MANDATORY)
    public Exam persist(Exam entity) {

        return null;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Exam merge(Exam entity) {
        return null;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public Exam remove(Exam entity) {
        return  null;
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Exam> findAll() {
        return null;
    }
}
