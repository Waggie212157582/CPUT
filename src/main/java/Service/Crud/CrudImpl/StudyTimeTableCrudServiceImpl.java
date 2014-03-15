/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Service.Crud.CrudImpl;

import Model.StudyTimeTable;
import Service.Crud.StudyTimeTableCrudServiceInter;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author WAGGIE
 */
public class StudyTimeTableCrudServiceImpl implements StudyTimeTableCrudServiceInter{
    
    public StudyTimeTableCrudServiceImpl() {
        
    }
    
    @Transactional(propagation = Propagation.SUPPORTS)
    public StudyTimeTable find(String s) {
        return null;
    }

    @Transactional(propagation = Propagation.MANDATORY)
    public StudyTimeTable persist(StudyTimeTable entity) {

        return null;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public StudyTimeTable merge(StudyTimeTable entity) {
        return null;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public StudyTimeTable remove(StudyTimeTable entity) {
        return  null;
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<StudyTimeTable> findAll() {
        return null;
    }
}
