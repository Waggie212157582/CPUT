/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ServiceTest;

import Model.Books;
import Service.Crud.BooksCrudServiceInter;
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
public class BooksTestCrudService {
    @Mock
    BooksCrudServiceInter crudService;
    
    
            
    public BooksTestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(BooksCrudServiceInter.class);
    }
    
    @Test
    public void testCreate() throws Exception {
        Books b = new Books.Builder("Computers").title("C++").isbn("789456-546558-9865").build();
        Books returnBooks = crudService.persist(b);
        when(crudService.persist(b)).thenReturn(returnBooks);
        Mockito.verify(crudService).persist(b);


    }
    @Test
    public void testRead() throws Exception {
        Books b = new Books.Builder("Computers").title("C++").isbn("789456-546558-9865").build();
        Books returnBooks = crudService.find(b.getBookname());
        when(crudService.find(b.getBookname())).thenReturn(returnBooks);
        Mockito.verify(crudService).find(b.getBookname());

    }
    

    @Test
    public void testUpdate() throws Exception {

        Books b = new Books.Builder("Computers").title("C++").isbn("789456-546558-9865").build();
        Books bks = new Books.Builder("Software").book(b).title("A+").isbn("898989-9898-96969").build();
        Books returnBooks = crudService.merge(bks);
        when(crudService.merge(bks)).thenReturn(returnBooks);
        Mockito.verify(crudService).merge(bks);

    }

    @Test
    public void testDelete() throws Exception {

        Books b = new Books.Builder("Computers").title("C++").isbn("789456-546558-9865").build();
        Books returnBooks = crudService.remove(b);
        when(crudService.remove(b)).thenReturn(returnBooks);
        Mockito.verify(crudService).remove(b);

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
