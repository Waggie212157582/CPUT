/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.waggie212157582.cput.AbstractFactoryPattern.Impl;

import com.waggie212157582.cput.AbstractFactoryPattern.Animal;

/**
 *
 * @author WAGGIE
 */
public class Cat implements Animal{

    @Override
    public String sound() {
       
        return "Meow";
    }
    
}
