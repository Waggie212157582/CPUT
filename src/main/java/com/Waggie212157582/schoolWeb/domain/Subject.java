/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Waggie212157582.schoolWeb.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author WAGGIE
 */
@Entity
public class Subject implements Serializable
{
   
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(unique = true)
    private String subName;

    
    
    @OneToOne
    @JoinColumn(name = "id")
    private ClassGrade grade;
    
    
    private Subject()
    {
        
    }
    
    private Subject( Builder builder)
    {
        id = builder.id;
        
        subName = builder.subName;
        grade = builder.grade;
        
                        
    }
    
    
    
    public static class Builder
    {
        private Long id;
        private String subName;
        private ClassGrade grade;
 
            public Builder(Long id)
            {
                this.id = id;
            }
            
            public Builder id(Long id)
            {
                this.id = id;
                return this;
            }
                    
            public Builder subName(String subName)
            {
                this.subName = subName;
                return this;
            }
            
            public Builder classGrade(ClassGrade grade)
            {
                this.grade = grade;
                return this;
            }
            
            public Builder subject(Subject subject){
            id = subject.getId();
            subName = subject.getSubName();
            grade = subject.getGrade();
            return this;
            
        }
            
            
            public Subject build()
            {
                return new Subject(this);
            }

 
    }

    public Long getId() {
        return id;
    }

    public String getSubName() {
        return subName;
    }

    public ClassGrade getGrade() {
        return grade;
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
        if (!(object instanceof Subject)) {
            return false;
        }
        Subject other = (Subject) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "com.Waggie212157582.cput.domain.Subject[ id=" + id + " ]";
    }
    
}
