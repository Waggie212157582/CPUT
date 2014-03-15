package ModelTest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Model.Student;
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
public class StudentTest {
    
    public StudentTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCreation() throws Exception {
       Student s = new Student.Builder(15).studentID("212157582").firstname("Muneem").lastname("Waggie").build();
        
       Assert.assertEquals(s.getStudentID(),"212157582");
       Assert.assertEquals(s.getfirstname(),"Muneem");
       Assert.assertEquals(s.getlastname(),"Waggie");
       Assert.assertEquals(s.getAge(),15);
    }
    
    @Test
    public void testUpdate() throws Exception {
       Student s = new Student.Builder(15).studentID("212157582").firstname("Muneem").lastname("Waggie").build();
       Student newS = new Student.Builder(16).student(s).studentID("211200107").firstname("Meena").lastname("Nathoo").build();
        
       Assert.assertEquals(newS.getStudentID(),"211200107");
       Assert.assertEquals(newS.getfirstname(),"Meena");
       Assert.assertEquals(newS.getlastname(),"Nathoo");
       Assert.assertEquals(newS.getAge(),15);

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
