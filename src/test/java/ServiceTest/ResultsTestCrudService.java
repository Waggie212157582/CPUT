/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ServiceTest;

import Model.Results;
import Service.Crud.ResultsCrudServiceInter;
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
public class ResultsTestCrudService {
    
    public ResultsTestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Mock
    ResultsCrudServiceInter crudService;

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(ResultsCrudServiceInter.class);
    }
    
    @Test
    public void testCreate() throws Exception {
        Results re = new Results.Builder(78).studID("212157582").firstname("Muneem").lastname("Waggie").grade("grade 12").subject("Maths").teacher("Mr K.Naidoo").build();
        Results returnResults = crudService.persist(re);
        when(crudService.persist(re)).thenReturn(returnResults);
        Mockito.verify(crudService).persist(re);


    }
    @Test
    public void testRead() throws Exception {
        Results re = new Results.Builder(78).studID("212157582").firstname("Muneem").lastname("Waggie").grade("grade 12").subject("Maths").teacher("Mr K.Naidoo").build();
        Results returnResults = crudService.find(re.getStudID());
        when(crudService.find(re.getStudID())).thenReturn(returnResults);
        Mockito.verify(crudService).find(re.getStudID());

    }
    

    @Test
    public void testUpdate() throws Exception {

        
        Results re = new Results.Builder(78).studID("212157582").firstname("Muneem").lastname("Waggie").grade("grade 12").subject("Maths").teacher("Mr K.Naidoo").build();
        Results res = new Results.Builder(56).res(re).studID("212155897").firstname("Meena").lastname("Nathoo").grade("grade 8").subject("English").teacher("Mr K.Kabaso").build();
        Results returnResults = crudService.merge(res);
        when(crudService.merge(res)).thenReturn(returnResults);
        Mockito.verify(crudService).merge(res);

    }

    @Test
    public void testDelete() throws Exception {

        Results re = new Results.Builder(78).studID("212157582").firstname("Muneem").lastname("Waggie").grade("grade 12").subject("Maths").teacher("Mr K.Naidoo").build();
        Results returnResults = crudService.remove(re);
        when(crudService.remove(re)).thenReturn(returnResults);
        Mockito.verify(crudService).remove(re);

    }    

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
