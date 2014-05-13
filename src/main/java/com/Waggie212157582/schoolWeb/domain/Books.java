/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Waggie212157582.schoolWeb.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Books implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(unique = true)
    private String isbn;
    
    private String bookname;
    private String years;
    
    
    
    private Books ( Builder builder)
    {
        id = builder.id;
        isbn = builder.isbn;
        bookname = builder.bookname;
        years = builder.years;
        
                   
    }
    
     private Books(){
    
    }
   
    
    public static class Builder
    {
            private Long id;
            private String isbn;
            private String bookname;
            private String years;
           
            
            
            public Builder(String isbn)
            {
                this.isbn = isbn;
            }
            
            public Builder id(Long value)
            {
                this.id = value;
                return this;
            }
            
            public Builder bookname(String value)
            {
                bookname = value;
                return this;
            }
            
            public Builder yearname(String value)
            {
                years = value;
                return this;
            }
            
           
            
           
            
            public Builder books(Books books)
            {
                id = books.getId();
                isbn = books.getIsbn();
                bookname = books.getBookName();
                years = books.getYear();
                
                
                return this;
            }
            
           
            public Books build()
            {
                return new Books(this);
            }

 
    }

    public Long getId() {
        return id;
    }

    public String getIsbn()
    {
        return isbn;
    }
    
    public String getBookName()
    {
        return bookname;
    }
    
    public String getYear()
    {
        return years;
    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Books)) {
            return false;
        }
        Books other = (Books) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kabaso.askweb.domain.Books[ id=" + id + " ]";
    }
    
}
