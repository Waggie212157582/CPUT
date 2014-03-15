/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author WAGGIE
 */
public class StudentBalance {
    
    private double balance;
    private String studnum;
    private String firstname;
    private String lastname;
    private Student stud;
    
    
    private StudentBalance()
    {
       
    }
    private StudentBalance( Builder builder)
    {
        balance = builder.balance;
        firstname = builder.firstname;
        lastname = builder.lastname;
        studnum = builder.studnum;
        
                        
    }
    
    public String getStudNum()
    {
        return studnum;
    }
    
    public String getfirstname()
    {
        return firstname;
    }
    
    public String getlastname()
    {
        return lastname;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
   

    
    
    public static class Builder
    {
                private double balance;
                private String studnum;
                private String firstname;
                private String lastname;
                
                
            public Builder(double balance)
            {
                this.balance = balance;
            }
            
            public Builder bal(StudentBalance balance)
            {
                
                this.balance = balance.getBalance();
                return this;
            }
            
            
            public Builder balance(double bal)
            {
                this.balance = bal;
                return this;
            }
            
            public Builder studnum(String value)
            {
                this.studnum = value;
                return this;
            }
            
            
            public Builder firstname(String name)
            {
                this.firstname = name;
                return this;
            }
            
            public Builder lastname(String surname)
            {
                this.lastname = surname;
                return this;
            }
            
            
            
            public Builder balance(StudentBalance bal)
            {
                this.balance = bal.getBalance();
                return this;
            }
           
            public StudentBalance build()
            {
                return new StudentBalance(this);
            }

 
    }
    
}
