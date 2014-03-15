/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ModelTest;

import Model.StudyTimeTable;
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
public class StudyTimeTableTest {
    
    public StudyTimeTableTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCreation() throws Exception {
      StudyTimeTable p = new StudyTimeTable.Builder("Maths").time("08:00:00").day("Monday").build();
       
       Assert.assertEquals(p.getSubject(),"Maths");
       Assert.assertEquals(p.getTime(),"08:00:00");
       Assert.assertEquals(p.getday(),"Monday");
       
       
    }
    
    @Test
    public void testUpdate() throws Exception {
       StudyTimeTable p = new StudyTimeTable.Builder("Maths").time("08:00:00").day("Monday").build();
       StudyTimeTable newP = new StudyTimeTable.Builder("English").studytable(p).time("08:00:00").day("Monday").build();
       
       Assert.assertEquals(newP.getSubject(),"Maths");
       Assert.assertEquals(newP.getTime(),"08:00:00");
       Assert.assertEquals(newP.getday(),"Monday");
       
       
       
       
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
