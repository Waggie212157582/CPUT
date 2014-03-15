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
public class StudentLevel {
    
    private String level;
    private Student student;
    
    private StudentLevel()
    {
        
    }
    
    private StudentLevel( Builder builder)
    {
        this.level = builder.level;
       
                        
    }
   
    
    public String getLevel()
    {
        return level;
    }
    
    
   
    public static class Builder
    {
            private String level;
           
            
 
            public Builder(String level)
            {
                this.level = level;
            }
            
            
                    
            public Builder level(String lv)
            {
                this.level = lv;
                return this;
            }
            
            
            
            public Builder lev(StudentLevel level)
            {
                
                this.level = level.getLevel();
                return this;
            }
            
            public StudentLevel build()
            {
                return new StudentLevel(this);
            }
            
           

 
    }
    
}
