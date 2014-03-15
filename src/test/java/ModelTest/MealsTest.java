package ModelTest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Model.Meals;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Muneem
 */
public class MealsTest {
    
    public MealsTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void TestMeals() 
    {
        Meals ass = new Meals.Builder("BreakFast").name("Muneem").build();
        //act,exp
        Assert.assertEquals(ass.getName(),"Muneem");
        Assert.assertEquals(ass.getMealType(),"BreakFast");
        
    }
    @Test
    public static void TextMealsUpdate() throws Exception 
    {
        Meals ass = new Meals.Builder("BreakFast").name("Meena").build();
        
        Meals ass2 = new Meals.Builder("lunch").ml(ass).name("Muneem").build();
        //act,exp
        Assert.assertEquals(ass2.getName(),"Muneem");
        Assert.assertEquals(ass2.getMealType(),"BreakFast");
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