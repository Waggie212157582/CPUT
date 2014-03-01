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
public class Staffmember extends Person{
    
    private String name;
    private String surname;
    private String idnum;
    private String telnum;
    
    public Staffmember(String name, String surname, String idnum,String telnum)
    {
        this.name = name;
        this.surname = surname;
        this.idnum = idnum;
        this.telnum = telnum;
    }
    
    public void createStaff(String name, String surname, String idnum,String telnum)
    {
        this.name = name;
        this.surname = surname;
        this.idnum = idnum;
        this.telnum = telnum;
        
    }
    
    @Override
    public String toString()
    {
        return name + surname + idnum + telnum;
    }
    
}
