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
public class Subject
{
   

    
    private String studentSub;
    private Exam exams;
    
    
    private Subject()
    {
        
    }
    
    private Subject( Builder builder)
    {
        studentSub = builder.studentSub;
        exams = builder.exams;
                        
    }
    
    public String getStudentSub()
    {
        return studentSub;
    }
   
    public Object getExams()
    {
        return exams;
    }
    
    public static class Builder
    {
            private String studentSub;
            private Exam exams;
 
            public Builder(String studentSub)
            {
                this.studentSub = studentSub;
            }
            
            public Builder subject(Subject subject)
            {
                studentSub= subject.getStudentSub();
                return this;
            }
                    
            public Builder studentSub(String sub)
            {
                this.studentSub = sub;
                return this;
            }
            
            public Builder exams(Exam exms)
            {
                this.exams = exms;
                return this;
            }
            
            public Builder subs(Subject subs)
            {
                this.studentSub = subs.getStudentSub();
                return this;
            }
            
            public Subject build()
            {
                return new Subject(this);
            }

 
    }

    
    
}

