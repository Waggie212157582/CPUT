package OCPTest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Compliance.ComplianceImpl.OCPCorrectionClasses.PersonCorrection;
import Compliance.ComplianceImpl.OCPCorrectionClasses.StaffmemberImpl;
import Compliance.ComplianceImpl.OCPCorrectionClasses.StudentImpl;
import Compliance.OCPSchoolInterface;
import Compliance.OCPViolationClasses.Person;
import Config.AppConfig;
import junit.framework.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author WAGGIE
 */
public class OCPCorrectionTest {
    
    public static OCPSchoolInterface ocpInt;
    final StaffmemberImpl staff = new StaffmemberImpl("Boniface","Kabaso","8702154869853","0781157896");
    private final StudentImpl stud = new StudentImpl("Muneem","Waggie","9101295335084","0738899666");
    public static Person pers;
    
    public OCPCorrectionTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void ocpShoolTest() 
     {
        Assert.assertEquals("Staff Member:","Boniface"+"Kabaso"+"8702154869853"+"0781157896", staff.toString());
        
        Assert.assertEquals("Student:","Muneem"+"Waggie"+"9101295335084"+"0738899666" , stud.toString());
        
        Assert.assertEquals(pers, pers);
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        
        
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        ocpInt = (OCPSchoolInterface)ctx.getBean("OCPCorrectschool");
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
