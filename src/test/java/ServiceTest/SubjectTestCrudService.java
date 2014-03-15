/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ServiceTest;

import Model.Subject;
import Service.Crud.SubjectCrudServiceInter;
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
public class SubjectTestCrudService {
    
    public SubjectTestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Mock
    SubjectCrudServiceInter crudService;

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(SubjectCrudServiceInter.class);
    }
    
    @Test
    public void testCreate() throws Exception {
        Subject sub= new Subject.Builder("Maths").build();
        Subject returnSubject = crudService.persist(sub);
        when(crudService.persist(sub)).thenReturn(returnSubject);
        Mockito.verify(crudService).persist(sub);


    }
    @Test
    public void testRead() throws Exception {
        Subject sub= new Subject.Builder("Maths").build();
        Subject returnSubject = crudService.find(sub.getStudentSub());
        when(crudService.find(sub.getStudentSub())).thenReturn(returnSubject);
        Mockito.verify(crudService).find(sub.getStudentSub());

    }
    

    @Test
    public void testUpdate() throws Exception {

        
       Subject sub= new Subject.Builder("Maths").build();
       Subject newSub= new Subject.Builder("English").subs(sub).build();
       Subject returnSubject = crudService.merge(newSub);
       when(crudService.merge(newSub)).thenReturn(returnSubject);
       Mockito.verify(crudService).merge(newSub);

    }

    @Test
    public void testDelete() throws Exception {

        Subject sub= new Subject.Builder("Maths").build();
        Subject returnSubject = crudService.remove(sub);
        when(crudService.remove(sub)).thenReturn(returnSubject);
        Mockito.verify(crudService).remove(sub);

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
