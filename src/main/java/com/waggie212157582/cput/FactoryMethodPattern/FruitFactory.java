/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.waggie212157582.cput.FactoryMethodPattern;

import com.waggie212157582.cput.FactoryMethodPattern.impl.Apple;
import com.waggie212157582.cput.FactoryMethodPattern.impl.Orange;
import javax.swing.*;
/**
 *
 * @author WAGGIE
 */
public class FruitFactory {
    
    public static final String APPLE = "apple";
    public static final String ORANGE = "orange";
    
    
    public FruitFactory()
    {
        
    }
    
    public FruitColour createFruit(String fruitName)
    {
        if(fruitName == null )
        {
            return null;
        }
        else if(fruitName.equalsIgnoreCase(APPLE))
        {
            return new Apple();
        }
        else if(fruitName.equalsIgnoreCase(ORANGE))
        {
            return new Orange();
        }
        
       
       throw new IllegalArgumentException();
    }
    
}
