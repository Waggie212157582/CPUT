/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Compliance.OCPViolationClasses;

/**
 *
 * @author WAGGIE
 */
import java.util.*;
public class Person {
    
    List<Object>persons = new ArrayList<Object>();
    
    public void createPerson(Object person)
    {
        persons.add(person);
    
    }
    
    public void displayPerson()
    {
        for(Object person: persons)
        {
            if(person instanceof Staffmember)
                ((Staffmember)person).toString();
            
            if(person instanceof Student)
                ((Student)person).toString();
        }
        
        
        
            
    }
    
}
