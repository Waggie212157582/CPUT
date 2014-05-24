/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.waggie212157582.cput.FactoryMethodPattern.FruitColour;
import com.waggie212157582.cput.FactoryMethodPattern.FruitFactory;
import junit.framework.Assert;
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
public class FruitFactoryTest {
    
    public FruitFactoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
   @Test
    public void getFruitFactoryColours() {
    
    FruitFactory fruit = new FruitFactory();
    
    FruitColour f1 = fruit.createFruit(FruitFactory.APPLE);
    
    FruitColour f2 = fruit.createFruit(FruitFactory.ORANGE);
    
    Assert.assertEquals(f1.printColour(), "Apple colour is green.");
    
    Assert.assertEquals(f2.printColour(), "Orange colour is orange.");
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
