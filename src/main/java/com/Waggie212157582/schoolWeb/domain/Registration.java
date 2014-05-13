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
import javax.persistence.Embeddable;




/**
 *
 * @author WAGGIE
 */
@Embeddable
public class Registration implements Serializable {
   
    
    
    private String dates;
    private String prev_school;

   
    
     private Registration ( Builder builder)
     {
        dates = builder.dates;
        prev_school = builder.prev_school;
                 
     } 
     
     private Registration()
     {
        
     }
     
     public static class Builder
    {
            private String dates;
            private String prev_school;
            
            
            
            public Builder(String value)
            {
                this.dates = value;
            }
            
            
            
            public Builder prev_school(String value)
            {
                prev_school = value;
                return this;
            }
            
           
            public Builder registration(Registration registration)
            {
                dates = registration.dates;
                prev_school = registration.prev_school;
                
                return this;
            }
            
           
            public Registration build()
            {
                return new Registration(this);
            }

 
    }
    
    
     public String getDates() {
        return dates;
    }

    public String getPrev_school() {
        return prev_school;
    }

    

   
}
