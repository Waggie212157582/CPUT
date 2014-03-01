package LSPTest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Compliance.LSPCorrectionClasses.LSPPersonC;
import Compliance.LSPCorrectionClasses.LSPStaffC;
import Compliance.LSPCorrectionClasses.LSPStudentC;
import Config.AppConfig;
import junit.framework.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
public class LSPCorrectionTest {
    
    private final LSPStaffC staff = new LSPStaffC("Boniface","Kabaso","8702154869853","0781157896");
    private final LSPStudentC stud = new LSPStudentC("Muneem","Waggie","9101295335084","0738899666");
    
    public static LSPPersonC pers;
    
    public LSPCorrectionTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void LSPCorrectionTest() 
    {
        Assert.assertEquals("Staff Member:","Boniface"+"Kabaso"+"8702154869853"+"0781157896", staff.toString());
        
        Assert.assertEquals("Student:","Muneem"+"Waggie"+"9101295335084"+"0738899666" , stud.toString());
        
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        pers = (LSPPersonC)ctx.getBean("LSPCorrect");
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
