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
public class Exam
{
    private String location;
    private String time;
    private Results result;
    
    
    private Exam()
    {
        
    }
    
    private Exam( Builder builder)
    {
        location = builder.location;
        time = builder.time;
        result = builder.result;
                        
    }
    
    public String getLocation()
    {
        return location;
    }
    
    public String getTime()
    {
        return time;
    }
    
    public Object getResults()
    {
        return result;
    }
    public static class Builder
    {
            private String location;
            private String time;
            private Results result;
 
            public Builder(String location)
            {
                this.location = location;
            }
            
            
                    
            public Builder location(String locate)
            {
                this.location = locate;
                return this;
            }
            
            public Builder time(String tm)
            {
                this.time = tm;
                return this;
            }
            
            public Builder result(Results results)
            {
                this.result = results;
                return this;
            }
            
            public Builder ex(Exam ex)
            {
                this.time = ex.getTime();
                return this;
            }
            
            public Exam build()
            {
                return new Exam(this);
            }
            
           

 
    }
    
}
