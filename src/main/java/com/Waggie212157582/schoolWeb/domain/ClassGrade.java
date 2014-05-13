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
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author WAGGIE
 */
@Entity
public class ClassGrade implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String grade;
    private int grade_years;
    
    private ClassGrade()
    {
        
    }
    
     private ClassGrade ( Builder builder)
    {
        id = builder.id;
        grade = builder.grade;
        grade_years = builder.grade_years;
        
               
    }
     
     public static class Builder
    {
            private Long id;
            private String grade;
            private int grade_years;
            
            
            
            public Builder(String grade)
            {
                this.grade = grade;
            }
            
            public Builder id(Long value)
            {
                this.id = value;
                return this;
            }
            
            public Builder years(int value)
            {
                grade_years = value;
                return this;
            }
            
            
            public Builder classGrdae(ClassGrade classgrade)
            {
                id = classgrade.getId();
                grade = classgrade.getGrade();
                grade_years = classgrade.getYears();
                
                return this;
            }
            
           
            public ClassGrade build()
            {
                return new ClassGrade(this);
            }

 
    }

    public Long getId() {
        return id;
    }

    public String getGrade()
    {
        return grade;
    }
    
    public int getYears()
    {
        return grade_years;
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
        if (!(object instanceof ClassGrade)) {
            return false;
        }
        ClassGrade other = (ClassGrade) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.waggie212157582.cput.schoolweb.domain.ClassGrade[ id=" + id + " ]";
    }
    
}
