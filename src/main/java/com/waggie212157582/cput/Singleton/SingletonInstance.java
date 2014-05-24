/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.waggie212157582.cput.Singleton;

/**
 *
 * @author WAGGIE
 */
public class SingletonInstance {
    
    private static SingletonInstance singletoninstance; 
    
    private SingletonInstance()
    {
        
    }
    
    public synchronized static SingletonInstance getSingletonInstance()
    {
        if(singletoninstance == null)
        {
            singletoninstance = new SingletonInstance();
        }
        return singletoninstance;
    }
    
    public String getMessage()
    {
        return "I Love Creating A Singleton Instance";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
       throw new CloneNotSupportedException();
    }
    
    
    
    
    
}
