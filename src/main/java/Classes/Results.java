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
public class Results
{
    private int marks;
    private String studID;
    private String firstname;
    private String lastname;
    private String grade;
    private String subject;
    private String teacher;
    
    private Results()
    {
        
    }

    
    private Results(Builder builder)
    {
        marks = builder.marks;
        studID = builder.studID;
        firstname = builder.firstname;
        lastname = builder.lastname;
        grade = builder.grade;
        subject = builder.subject;
        teacher = builder.teacher;
    }
    
    
    
    public String getStudID()
    {
        return studID;
    }
    
    public String getfirstname()
    {
        return firstname;
    }
    
    public String getlastname()
    {
        return lastname;
    }
    
    public int getMarks()
    {
        return marks;
    }

    public String getGrade()
    {
        return grade;
    }
    
    public String getSubject()
    {
        return subject;
    }
    
    public String getTeacher()
    {
        return teacher;
    }
    
    public static class Builder
    {
            private int marks;
            private String studID;
            private String firstname;
            private String lastname;
            private String grade;
            private String subject;
            private String teacher;
            
            
            public Builder(int marks)
            {
                this.marks = marks;
            }
            
            public Builder results(Results results)
            {
                studID= results.getStudID();
                marks = results.getMarks();
                return this;
            }
            
            
            public Builder marks(int marks)
            {
                this.marks = marks;
                return this;
            }
            
            public Builder studID(String value)
            {
                this.studID = value;
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
            
            public Builder subject(String sub)
            {
                this.subject = sub;
                return this;
            }
            
            public Builder teacher(String teach)
            {
                this.teacher = teach;
                return this;
            }
            
            public Builder res(Results res)
            {
                this.marks = res.getMarks();
                return this;
            }

            public Results build()
            {
                return new Results(this);
            }

 
    }

    
    
}
