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
public class LSPStaffV extends LSPPersonV{
    
    private String name;
    private String surname;
    private String idnum;
    private String telnum;
    private double salary;
    
    public LSPStaffV(String name, String surname, String idnum,String telnum,double salary)
    {
        this.name = name;
        this.surname = surname;
        this.idnum = idnum;
        this.telnum = telnum;
        this.salary = salary;
    }
    
    public void createStaff(String name, String surname, String idnum,String telnum,double salary)
    {
        this.name = name;
        this.surname = surname;
        this.idnum = idnum;
        this.telnum = telnum;
        
    }
    
    @Override
    public String toString()
    {
        return name + surname + idnum + telnum + salary;
    }
    
}
