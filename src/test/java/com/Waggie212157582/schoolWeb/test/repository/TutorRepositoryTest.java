/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Waggie212157582.schoolWeb.test.repository;


import com.Waggie212157582.schoolWeb.app.conf.ConnectionConfig;
import com.Waggie212157582.schoolWeb.domain.Salary;
import com.Waggie212157582.schoolWeb.domain.Tutor;
import com.Waggie212157582schoolWeby.repository.TutorRepository;
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
public class TutorRepositoryTest {
    
    private static ApplicationContext ctx;
    private Long id;
    private TutorRepository repo;
    private static Salary sal;
    
    public TutorRepositoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
        public void createTutor(){
        repo = ctx.getBean(TutorRepository.class);
        
        Tutor tut = new Tutor.Builder("T2583697")
                .firstname("Naidoo")
                .lastname("Kruben")
                .age(40)
                .salary(sal)
                .build();
             
        
        repo.save(tut);
        id = tut.getId();
        
        Assert.assertNotNull(id);
        }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(ConnectionConfig.class);
        sal = new Salary.Builder(500)
                .income(5000.00)
                .current_amount(4500.00)
                .build();
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
