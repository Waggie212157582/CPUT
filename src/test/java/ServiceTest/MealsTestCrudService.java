/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ServiceTest;

import Model.Meals;
import Service.Crud.MealsCrudServiceInter;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
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
public class MealsTestCrudService {
    
    public MealsTestCrudService() {
    }

    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Mock
    MealsCrudServiceInter crudService;

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(MealsCrudServiceInter.class);
    }
    
    @Test
    public void testCreate() throws Exception {
        Meals ass = new Meals.Builder("BreakFast").name("Meena").build();
        Meals returnMeals = crudService.persist(ass);
        when(crudService.persist(ass)).thenReturn(returnMeals);
        Mockito.verify(crudService).persist(ass);


    }
    @Test
    public void testRead() throws Exception {
        Meals ass = new Meals.Builder("BreakFast").name("Meena").build();
        Meals returnMeals = crudService.find(ass.getMealType());
        when(crudService.find(ass.getMealType())).thenReturn(returnMeals);
        Mockito.verify(crudService).find(ass.getMealType());

    }
    

    @Test
    public void testUpdate() throws Exception {

        Meals ass = new Meals.Builder("BreakFast").name("Meena").build();
        Meals ass2 = new Meals.Builder("lunch").ml(ass).name("Muneem").build();
        Meals returnMeals = crudService.merge(ass2);
        when(crudService.merge(ass2)).thenReturn(returnMeals);
        Mockito.verify(crudService).merge(ass2);

    }

    @Test
    public void testDelete() throws Exception {

        Meals ass = new Meals.Builder("BreakFast").name("Meena").build();
        Meals returnMeals = crudService.remove(ass);
        when(crudService.remove(ass)).thenReturn(returnMeals);
        Mockito.verify(crudService).remove(ass);

    }    

    

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
