/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ModelTest;

import Model.StudentBalance;
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
public class StudentBalanceTest {
    
    public StudentBalanceTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCreation() throws Exception {
       StudentBalance sl = new StudentBalance.Builder(1000.00).studnum("212157582").firstname("Muneem").lastname("Waggie").build();
        
       Assert.assertEquals(sl.getBalance(),1000.00);
       Assert.assertEquals(sl.getStudNum(),"212157582");
       Assert.assertEquals(sl.getfirstname(),"Muneem");
       Assert.assertEquals(sl.getlastname(),"Waggie");
    }
    
    @Test
    public void testUpdate() throws Exception {
       StudentBalance sl = new StudentBalance.Builder(1000.00).studnum("212157582").firstname("Muneem").lastname("Waggie").build();
       StudentBalance newsl = new StudentBalance.Builder(20000.00).bal(sl).studnum("212144458").firstname("Meena").lastname("Nathoo").build();

       Assert.assertEquals(newsl.getBalance(),1000.00);
       Assert.assertEquals(newsl.getStudNum(),"212144458");
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
