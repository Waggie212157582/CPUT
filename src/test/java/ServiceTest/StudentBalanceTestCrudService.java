/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ServiceTest;

import Model.StudentBalance;
import Service.Crud.StudentBalanceCrudServiceInter;
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
public class StudentBalanceTestCrudService {
    
    @Mock
    StudentBalanceCrudServiceInter crudService;
    
    public StudentBalanceTestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(StudentBalanceCrudServiceInter.class);
    }
    
    @Test
    public void testCreate() throws Exception {
        StudentBalance sl = new StudentBalance.Builder(1000.00).studnum("212157582").firstname("Muneem").lastname("Waggie").build();
        StudentBalance returnStudentBalance = crudService.persist(sl);
        when(crudService.persist(sl)).thenReturn(returnStudentBalance);
        Mockito.verify(crudService).persist(sl);


    }
    @Test
    public void testRead() throws Exception {
        StudentBalance sl = new StudentBalance.Builder(10000.00).studnum("212157582").firstname("Muneem").lastname("Waggie").build();
        StudentBalance returnStudentBalance = crudService.find(sl.getStudNum());
        when(crudService.find(sl.getStudNum())).thenReturn(returnStudentBalance);
        Mockito.verify(crudService).find(sl.getStudNum());

    }
    

    @Test
    public void testUpdate() throws Exception {

        
        StudentBalance sl = new StudentBalance.Builder(15000.00).studnum("212157582").firstname("Muneem").lastname("Waggie").build();
        StudentBalance newsl = new StudentBalance.Builder(20000.00).bal(sl).studnum("212144458").firstname("Meena").lastname("Nathoo").build();
        StudentBalance returnStudentBalance = crudService.merge(newsl);
        when(crudService.merge(newsl)).thenReturn(returnStudentBalance);
        Mockito.verify(crudService).merge(newsl);

    }

    @Test
    public void testDelete() throws Exception {

        StudentBalance sl = new StudentBalance.Builder(15000.00).studnum("212157582").firstname("Muneem").lastname("Waggie").build();
        StudentBalance returnStudentBalance = crudService.remove(sl);
        when(crudService.remove(sl)).thenReturn(returnStudentBalance);
        Mockito.verify(crudService).remove(sl);

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
