/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Compliance.LSPViolationClasses;

/**
 *
 * @author WAGGIE
 */
public class LSPPersonV {
    
    private String name;
    private String surname;
    private String idnum;
    private String telnum;
    private double salary;
    
    @Override
    public String toString(){
        
        return name + surname + idnum + telnum + salary;
    }
    
    
}
