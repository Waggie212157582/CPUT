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
public class Registration
{
    
    private String studentID;
    private String firstname;
    private String lastname;
    private int age;
    private String grade;
    
    
    
    private Registration()
    {
        
    }
    
    private Registration( Builder builder)
    {
        studentID = builder.studentID;
        firstname = builder.firstname;
        lastname = builder.lastname;
        age = builder.age;
        grade = builder.grade;
       
                        
    }
    
    public String getStudentID()
    {
        return studentID;
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

    public String getGrade()
    {
        return grade;
    }
    
    
    
    
    public static class Builder
    {
            private String studentID;
            private String firstname;
            private String lastname;
            private int age;
            private String grade;
            
            
            
            public Builder(int age)
            {
                this.age = age;
            }
            
            public Builder registration(Registration registration)
            {
                age = registration.getAge();
                return this;
            }
            
            
            public Builder age(int age)
            {
                this.age = age;
                return this;
            }
            
            public Builder studentID(String value)
            {
                this.studentID = value;
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
           
            public Builder grade(String gr)
            {
                this.grade = gr;
                return this;
            }
            
            public Builder regs(Registration regs)
            {
                this.studentID = regs.getStudentID();
                return this;
            }
            
            

            public Registration build()
            {
                return new Registration(this);
            }

 
    }
    
    
    
}

