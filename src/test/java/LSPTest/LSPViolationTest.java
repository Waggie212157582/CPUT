package LSPTest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Compliance.LSPViolationClasses.LSPPersonV;
import Compliance.LSPViolationClasses.LSPStaffV;
import Compliance.LSPViolationClasses.LSPStudentV;
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
public class LSPViolationTest {
    
    private final LSPStaffV staff = new LSPStaffV("Boniface","Kabaso","8702154869853","0781157896",2000.00);
    private final LSPStudentV stud = new LSPStudentV("Muneem","Waggie","9101295335084","0738899666");
    
    public static LSPPersonV pers;
    public LSPViolationTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
   @Test
    public void LSPTest() 
    {
        Assert.assertEquals("Staff Member:","Boniface"+"Kabaso"+"8702154869853"+"0781157896"+2000.00, staff.toString());
        
        Assert.assertEquals("Student:","Muneem"+"Waggie"+"9101295335084"+"0738899666" , stud.toString());
        
        
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        pers = (LSPPersonV)ctx.getBean("LSPViolate");
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
