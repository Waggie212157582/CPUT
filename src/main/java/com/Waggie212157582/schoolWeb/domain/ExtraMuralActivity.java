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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author WAGGIE
 */
@Entity
public class ExtraMuralActivity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    

    private String activity_name;
    
    @Column(unique = true)
    private String activity_code;
    
    
     private ExtraMuralActivity(Builder builder) {
        id= builder.id;
        activity_name = builder.activity_name;
        activity_code = builder.activity_code;
        
    }
    
    private ExtraMuralActivity()
    {
        
    }
    
    public static class Builder {
        
    private Long id;
    private String activity_name;
    private String activity_code;
    
        
    public Builder(String value)
    {
        this.activity_name = value;
    }
    
    public Builder id(Long value) 
    {
            id = value;
            return this;
    }
    
    public Builder activityCode(String value) 
    {
            activity_code = value;
            return this;
    }
   
    
    
    public Builder extraMuralActivity(ExtraMuralActivity extraMuralActivity){
            id = extraMuralActivity.getId();
            activity_name = extraMuralActivity.getActivity();
            activity_code = extraMuralActivity.getActivityCode();
            return this;
            
        }
    
    public ExtraMuralActivity build(){
            return new ExtraMuralActivity(this);
        }
    
    }
    
    
    public Long getId() {
        return id;
    }

    public String getActivity() {
        return activity_name;
    }

    public String getActivityCode() {
        return activity_code;
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
        if (!(object instanceof ExtraMuralActivity)) {
            return false;
        }
        ExtraMuralActivity other = (ExtraMuralActivity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.waggie212157582.cput.schoolweb.domain.ExtraMuralActivity[ id=" + id + " ]";
    }
    
}
