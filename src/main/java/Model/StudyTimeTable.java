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
public class StudyTimeTable {
    
    private String subject;
    private String time;
    private String day;
    private Student stud;
    
    
    private StudyTimeTable()
    {
        
    }
    
    private StudyTimeTable( Builder builder)
    {
        subject = builder.subject;
        time = builder.time;
        day = builder.day;
        
        
                        
    }
    
    public String getSubject()
    {
        return subject;
    }
    
    public String getTime()
    {
        return time;
    }
    
    public String getday()
    {
        return day;
    }
    
    
    
    
    
    public static class Builder
    {
            private String subject;
            private String time;
            private String day;
            
            public Builder(String subject)
            {
                this.subject = subject;
            }
            
            public Builder studytable(StudyTimeTable studytable)
            {
                this.subject= studytable.getSubject();
                
                return this;
            }
            
            
            public Builder subject(String subject)
            {
                this.subject = subject;
                return this;
            }
            
            public Builder time(String time)
            {
                this.time = time;
                return this;
            }
            
            
            public Builder day(String day)
            {
                this.day = day;
                return this;
            }
            
            

            public StudyTimeTable build()
            {
                return new StudyTimeTable(this);
            }
    }
}
