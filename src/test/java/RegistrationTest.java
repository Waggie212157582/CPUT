/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Classes.Registration;
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
public class RegistrationTest {
    
    public RegistrationTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCreation() throws Exception {
      Registration reg = new Registration.Builder(14).studentID("212157582").firstname("Muneem").lastname("Waggie").grade("Grade 8").build();
       
       Assert.assertEquals(reg.getStudentID(),"212157582");
       Assert.assertEquals(reg.getfirstname(),"Muneem");
       Assert.assertEquals(reg.getlastname(),"Waggie");
       Assert.assertEquals(reg.getAge(),14);
       Assert.assertEquals(reg.getGrade(),"Grade 8");
       
    }
    
    @Test
    public void testUpdate() throws Exception {
       Registration newreg = new Registration.Builder(15).studentID("212178945").firstname("Meena").lastname("Nathoo").grade("Grade 9").build();
        Registration reg = new Registration.Builder(14).studentID("212157582").regs(newreg).firstname("Muneem").lastname("Waggie").grade("Grade 8").build();
       
       Assert.assertEquals(reg.getStudentID(),"212178945");
       Assert.assertEquals(reg.getfirstname(),"Muneem");
       Assert.assertEquals(reg.getlastname(),"Waggie");
       Assert.assertEquals(reg.getAge(),14);
       Assert.assertEquals(reg.getGrade(),"Grade 8");
       
       
       
       
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
