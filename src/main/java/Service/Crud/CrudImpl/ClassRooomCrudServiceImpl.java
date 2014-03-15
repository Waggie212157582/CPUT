/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Service.Crud.CrudImpl;

import Model.ClassRoom;
import Service.Crud.ClassRoomCrudServiceInter;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author WAGGIE
 */
public class ClassRooomCrudServiceImpl implements ClassRoomCrudServiceInter{
    
    public ClassRooomCrudServiceImpl() {
        
    }
    
    @Transactional(propagation = Propagation.SUPPORTS)
    public ClassRoom find(String s) {
        return null;
    }

    @Transactional(propagation = Propagation.MANDATORY)
    public ClassRoom persist(ClassRoom entity) {

        return null;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public ClassRoom merge(ClassRoom entity) {
        return null;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public ClassRoom remove(ClassRoom entity) {
        return  null;
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<ClassRoom> findAll() {
        return null;
    }
    
}
