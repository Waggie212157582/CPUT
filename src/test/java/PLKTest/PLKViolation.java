package PLKTest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Compliance.ComplianceImpl.PLKSchoolImpl;
import Compliance.PLKSchoolInterface;
import Config.AppConfig;
import static PLKTest.PLKCorrection.schImpl;
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
public class PLKViolation {
    
    static PLKSchoolImpl schImpl = new PLKSchoolImpl();
    
    
    public PLKViolation() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void PLKViolatioTest() 
    {
        Assert.assertEquals(schImpl.sch.Name("Boniface"), "Boniface");
        Assert.assertEquals(schImpl.sch.Surname("Kabaso"), "Kabaso");
        Assert.assertEquals(schImpl.sch.Grade(12), 12);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
         schImpl.sch= (PLKSchoolInterface)ctx.getBean("PLKSchool");
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
