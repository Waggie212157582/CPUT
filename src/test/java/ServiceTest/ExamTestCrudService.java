/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ServiceTest;


import Model.Exam;
import Service.Crud.ExamCrudServiceInter;
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
public class ExamTestCrudService {
    
    public ExamTestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Mock
    ExamCrudServiceInter crudService;

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(ExamCrudServiceInter.class);
        
    }
    
    @Test
    public void testCreate() throws Exception {
        Exam ex = new Exam.Builder("B Block room 2").time("12:00:00").build();
        Exam returnGrade = crudService.persist(ex);
        when(crudService.persist(ex)).thenReturn(returnGrade);
        Mockito.verify(crudService).persist(ex);


    }
    @Test
    public void testRead() throws Exception {
        Exam ex = new Exam.Builder("B Block room 2").time("12:00:00").build();
        Exam returnRoom = crudService.find(ex.getLocation());
        when(crudService.find(ex.getLocation())).thenReturn(returnRoom);
        Mockito.verify(crudService).find(ex.getLocation());

    }
    

    @Test
    public void testUpdate() throws Exception {

        Exam ex = new Exam.Builder("B Block room 2").time("12:00:00").build();
        Exam newEx = new Exam.Builder("C Block room 5").time("10:00:00").ex(ex).build();
       Exam returnRoom = crudService.merge(newEx);
        when(crudService.merge(newEx)).thenReturn(returnRoom);
        Mockito.verify(crudService).merge(newEx);

    }

    @Test
    public void testDelete() throws Exception {

        Exam ex = new Exam.Builder("B Block room 2").time("12:00:00").build();
        Exam returnRoom = crudService.remove(ex);
        when(crudService.remove(ex)).thenReturn(returnRoom);
        Mockito.verify(crudService).remove(ex);

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
