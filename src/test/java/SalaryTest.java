/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Classes.Salary;
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
public class SalaryTest {
    
    public SalaryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCreation() throws Exception {
       Salary sl = new Salary.Builder(15000.00).staffnum("212157582").firstname("Muneem").lastname("Waggie").build();
        
       Assert.assertEquals(sl.getSalary(),15000.00);
       Assert.assertEquals(sl.getStaffnum(),"212157582");
       Assert.assertEquals(sl.getfirstname(),"Muneem");
       Assert.assertEquals(sl.getlastname(),"Waggie");
    }
    
    @Test
    public void testUpdate() throws Exception {
        Salary sl = new Salary.Builder(15000.00).staffnum("212157582").firstname("Muneem").lastname("Waggie").build();
       Salary newsl = new Salary.Builder(20000.00).sals(sl).staffnum("212144458").firstname("Meena").lastname("Nathoo").build();

       Assert.assertEquals(newsl.getSalary(),15000.00);
       Assert.assertEquals(newsl.getStaffnum(),"212144458");
       Assert.assertEquals(newsl.getfirstname(),"Meena");
       Assert.assertEquals(newsl.getlastname(),"Nathoo");

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
