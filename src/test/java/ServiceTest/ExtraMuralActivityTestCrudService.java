/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ServiceTest;

import Model.ExtraMuralActivity;
import Service.Crud.ExtraMuralActivityCrudServiceInter;
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
public class ExtraMuralActivityTestCrudService {
    
    public ExtraMuralActivityTestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Mock
    ExtraMuralActivityCrudServiceInter crudService;

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(ExtraMuralActivityCrudServiceInter.class);
    }
    
    @Test
    public void testCreate() throws Exception {
        ExtraMuralActivity ex = new ExtraMuralActivity.Builder("Muneem").activity("Dancing").build();
        ExtraMuralActivity returnActivity = crudService.persist(ex);
        when(crudService.persist(ex)).thenReturn(returnActivity);
        Mockito.verify(crudService).persist(ex);


    }
    @Test
    public void testRead() throws Exception {
        ExtraMuralActivity ex = new ExtraMuralActivity.Builder("Muneem").activity("Dancing").build();
        ExtraMuralActivity returnActivity = crudService.find(ex.getName());
        when(crudService.find(ex.getName())).thenReturn(returnActivity);
        Mockito.verify(crudService).find(ex.getName());

    }
    

    @Test
    public void testUpdate() throws Exception {

        ExtraMuralActivity ex = new ExtraMuralActivity.Builder("Muneem").activity("Dancing").build();
        ExtraMuralActivity e = new ExtraMuralActivity.Builder("Meena").mactive(ex).activity("Sing").mactive(ex).build();
        ExtraMuralActivity returnActivity = crudService.merge(e);
        when(crudService.merge(e)).thenReturn(returnActivity);
        Mockito.verify(crudService).merge(e);

    }

    @Test
    public void testDelete() throws Exception {

        ExtraMuralActivity ex = new ExtraMuralActivity.Builder("Muneem").activity("Dancing").build();
        ExtraMuralActivity returnActivity = crudService.remove(ex);
        when(crudService.remove(ex)).thenReturn(returnActivity);
        Mockito.verify(crudService).remove(ex);

    }    

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
