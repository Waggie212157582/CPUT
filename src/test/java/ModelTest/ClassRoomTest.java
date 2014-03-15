package ModelTest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Model.ClassRoom;
import org.testng.Assert;
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
public class ClassRoomTest {
    
    public ClassRoomTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCreation() throws Exception {
       ClassRoom cr = new ClassRoom.Builder("Teaching Block C").roomNum(8).build();
       Assert.assertEquals(cr.getLocation(),"Teaching Block C");
       Assert.assertEquals(cr.getRoomNum(),8);
    }
    
    @Test
    public void testUpdate() throws Exception {
       ClassRoom cr = new ClassRoom.Builder("Teaching Block C").roomNum(8).build();
       ClassRoom newcr = new ClassRoom.Builder("Teaching Block D").roomNum(16).cRoom(cr).build();
       Assert.assertEquals(newcr.getLocation(),"Teaching Block D");
       Assert.assertEquals(newcr.getRoomNum(),8);
       
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
