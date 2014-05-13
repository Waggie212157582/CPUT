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
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author WAGGIE
 */
@Embeddable
public class Salary implements Serializable {
   
    
    private double outgoingCost;
    private double income;
    private double current_amount;


    
     private Salary(Builder builder) {
        
        outgoingCost =builder.outgoingCost;
        income = builder.income;
        current_amount = builder.current_amount;
        
    }
    
    private Salary()
    {
        
    }
    
    public static class Builder {
        
    private double outgoingCost;
    private double income;
    private double current_amount;
        
    public Builder(double value)
    {
        this.outgoingCost = value;
    }
    
  
    
    public Builder income(double value) 
    {
            income = value;
            return this;
    }
    
    
    
    public Builder current_amount(double value) 
    {
            current_amount = value;
            return this;
    }
    
    
    
    
    public Builder salary(Salary salary){
           
            outgoingCost = salary.getOutgoingCost();
            income = salary.getIncome();
            current_amount = salary.getCurrentAmount();
            
            
            return this;
            
        }
    
    public Salary build(){
            return new Salary(this);
        }
    
    }
    
    
   public double getOutgoingCost() {
        return outgoingCost;
    }

    public double getIncome() {
        return income;
    }

    public double getCurrentAmount() {
        return current_amount;
    }

 
    
}
