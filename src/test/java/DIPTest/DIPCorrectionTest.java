package DIPTest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Compliance.DIPCorrection.DIPStudentCImpl;
import Compliance.DIPRegisterInterface;
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
public class DIPCorrectionTest {
    
    private final DIPStudentCImpl register = new DIPStudentCImpl("Muneem","Waggie","9101295335084","0738899666","Grade 5");
    public static DIPRegisterInterface reg;
    public DIPCorrectionTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void DIPCorrectionTest() 
    {
      Assert.assertEquals("Muneem"+"Waggie"+"9101295335084"+"0738899666"+"Grade 5", register.toString());
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        reg = (DIPRegisterInterface)ctx.getBean("DIPCorrection");
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
