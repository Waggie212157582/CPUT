/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Waggie212157582.schoolWeb.test.repository;



import com.Waggie212157582.schoolWeb.app.conf.ConnectionConfig;
import com.Waggie212157582.schoolWeb.domain.Registration;
import com.Waggie212157582.schoolWeb.domain.Student;
import com.Waggie212157582.schoolWeb.domain.StudentBalance;
import com.Waggie212157582.schoolWeb.repository.StudentRepository;
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
public class StudentRepositoryTest {
    
    private static ApplicationContext ctx;
    private Long id;
    private StudentRepository repo;
    private static Registration registration;
    private static StudentBalance balance; 
    
    public StudentRepositoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
        public void createStudent(){
        repo = ctx.getBean(StudentRepository.class);
        
        Student s = new Student.Builder("212157582")
                .firstname("Muneem")
                .lastname("Waggie")
                .age(14)
                .registration(registration)
                .studentBalance(balance)
                .build();
        
        repo.save(s);
        id = s.getId();
        
        Assert.assertNotNull(id);
        }
        
         @Test
        (dependsOnMethods = "createStudent")
         public void readStudent(){
         repo = ctx.getBean(StudentRepository.class);
         Student stud = repo.findOne(id);
         Assert.assertEquals(stud.getfirstname(), "Muneem");
         }
        
    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(ConnectionConfig.class);
        registration = new Registration.Builder("25 January 2009")
                .prev_school("High School Montagu")
                .build();
        
        balance = new StudentBalance.Builder(2000.00)
                .OutgoingCost(1000.00)
                .Balance(1000.00)
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
