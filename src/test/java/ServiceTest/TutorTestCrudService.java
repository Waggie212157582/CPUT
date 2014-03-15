/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ServiceTest;

import Model.Tutor;
import Service.Crud.TutorCrudServiceInter;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author WAGGIE
 */
public class TutorTestCrudService {
    
    public TutorTestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Mock
    TutorCrudServiceInter crudService;

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(TutorCrudServiceInter.class);
    }
    
    @Test
    public void testCreate() throws Exception {
        Tutor t = new Tutor.Builder(29).staffnum("212157582").firstname("Boniface").lastname("Kabaso").build();
        Tutor returnTutor = crudService.persist(t);
        when(crudService.persist(t)).thenReturn(returnTutor);
        Mockito.verify(crudService).persist(t);


    }
    @Test
    public void testRead() throws Exception {
        Tutor t = new Tutor.Builder(29).staffnum("212157582").firstname("Boniface").lastname("Kabaso").build();
        Tutor returnTutor = crudService.find(t.getStaffnum());
        when(crudService.find(t.getStaffnum())).thenReturn(returnTutor);
        Mockito.verify(crudService).find(t.getStaffnum());

    }
    

    @Test
    public void testUpdate() throws Exception {

        
        Tutor t = new Tutor.Builder(29).staffnum("212157582").firstname("Boniface").lastname("Kabaso").build();
       Tutor newT = new Tutor.Builder(22).staffnum("210257894").tut(t).firstname("Kruben").lastname("Naidoo").build();
       Tutor returnTutor = crudService.merge(newT);
       when(crudService.merge(newT)).thenReturn(returnTutor);
       Mockito.verify(crudService).merge(newT);

    }

    @Test
    public void testDelete() throws Exception {

        Tutor t = new Tutor.Builder(29).staffnum("212157582").firstname("Boniface").lastname("Kabaso").build();
        Tutor returnTutor = crudService.remove(t);
        when(crudService.remove(t)).thenReturn(returnTutor);
        Mockito.verify(crudService).remove(t);

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
