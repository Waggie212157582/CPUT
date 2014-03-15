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
public class Salary
{
    private double sal;
    private String staffnum;
    private String firstname;
    private String lastname;
    private Teacher teacher;
    
    
    private Salary()
    {
       
    }
    private Salary( Builder builder)
    {
        sal = builder.sal;
        firstname = builder.firstname;
        lastname = builder.lastname;
        staffnum = builder.staffnum;
        teacher = builder.teacher;
                        
    }
    
    public String getStaffnum()
    {
        return staffnum;
    }
    
    public String getfirstname()
    {
        return firstname;
    }
    
    public String getlastname()
    {
        return lastname;
    }
    
    public double getSalary()
    {
        return sal;
    }
    
    public Object getTeacher()
    {
        return teacher;
    }

    
    
    public static class Builder
    {
                private double sal;
                private String staffnum;
                private String firstname;
                private String lastname;
                private Teacher teacher;
                
            public Builder(double sal)
            {
                this.sal = sal;
            }
            
            public Builder salary(Salary salary)
            {
                
                sal = salary.getSalary();
                return this;
            }
            
            
            public Builder sal(double sal)
            {
                this.sal = sal;
                return this;
            }
            
            public Builder staffnum(String value)
            {
                this.staffnum = value;
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
            
            public Builder teacher(Teacher teach)
            {
                this.teacher = teach;
                return this;
            }
            
            public Builder sals(Salary sals)
            {
                this.sal = sals.getSalary();
                return this;
            }
           
            public Salary build()
            {
                return new Salary(this);
            }

 
    }
    

}
