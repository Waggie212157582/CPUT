/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ServiceTest;

import Model.PeriodTimeTable;
import Service.Crud.PeriodTimeTableCrudServiceInter;
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
public class PeriodTimeTableTestCrudService {
    
    public PeriodTimeTableTestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Mock
    PeriodTimeTableCrudServiceInter crudService;

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(PeriodTimeTableCrudServiceInter.class);
    }
    
     @Test
    public void testCreate() throws Exception {
        PeriodTimeTable p = new PeriodTimeTable.Builder("Maths").time("08:00:00").day("Monday").build();
        PeriodTimeTable returnPeriodTimeTable = crudService.persist(p);
        when(crudService.persist(p)).thenReturn(returnPeriodTimeTable);
        Mockito.verify(crudService).persist(p);


    }
    @Test
    public void testRead() throws Exception {
        PeriodTimeTable p = new PeriodTimeTable.Builder("Maths").time("08:00:00").day("Monday").build();
        PeriodTimeTable returnPeriodTimeTable = crudService.find(p.getSubject());
        when(crudService.find(p.getSubject())).thenReturn(returnPeriodTimeTable);
        Mockito.verify(crudService).find(p.getSubject());

    }
    

    @Test
    public void testUpdate() throws Exception {

         PeriodTimeTable p = new PeriodTimeTable.Builder("Maths").time("08:00:00").day("Monday").build();
        PeriodTimeTable newP = new PeriodTimeTable.Builder("Maths").periodtable(p).time("08:00:00").day("Monday").build();
        PeriodTimeTable returnPeriodTimeTable = crudService.merge(newP);
        when(crudService.merge(newP)).thenReturn(returnPeriodTimeTable);
        Mockito.verify(crudService).merge(newP);

    }

    @Test
    public void testDelete() throws Exception {

        PeriodTimeTable p = new PeriodTimeTable.Builder("Maths").time("08:00:00").day("Monday").build();
        PeriodTimeTable returnPeriodTimeTable = crudService.remove(p);
        when(crudService.remove(p)).thenReturn(returnPeriodTimeTable);
        Mockito.verify(crudService).remove(p);

    }    

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
