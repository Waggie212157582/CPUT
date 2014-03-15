/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ServiceTest;

import Model.StudyTimeTable;
import Service.Crud.StudyTimeTableCrudServiceInter;
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
public class StudyTimeTableTestCrudService {
    
    public StudyTimeTableTestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Mock
    StudyTimeTableCrudServiceInter crudService;

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(StudyTimeTableCrudServiceInter.class);
    }
    
    @Test
    public void testCreate() throws Exception {
        StudyTimeTable p = new StudyTimeTable.Builder("Maths").time("08:00:00").day("Monday").build();
        StudyTimeTable returnStudyTimeTable = crudService.persist(p);
        when(crudService.persist(p)).thenReturn(returnStudyTimeTable);
        Mockito.verify(crudService).persist(p);


    }
    @Test
    public void testRead() throws Exception {
        StudyTimeTable p = new StudyTimeTable.Builder("Maths").time("08:00:00").day("Monday").build();
        StudyTimeTable returnStudyTimeTable = crudService.find(p.getSubject());
        when(crudService.find(p.getSubject())).thenReturn(returnStudyTimeTable);
        Mockito.verify(crudService).find(p.getSubject());

    }
    

    @Test
    public void testUpdate() throws Exception {

         StudyTimeTable p = new StudyTimeTable.Builder("Maths").time("08:00:00").day("Monday").build();
        StudyTimeTable newP = new StudyTimeTable.Builder("English").studytable(p).time("08:00:00").day("Monday").build();
        StudyTimeTable returnStudyTimeTable = crudService.merge(newP);
        when(crudService.merge(newP)).thenReturn(returnStudyTimeTable);
        Mockito.verify(crudService).merge(newP);

    }

    @Test
    public void testDelete() throws Exception {

        StudyTimeTable p = new StudyTimeTable.Builder("Maths").time("08:00:00").day("Monday").build();
        StudyTimeTable returnStudyTimeTable = crudService.remove(p);
        when(crudService.remove(p)).thenReturn(returnStudyTimeTable);
        Mockito.verify(crudService).remove(p);

    }    

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
