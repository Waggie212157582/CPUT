/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

/**
 *
 * @author WAGGIE
 */
import java.util.*;
public class Student
{
    
    private String studentID;
    private String firstname;
    private String lastname;
    private int age;
    private ClassGrade grade;
    private Registration reg;
    private List<Books>books;
    private List<ExtraMuralActivity>ex;
    
    private Student()
    {
        
    }
    
    private Student( Builder builder)
    {
        studentID = builder.studentID;
        firstname = builder.firstname;
        lastname = builder.lastname;
        age = builder.age;
        grade = builder.grade;
        reg = builder.reg;
        
                        
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

    public Object getGrade()
    {
        return grade;
    }
    
    public Object getRegistration()
    {
        return reg;
    }
    
    
    
    public static class Builder
    {
            private String studentID;
            private String firstname;
            private String lastname;
            private int age;
            private ClassGrade grade;
            private Registration reg;
            
            public Builder(int age)
            {
                this.age = age;
            }
            
            public Builder student(Student student)
            {
                studentID= student.getStudentID();
                age = student.getAge();
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
           
            public Builder grade(ClassGrade gr)
            {
                this.grade = gr;
                return this;
            }
            
            public Builder reg(Registration rg)
            {
                this.reg = rg;
                return this;
            }

            public Student build()
            {
                return new Student(this);
            }

 
    }

}
