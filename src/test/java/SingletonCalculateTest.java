/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import com.waggie212157582.cput.Singleton.SingletonInstance;
import org.junit.Assert;
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
public class SingletonCalculateTest {
    
   
    
    public SingletonCalculateTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void getCalculateValue() {
    
        SingletonInstance singletoninstance = SingletonInstance.getSingletonInstance();
        
      
        
        singletoninstance.getMessage();
      
        
        Assert.assertEquals(singletoninstance.getMessage(), "I Love Creating A Singleton Instance");
    
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
