/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Classes.Books;
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
public class BooksTest {
    
    public BooksTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCreation() throws Exception {
       Books b = new Books.Builder("Computers").title("C++").isbn("789456-546558-9865").build();
       Assert.assertEquals(b.getBookname(),"Computers");
       Assert.assertEquals(b.getTitle(),"C++");
       Assert.assertEquals(b.getIsbn(),"789456-546558-9865");
    }
    
    @Test
    public void testUpdate() throws Exception {
       Books b = new Books.Builder("Computers").title("C++").isbn("789456-546558-9865").build();
       Books bks = new Books.Builder("Software").book(b).title("A+").isbn("898989-9898-96969").build();
       Assert.assertEquals(bks.getBookname(),"Computers");
       Assert.assertEquals(bks.getTitle(),"A+");
       Assert.assertEquals(bks.getIsbn(),"898989-9898-96969");
       

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
