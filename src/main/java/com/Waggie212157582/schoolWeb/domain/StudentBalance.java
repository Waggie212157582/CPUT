/*
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
public class StudentBalance implements Serializable{
    
    
    private double income;
    private double outgoingCost;
    private double balance;
    
    private StudentBalance(Builder builder)
    {
        income = builder.income;
        outgoingCost = builder.outgoingCost;
        balance = builder.balance;
    }
    
    private StudentBalance()
    {
    
    }
    
    public static class Builder
    {
        private double income;
        private double outgoingCost;
        private double balance;

        public Builder (double value) {
            this.income = value;
        }

        public Builder OutgoingCost(double value) {
            this.outgoingCost = value;
            return this;
        }

        public Builder Balance(double value) {
            this.balance = value;
            return this;
        
        }
        
        public Builder build(StudentBalance studBal)
        {
            income = studBal.getIncome();
            outgoingCost = studBal.getOutgoingCost();
            balance = studBal.getBalance();
            
            return this;
        }
        
        public StudentBalance build()
        {
            return new StudentBalance(this);
        }
        
        
    }
    
    

    public double getIncome() {
        return income;
    }

    public double getOutgoingCost() {
        return outgoingCost;
    }

    public double getBalance() {
        return balance;
    }

   

    

   

   
    
    
    
}
