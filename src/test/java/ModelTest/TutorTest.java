/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ModelTest;


import Model.Tutor;
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
public class TutorTest {
    
    public TutorTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCreation() throws Exception {
       Tutor t = new Tutor.Builder(29).staffnum("212157582").firstname("Boniface").lastname("Kabaso").build();
        
       Assert.assertEquals(t.getStaffnum(),"212157582");
       Assert.assertEquals(t.getfirstname(),"Boniface");
       Assert.assertEquals(t.getlastname(),"Kabaso");
       Assert.assertEquals(t.getAge(),29);
       
    }
    
    @Test
    public void testUpdate() throws Exception {
       Tutor t = new Tutor.Builder(29).staffnum("212157582").firstname("Boniface").lastname("Kabaso").build();
       Tutor newT = new Tutor.Builder(22).staffnum("210257894").tut(t).firstname("Kruben").lastname("Naidoo").build();
        
       Assert.assertEquals(newT.getStaffnum(),"212157582");
       Assert.assertEquals(newT.getfirstname(),"Kruben");
       Assert.assertEquals(newT.getlastname(),"Naidoo");
       Assert.assertEquals(newT.getAge(),22);

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
