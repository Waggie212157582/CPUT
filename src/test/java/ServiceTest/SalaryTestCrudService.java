/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ServiceTest;

import Model.Salary;
import Service.Crud.SalaryCrudServiceInter;
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
public class SalaryTestCrudService {
    
    public SalaryTestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Mock
    SalaryCrudServiceInter crudService;

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(SalaryCrudServiceInter.class);
    }
    
    @Test
    public void testCreate() throws Exception {
        Salary sl = new Salary.Builder(15000.00).staffnum("212157582").firstname("Muneem").lastname("Waggie").build();
        Salary returnSalary = crudService.persist(sl);
        when(crudService.persist(sl)).thenReturn(returnSalary);
        Mockito.verify(crudService).persist(sl);


    }
    @Test
    public void testRead() throws Exception {
        Salary sl = new Salary.Builder(15000.00).staffnum("212157582").firstname("Muneem").lastname("Waggie").build();
        Salary returnSalary = crudService.find(sl.getStaffnum());
        when(crudService.find(sl.getStaffnum())).thenReturn(returnSalary);
        Mockito.verify(crudService).find(sl.getStaffnum());

    }
    

    @Test
    public void testUpdate() throws Exception {

        
        Salary sl = new Salary.Builder(15000.00).staffnum("212157582").firstname("Muneem").lastname("Waggie").build();
        Salary newsl = new Salary.Builder(20000.00).sals(sl).staffnum("212144458").firstname("Meena").lastname("Nathoo").build();
        Salary returnSalary = crudService.merge(newsl);
        when(crudService.merge(newsl)).thenReturn(returnSalary);
        Mockito.verify(crudService).merge(newsl);

    }

    @Test
    public void testDelete() throws Exception {

        Salary sl = new Salary.Builder(15000.00).staffnum("212157582").firstname("Muneem").lastname("Waggie").build();
        Salary returnSalary = crudService.remove(sl);
        when(crudService.remove(sl)).thenReturn(returnSalary);
        Mockito.verify(crudService).remove(sl);

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
