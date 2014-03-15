/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;
//hgfrfhgf
/**
 *
 * @author WAGGIE
 */
public class Books {
    
    private String bookname;
    private String title;
    private String isbn;
    
    
    private Books()
    {
        
    }
    
    private Books( Builder builder)
    {
        bookname = builder.bookname;
        title = builder.title;
        isbn = builder.isbn;
        
        
                        
    }
    
    public String getBookname()
    {
        return bookname;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getIsbn()
    {
        return isbn;
    }
    
    
    
    
    
    public static class Builder
    {
            private String bookname;
            private String title;
            private String isbn;
            
            public Builder(String bookname)
            {
                this.bookname = bookname;
            }
            
            public Builder book(Books book)
            {
                this.bookname= book.getBookname();
                
                return this;
            }
            
            
            public Builder book(String bookname)
            {
                this.bookname = bookname;
                return this;
            }
            
            public Builder title(String title)
            {
                this.title = title;
                return this;
            }
            
            
            public Builder isbn(String isbn)
            {
                this.isbn = isbn;
                return this;
            }
            
            

            public Books build()
            {
                return new Books(this);
            }

 
    }
    
}
