/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Classes.Exam;
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
public class ExamTest {
    
    public ExamTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCreation() throws Exception {
       Exam ex = new Exam.Builder("B Block room 2").time("12:00:00").build();
       Assert.assertEquals(ex.getLocation(),"B Block room 2");
       Assert.assertEquals(ex.getTime(),"12:00:00");
    }
    
    @Test
    public void testUpdate() throws Exception {
        Exam ex = new Exam.Builder("B Block room 2").time("12:00:00").build();
       Exam newEx = new Exam.Builder("C Block room 5").time("10:00:00").ex(ex).build();
       Assert.assertEquals(newEx.getLocation(),"C Block room 5");
       Assert.assertEquals(newEx.getTime(),"12:00:00");
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
