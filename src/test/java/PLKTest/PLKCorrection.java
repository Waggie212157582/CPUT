package PLKTest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Compliance.ComplianceImpl.PLKSchoolImpl;
import Compliance.PLKSchoolInterface;
import Config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
public class PLKCorrection {
    
    static PLKSchoolImpl schImpl = new PLKSchoolImpl();
    PLKSchoolInterface inter;
    
    public PLKCorrection() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void PLKCorrectTest() 
    {
        Assert.assertEquals(schImpl.Name("Boniface"), "Boniface");
        Assert.assertEquals(schImpl.Surname("Kabaso"), "Kabaso");
        Assert.assertEquals(schImpl.Grade(12), 12);
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
