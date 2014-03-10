/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Classes.ExtraMuralActivity;
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
public class ExtraMuralActivityTest {
    
    public ExtraMuralActivityTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCreation() throws Exception {
       ExtraMuralActivity ex = new ExtraMuralActivity.Builder("Muneem").activity("Dancing").build();
       Assert.assertEquals(ex.getName(),"Muneem");
       Assert.assertEquals(ex.getActivity(),"Dancing");
    }
    
    @Test
    public void testUpdate() throws Exception {
        ExtraMuralActivity ex = new ExtraMuralActivity.Builder("Muneem").activity("Dancing").build();
        ExtraMuralActivity e = new ExtraMuralActivity.Builder("Meena").mactive(ex).activity("Sing").mactive(ex).build();
       Assert.assertEquals(e.getName(),"Muneem");
       Assert.assertEquals(e.getActivity(),"Dancing");
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
