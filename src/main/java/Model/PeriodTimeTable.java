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
public class PeriodTimeTable {
    
    private String subject;
    private String time;
    private String day;
    private Student stud;
    
    
    private PeriodTimeTable()
    {
        
    }
    
    private PeriodTimeTable( Builder builder)
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
    
    public String getDay()
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
            
            public Builder periodtable(PeriodTimeTable periodtable)
            {
                this.subject= periodtable.getSubject();
                
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
            
            

            public PeriodTimeTable build()
            {
                return new PeriodTimeTable(this);
            }

 
    }
    
}
