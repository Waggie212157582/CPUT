/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Service.Crud.CrudImpl;

import Model.Books;
import Service.Crud.BooksCrudServiceInter;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author WAGGIE
 */
public class BooksCrudServiceImpl implements BooksCrudServiceInter {

    public BooksCrudServiceImpl() {
        
    }
    
    @Transactional(propagation = Propagation.SUPPORTS)
    public Books find(String s) {
        return null;
    }

    @Transactional(propagation = Propagation.MANDATORY)
    public Books persist(Books entity) {

        return null;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Books merge(Books entity) {
        return null;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public Books remove(Books entity) {
        return  null;
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Books> findAll() {
        return null;
    }
    
}
