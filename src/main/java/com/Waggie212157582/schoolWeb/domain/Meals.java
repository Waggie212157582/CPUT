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
public class Meals implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(unique = true)
    private String meal_name;
    
    private double meal_cost;
   
    private Meals(){
    
    }
    
    private Meals ( Builder builder)
    {
        id = builder.id;
        meal_name = builder.meal_name;
        meal_cost = builder.meal_cost;
        
                   
    }

    
    
    public static class Builder
    {
            private Long id;
            private String meal_name;
            private double meal_cost;
           
           
            
            
            public Builder(String value)
            {
                this.meal_name = value;
            }
            
            public Builder id(Long value)
            {
                this.id = value;
                return this;
            }
            
            public Builder mealcost(double value)
            {
                meal_cost = value;
                return this;
            }
            
            
           
            
           
            
            public Builder meal(Meals meal)
            {
                id = meal.getId();
                meal_name = meal.getMeal_name();
                meal_cost = meal.getMeal_cost();
                
                
                return this;
            }
            
           
            public Meals build()
            {
                return new Meals(this);
            }

 
    }

    public Long getId() {
        return id;
    }

    public String getMeal_name() {
        return meal_name;
    }

    public double getMeal_cost() {
        return meal_cost;
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
        if (!(object instanceof Meals)) {
            return false;
        }
        Meals other = (Meals) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.waggie212157582.cput.schoolweb.domain.Meals[ id=" + id + " ]";
    }
    
}
