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
public class ExtraMuralActivity {
    
    private String name;
    private String activity;
 
    
    
    private ExtraMuralActivity()
    {
        
    }
    
    private ExtraMuralActivity( Builder builder)
    {
        name = builder.name;
        activity = builder.activity;
     
                        
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getActivity()
    {
        return activity;
    }
    
    
    public static class Builder
    {
             private String name;
             private String activity;
            
            public Builder(String name)
            {
                this.name = name;
            }
            
            public Builder mactive(ExtraMuralActivity mac)
            {
                this.name= mac.getName();
                this.activity = mac.getActivity();
                return this;
            }
            
            
            public Builder name(String name)
            {
                this.name = name;
                return this;
            }
            
            public Builder activity(String activity)
            {
                this.activity = activity;
                return this;
            }
            
            
            public ExtraMuralActivity build()
            {
                return new ExtraMuralActivity(this);
            }

 
    }
    
}
