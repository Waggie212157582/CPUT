/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ServiceTest;

import Model.Student;
import Service.Crud.StudentCrudServiceInter;
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
public class StudentTestCrudService {
    
    public StudentTestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Mock
    StudentCrudServiceInter crudService;

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(StudentCrudServiceInter.class);
    }
    
    @Test
    public void testCreate() throws Exception {
        Student s = new Student.Builder(15).studentID("212157582").firstname("Muneem").lastname("Waggie").build();
        Student returnStudent = crudService.persist(s);
        when(crudService.persist(s)).thenReturn(returnStudent);
        Mockito.verify(crudService).persist(s);


    }
    @Test
    public void testRead() throws Exception {
        Student s = new Student.Builder(15).studentID("212157582").firstname("Muneem").lastname("Waggie").build();
        Student returnStudent = crudService.find(s.getStudentID());
        when(crudService.find(s.getStudentID())).thenReturn(returnStudent);
        Mockito.verify(crudService).find(s.getStudentID());

    }
    

    @Test
    public void testUpdate() throws Exception {

        
        Student s = new Student.Builder(15).studentID("212157582").firstname("Muneem").lastname("Waggie").build();
        Student newS = new Student.Builder(16).student(s).studentID("211200107").firstname("Meena").lastname("Nathoo").build();
        Student returnStudent = crudService.merge(newS);
        when(crudService.merge(newS)).thenReturn(returnStudent);
        Mockito.verify(crudService).merge(newS);

    }

    @Test
    public void testDelete() throws Exception {

        Student s = new Student.Builder(15).studentID("212157582").firstname("Muneem").lastname("Waggie").build();
        Student returnStudent = crudService.remove(s);
        when(crudService.remove(s)).thenReturn(returnStudent);
        Mockito.verify(crudService).remove(s);

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
