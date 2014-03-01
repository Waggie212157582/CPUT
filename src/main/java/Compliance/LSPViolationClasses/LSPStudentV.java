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
public class LSPStudentV extends LSPPersonV {
    
    private String name;
    private String surname;
    private String idnum;
    private String telnum;
    
    public LSPStudentV(String name, String surname, String idnum,String telnum)
    {
        this.name = name;
        this.surname = surname;
        this.idnum = idnum;
        this.telnum = telnum;
    }
    
    public void createStudent(String name, String surname, String idnum,String telnum)
    {
        this.name = name;
        this.surname = surname;
        this.idnum = idnum;
        this.telnum = telnum;
        
    }
    
    @Override
    public String toString()
    {
        return name +  surname +  idnum +  telnum;
    }
    
}
