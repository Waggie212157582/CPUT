/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Compliance.ComplianceImpl.OCPCorrectionClasses;

import Compliance.OCPSchoolInterface;

/**
 *
 * @author WAGGIE
 */
public class StaffmemberImpl implements OCPSchoolInterface{
    
    private String name;
    private String surname;
    private String idnum;
    private String telnum;
    
    public StaffmemberImpl(String name, String surname, String idnum,String telnum)
    {
        this.name = name;
        this.surname = surname;
        this.idnum = idnum;
        this.telnum = telnum;
    }

    public StaffmemberImpl() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
