/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ModelTest;

import Model.StudentLevel;
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
public class StudentLevelTest {
    
    public StudentLevelTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCreation() throws Exception {
       StudentLevel l = new StudentLevel.Builder("Prefect").build();
       Assert.assertEquals(l.getLevel(),"Prefect");
    }
    
    @Test
    public void testUpdate() throws Exception {
       StudentLevel l = new StudentLevel.Builder("Prefect").build();
       StudentLevel newl = new StudentLevel.Builder("Junior").lev(l).build();
       
       Assert.assertEquals(newl.getLevel(),"Prefect");
       

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
