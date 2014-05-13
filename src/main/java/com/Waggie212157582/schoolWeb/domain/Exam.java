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
public class Exam implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String exam_dates;
    private String subject;
    private double results;

    
    
    
    private Exam(Builder builder) {
        id= builder.id;
        exam_dates = builder.exam_dates;
        subject=builder.subject;
        results = builder.results;
        
    }
    
    private Exam()
    {
        
    }
    
    public static class Builder {
        
    private Long id;
    private String exam_dates;
    private String subject;
    private double results;
        
    public Builder(String subject)
    {
        this.subject = subject;
    }
    
    public Builder id(Long value) 
    {
            id = value;
            return this;
    }
    
    public Builder examdate(String value) 
    {
            exam_dates = value;
            return this;
    }
    
    
    
    public Builder result(double value) 
    {
            results = value;
            return this;
    }
    
    public Builder exam(Exam exam){
            id = exam.getId();
            exam_dates = exam.getExamDate();
            subject = exam.getSubject();
            results = exam.getResults();
            
            return this;
            
        }
    
    public Exam build(){
            return new Exam(this);
        }
    
    }
    
    public Long getId() {
        return id;
    }

    public String getExamDate() {
        return exam_dates;
    }

    public String getSubject() {
        return subject;
    }

    public double getResults() {
        return results;
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
        if (!(object instanceof Exam)) {
            return false;
        }
        Exam other = (Exam) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.waggie212157582.cput.schoolweb.domain.Exam[ id=" + id + " ]";
    }
    
}
