/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ServiceTest;

import Model.ClassRoom;
import Service.Crud.ClassRoomCrudServiceInter;
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
public class ClassRooomTestCrudService {
    
    public ClassRooomTestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Mock
    ClassRoomCrudServiceInter crudService;

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(ClassRoomCrudServiceInter.class);
    }

    @Test
    public void testCreate() throws Exception {
        ClassRoom g = new ClassRoom.Builder("Grade 10").build();
        ClassRoom returnGrade = crudService.persist(g);
        when(crudService.persist(g)).thenReturn(returnGrade);
        Mockito.verify(crudService).persist(g);


    }
    @Test
    public void testRead() throws Exception {
        ClassRoom cr = new ClassRoom.Builder("Teaching Block C").roomNum(8).build();
        ClassRoom returnRoom = crudService.find(cr.getLocation());
        when(crudService.find(cr.getLocation())).thenReturn(returnRoom);
        Mockito.verify(crudService).find(cr.getLocation());

    }
    

    @Test
    public void testUpdate() throws Exception {

        ClassRoom cr = new ClassRoom.Builder("Teaching Block C").roomNum(8).build();
        ClassRoom newcr = new ClassRoom.Builder("Teaching Block D").roomNum(16).cRoom(cr).build();
        ClassRoom returnRoom = crudService.merge(newcr);
        when(crudService.merge(newcr)).thenReturn(returnRoom);
        Mockito.verify(crudService).merge(newcr);

    }

    @Test
    public void testDelete() throws Exception {

        ClassRoom cr = new ClassRoom.Builder("Teaching Block C").roomNum(8).build();
        ClassRoom returnRoom = crudService.remove(cr);
        when(crudService.remove(cr)).thenReturn(returnRoom);
        Mockito.verify(crudService).remove(cr);

    }    
    
    
    @AfterMethod
    public void tearDownMethod() throws Exception {
        
        
    }
}
