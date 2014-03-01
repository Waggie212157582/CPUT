/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Compliance.DIPViolation;

/**
 *
 * @author WAGGIE
 */
public class DIPStudentV {
    
    DIPRegister register;
   
    
    public void setRegister(DIPRegister reg)
    {
        register = reg;
    }
    
    public void studentRegister()
    {
        register.registration("Muneem", "Waggie", "9101295335084", "0712365899", "Grade 5");
    
    }
    
    
    
}
