/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ServiceTest;

import Model.Teacher;
import Service.Crud.TeacherCrudServiceInter;
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
public class TeacherTestCrudService {
    
    public TeacherTestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Mock
    TeacherCrudServiceInter crudService;

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(TeacherCrudServiceInter.class);
    }
    
    @Test
    public void testCreate() throws Exception {
        Teacher t = new Teacher.Builder(29).staffnum("212157582").firstname("Boniface").lastname("Kabaso").build();
        Teacher returnTeacher = crudService.persist(t);
        when(crudService.persist(t)).thenReturn(returnTeacher);
        Mockito.verify(crudService).persist(t);


    }
    @Test
    public void testRead() throws Exception {
        Teacher t = new Teacher.Builder(29).staffnum("212157582").firstname("Boniface").lastname("Kabaso").build();
        Teacher returnTeacher = crudService.find(t.getStaffnum());
        when(crudService.find(t.getStaffnum())).thenReturn(returnTeacher);
        Mockito.verify(crudService).find(t.getStaffnum());

    }
    

    @Test
    public void testUpdate() throws Exception {

        
       Teacher t = new Teacher.Builder(29).staffnum("212157582").firstname("Boniface").lastname("Kabaso").build();
       Teacher newT = new Teacher.Builder(22).staffnum("210257894").thr(t).firstname("Kruben").lastname("Naidoo").build();
       Teacher returnTeacher = crudService.merge(newT);
       when(crudService.merge(newT)).thenReturn(returnTeacher);
       Mockito.verify(crudService).merge(newT);

    }

    @Test
    public void testDelete() throws Exception {

        Teacher t = new Teacher.Builder(29).staffnum("212157582").firstname("Boniface").lastname("Kabaso").build();
        Teacher returnTeacher = crudService.remove(t);
        when(crudService.remove(t)).thenReturn(returnTeacher);
        Mockito.verify(crudService).remove(t);

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
