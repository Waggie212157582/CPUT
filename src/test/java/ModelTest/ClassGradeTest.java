package ModelTest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Model.ClassGrade;
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
public class ClassGradeTest {
    
    public ClassGradeTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCreation() throws Exception {
       ClassGrade g = new ClassGrade.Builder("Grade 10").build();
       Assert.assertEquals(g.getGrade(),"Grade 10");
    }
    
    @Test
    public void testUpdate() throws Exception {
       ClassGrade g = new ClassGrade.Builder("Grade 10").build();
       ClassGrade newG = new ClassGrade.Builder("Grade 12").cGrade(g).build();
       
       Assert.assertEquals(newG.getGrade(),"Grade 10");
       

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
