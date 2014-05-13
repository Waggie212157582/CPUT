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
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author WAGGIE
 */
@Entity
public class PeriodTimeTable implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String periodId;
    
    private String dates;
    private String times;
    
    
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "period_id")
    private List<Subject>subject;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "period_id")
    private List<Teacher>teacher;
    
   

    private PeriodTimeTable(Builder builder) {
        
        id= builder.id;
        periodId = builder.periodId;
        dates = builder.dates;
        times = builder.times;
        subject=builder.subject;
        teacher = builder.teacher;
        
        
    }
    
    private PeriodTimeTable()
    {
        
    }
    
    public static class Builder {
        
    private Long id;
    private String periodId;
    private String dates;
    private String times;
    private List<Subject>subject;
    private List<Teacher>teacher;

        
    
    
        
    public Builder(String value)
    {
        this.periodId = value;
        
    }
    
    public Builder dates(String value)
    {
        this.dates = value;
        return this;
    }
    
    public Builder id(Long value) 
    {
            this.id = value;
            return this;
    }
    
    
    public Builder time(String value) 
    {
            this.times = value;
            return this;
    }
    
    public Builder subject(List<Subject> value)
    {
                this.subject = value;
                return this;
    }
    
    public Builder exam(List<Teacher> value)
    {
                this.teacher = value;
                return this;
    }
    
    
    
    
    public Builder periodTimeTable(PeriodTimeTable periodTimeTable){
            id = periodTimeTable.getId();
            periodId = periodTimeTable.getPeriodId();
            dates = periodTimeTable.getDates();
            times = periodTimeTable.getTimes();
            subject = periodTimeTable.getSubject();
            teacher = periodTimeTable.getTeacher();
            
            
            return this;
            
        }
    
    public PeriodTimeTable build(){
            return new PeriodTimeTable(this);
        }
    
    }
    
    
    public Long getId() {
        return id;
    }
    
    public String getPeriodId() {
        return periodId;
    }

    public String getDates() {
        return dates;
    }
    
    public String getTimes() {
            return times;
        }

    public List<Subject> getSubject() {
            return subject;
        }

        public List<Teacher> getTeacher() {
            return teacher;
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
        if (!(object instanceof PeriodTimeTable)) {
            return false;
        }
        PeriodTimeTable other = (PeriodTimeTable) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.waggie212157582.cput.schoolweb.domain.PeriodTimeTable[ teacherId=" + id + " ]";
    }
    
}
