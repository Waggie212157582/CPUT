/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ServiceTest;


import Model.Registration;
import Service.Crud.RegistrationCrudServiceInter;
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
public class RegistartionTestCrudService {
    
    public RegistartionTestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Mock
    RegistrationCrudServiceInter crudService;

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(RegistrationCrudServiceInter.class);
    }

     @Test
    public void testCreate() throws Exception {
        Registration newreg = new Registration.Builder(15).studentID("212178945").firstname("Meena").lastname("Nathoo").grade("Grade 9").build();
        Registration returnRegistration = crudService.persist(newreg);
        when(crudService.persist(newreg)).thenReturn(returnRegistration);
        Mockito.verify(crudService).persist(newreg);


    }
    @Test
    public void testRead() throws Exception {
        Registration newreg = new Registration.Builder(15).studentID("212178945").firstname("Meena").lastname("Nathoo").grade("Grade 9").build();
        Registration returnRegistration = crudService.find(newreg.getStudentID());
        when(crudService.find(newreg.getStudentID())).thenReturn(returnRegistration);
        Mockito.verify(crudService).find(newreg.getStudentID());

    }
    

    @Test
    public void testUpdate() throws Exception {

        
        Registration newreg = new Registration.Builder(15).studentID("212178945").firstname("Meena").lastname("Nathoo").grade("Grade 9").build();
        Registration reg = new Registration.Builder(14).studentID("212157582").regs(newreg).firstname("Muneem").lastname("Waggie").grade("Grade 8").build();
        Registration returnRegistration = crudService.merge(reg);
        when(crudService.merge(reg)).thenReturn(returnRegistration);
        Mockito.verify(crudService).merge(reg);

    }

    @Test
    public void testDelete() throws Exception {

        Registration newreg = new Registration.Builder(15).studentID("212178945").firstname("Meena").lastname("Nathoo").grade("Grade 9").build();
        Registration returnRegistration = crudService.remove(newreg);
        when(crudService.remove(newreg)).thenReturn(returnRegistration);
        Mockito.verify(crudService).remove(newreg);

    }    

    
    
    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
