/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ServiceTest;

import Model.StudentLevel;
import Service.Crud.StudentLevelCrudServiceInter;
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
public class StudentLevelTestCrudService {
    
    public StudentLevelTestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Mock
    StudentLevelCrudServiceInter crudService;

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(StudentLevelCrudServiceInter.class);
        
    }
    
    @Test
    public void testCreate() throws Exception {
        StudentLevel l = new StudentLevel.Builder("Prefect").build();
        StudentLevel returnStudentLevel = crudService.persist(l);
        when(crudService.persist(l)).thenReturn(returnStudentLevel);
        Mockito.verify(crudService).persist(l);


    }
    @Test
    public void testRead() throws Exception {
        
        StudentLevel l = new StudentLevel.Builder("Prefect").build();
        StudentLevel returnStudentLevel = crudService.find(l.getLevel());
        when(crudService.find(l.getLevel())).thenReturn(returnStudentLevel);
        Mockito.verify(crudService).find(l.getLevel());

    }
    

    @Test
    public void testUpdate() throws Exception {

        
       StudentLevel l = new StudentLevel.Builder("Prefect").build();
       StudentLevel newl = new StudentLevel.Builder("Junior").lev(l).build();
       StudentLevel returnStudentLevel = crudService.merge(newl);
       when(crudService.merge(newl)).thenReturn(returnStudentLevel);
       Mockito.verify(crudService).merge(newl);

    }

    @Test
    public void testDelete() throws Exception {

        StudentLevel l = new StudentLevel.Builder("Prefect").build();
        StudentLevel returnStudentLevel = crudService.remove(l);
        when(crudService.remove(l)).thenReturn(returnStudentLevel);
        Mockito.verify(crudService).remove(l);

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
