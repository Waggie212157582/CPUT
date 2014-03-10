/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;


import java.util.*;
public class ClassGrade
{
    
    private String grade;
    private Teacher teach;
    
    
    private ClassGrade()
    {
        
    }
    
    private ClassGrade( Builder builder)
    {
        grade = builder.grade;
        teach = builder.teach;
                        
    }
   
    
    public String getGrade()
    {
        return grade;
    }
    
    public Object getTeacher()
    {
        return teach;
    }
   
    public static class Builder
    {
            private String grade;
            private Teacher teach;
            
 
            public Builder(String grade)
            {
                this.grade = grade;
            }
            
            
                    
            public Builder grade(String gr)
            {
                this.grade = gr;
                return this;
            }
            
            public Builder teach(Teacher teach)
            {
                
                this.teach = teach;
                return this;
            }
            
            public Builder cGrade(ClassGrade cGrade)
            {
                
                this.grade = cGrade.getGrade();
                return this;
            }
            
            public ClassGrade build()
            {
                return new ClassGrade(this);
            }
            
           

 
    }
}

