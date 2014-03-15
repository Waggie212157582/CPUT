/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ServiceTest;

import Model.ClassGrade;
import Service.Crud.ClassGradeCrudServiceInter;
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
public class ClassGradeTestCrudService {
    
    public ClassGradeTestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Mock
    ClassGradeCrudServiceInter crudService;

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(ClassGradeCrudServiceInter.class);
    }
    
    @Test
    public void testCreate() throws Exception {
        ClassGrade g = new ClassGrade.Builder("Grade 10").build();
        ClassGrade returnGrade = crudService.persist(g);
        when(crudService.persist(g)).thenReturn(returnGrade);
        Mockito.verify(crudService).persist(g);


    }
    @Test
    public void testRead() throws Exception {
        ClassGrade g = new ClassGrade.Builder("Grade 10").build();
        ClassGrade returnGrade = crudService.find(g.getGrade());
        when(crudService.find(g.getGrade())).thenReturn(returnGrade);
        Mockito.verify(crudService).find(g.getGrade());

    }
    

    @Test
    public void testUpdate() throws Exception {

        ClassGrade g = new ClassGrade.Builder("Grade 10").build();
        ClassGrade newG = new ClassGrade.Builder("Grade 12").cGrade(g).build();
        ClassGrade returnGrade = crudService.merge(newG);
        when(crudService.merge(newG)).thenReturn(returnGrade);
        Mockito.verify(crudService).merge(newG);

    }

    @Test
    public void testDelete() throws Exception {

        ClassGrade g = new ClassGrade.Builder("Grade 10").build();
        ClassGrade returnGrade = crudService.remove(g);
        when(crudService.remove(g)).thenReturn(returnGrade);
        Mockito.verify(crudService).remove(g);

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
