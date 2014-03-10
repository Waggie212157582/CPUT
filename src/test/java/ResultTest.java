/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Classes.Results;
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
public class ResultTest {
    
    public ResultTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCreation() throws Exception {
      Results re = new Results.Builder(78).studID("212157582").firstname("Muneem").lastname("Waggie").grade("grade 12").subject("Maths").teacher("Mr K.Naidoo").build();
       
       Assert.assertEquals(re.getMarks(),78);
       Assert.assertEquals(re.getStudID(),"212157582");
       Assert.assertEquals(re.getfirstname(),"Muneem");
       Assert.assertEquals( re.getlastname(),"Waggie");
       Assert.assertEquals( re.getGrade(),"grade 12");
       Assert.assertEquals(re.getSubject(),"Maths");
       Assert.assertEquals(re.getTeacher(),"Mr K.Naidoo");
       
    }
    
    @Test
    public void testUpdate() throws Exception {
       Results re = new Results.Builder(78).studID("212157582").firstname("Muneem").lastname("Waggie").grade("grade 12").subject("Maths").teacher("Mr K.Naidoo").build();
       Results res = new Results.Builder(56).res(re).studID("212155897").firstname("Meena").lastname("Nathoo").grade("grade 8").subject("English").teacher("Mr K.Kabaso").build();
       
       Assert.assertEquals(res.getMarks(),78);
       Assert.assertEquals(res.getStudID(),"212155897");
       Assert.assertEquals(res.getfirstname(),"Meena");
       Assert.assertEquals( res.getlastname(),"Nathoo");
       Assert.assertEquals( res.getGrade(),"grade 8");
       Assert.assertEquals(res.getSubject(),"English");
       Assert.assertEquals(res.getTeacher(),"Mr K.Kabaso");
       
       
       
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
