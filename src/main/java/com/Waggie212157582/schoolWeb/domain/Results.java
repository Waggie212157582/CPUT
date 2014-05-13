/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Waggie212157582.schoolWeb.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author WAGGIE
 */
@Entity
public class Results implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    
    private double marks;
    
   /* @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="result_id")
    private List<ClassGrade>grade;*/
    
    /*@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="result_id")
    private List<Subject> subject;*/
    
    
   
    
    private Results(Builder builder)
    {
        
        
        marks = builder.marks;
       // grade = builder.grade;
       // subject = builder.subject;
        
    }
    
    private Results()
    {
        
    }
    
    
    public static class Builder
    {
        private Long id;
        private double marks;
      //  private List<ClassGrade>grade;
      //  private List<Subject> subject;
           
            
            
            public Builder(double marks)
            {
                this.marks = marks;
            }
            
            public Builder id(Long value)
            {
                this.id =  value;
                return this;
            }
            
            
           /* public Builder grade(List<ClassGrade>value)
            {
                this.grade = value;
                return this;
            }*/
            
      
            /*public Builder subject(List<Subject>value)
            {
                this.subject = value;
                return this;
            }*/
            
            
            
            public Builder results(Results results){
                
                id = results.getId();
                marks = results.getMarks();
              //  grade = results.getGrade();
               // subject = results.getSubject();
            
            return this;
            
        }
            
            public Results build()
            {
                return new Results(this);
            }

 
    }
    
   
    
    public Double getMarks()
    {
        return marks;
    }

   /* public List <ClassGrade> getGrade()
    {
        return grade;
    }
    
    public List<Subject> getSubject()
    {
        return subject;
    }*/

    public Long getId() {
        return id;
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
        if (!(object instanceof Results)) {
            return false;
        }
        Results other = (Results) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.waggie212157582.cput.schoolweb.domain.Results[ result_id=" + id + " ]";
    }
    
}
