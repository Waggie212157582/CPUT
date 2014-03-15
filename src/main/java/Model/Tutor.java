/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.util.List;

/**
 *
 * @author WAGGIE
 */
public class Tutor {
    
    private Tutor()
    {
       
    }

    private String staffnum;
    private String firstname;
    private String lastname;
    private int age;
    private List<Subject>subjects;
    
    
    private Tutor( Builder builder)
    {
        staffnum = builder.staffnum;
        firstname = builder.firstname;
        lastname = builder.lastname;
        age = builder.age;
        subjects = builder.subjects;
                        
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
    
    public int getAge()
    {
        return age;
    }

    public List<Subject>getSubjects()
    {
        return subjects;
    }
    
    public static class Builder
    {
            private String staffnum;
            private String firstname;
            private String lastname;
            private int age;
            private List<Subject>subjects;
            
            
            public Builder(int age)
            {
                this.age = age;
            }
            
            public Builder teacher(Tutor tutor)
            {
                staffnum = tutor.getStaffnum();
                age = tutor.getAge();
                return this;
            }
            
            
            public Builder age(int age)
            {
                this.age = age;
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
            
            public Builder tut(Tutor tut)
            {
                this.staffnum = tut.getStaffnum();
                return this;
            }
            
             public Builder subjects(List<Subject>subs)
            {
                this.subjects = subs;
                return this;
            }
           
            

            public Tutor build()
            {
                return new Tutor(this);
            }
        }
    
}
