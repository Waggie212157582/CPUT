/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Waggie212157582.schoolWeb.test.repository;


import com.Waggie212157582.schoolWeb.app.conf.ConnectionConfig;
import com.Waggie212157582.schoolWeb.domain.Salary;
import com.Waggie212157582.schoolWeb.domain.Teacher;
import com.Waggie212157582schoolWeby.repository.TeacherRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author WAGGIE
 */
public class TeacherRepositoryTest {
    
    private static ApplicationContext ctx;
    private Long id;
    private TeacherRepository repo;
    private static Salary salary;
    
    
    
    public TeacherRepositoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
        public void createTeacher(){
        repo = ctx.getBean(TeacherRepository.class);
        
        Teacher t = new Teacher.Builder("212157582")
                .firstname("Boniface")
                .lastname("Kabaso")
                .age(40)
                .salary(salary)
                .build();
             
        
        repo.save(t);
        id = t.getId();
        
        Assert.assertNotNull(id);
        }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(ConnectionConfig.class);
        salary = new Salary.Builder(1000.00)
                .income(8000.00)
                .current_amount(7000.00)
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
