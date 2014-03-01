/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Compliance.DIPCorrection;

import Compliance.DIPRegisterInterface;

/**
 *
 * @author WAGGIE
 */
public class DIPStudentCImpl implements DIPRegisterInterface {
    
    private String name;
    private String surname;
    private String idnum;
    private String telnum;
    private String grade;
    
    public DIPStudentCImpl(String name, String surname, String idnum,String telnum,String grade)
    {
        this.name = name;
        this.surname = surname;
        this.idnum = idnum;
        this.telnum = telnum;
        this.grade = grade;
     }
    
    public void registration(String name, String surname, String idnum,String telnum,String grade)
    {
        this.name = name;
        this.surname = surname;
        this.idnum = idnum;
        this.telnum = telnum;
        this.grade = grade;
     }
    
    @Override
    public String toString()
    {
        return name +surname+ idnum+ telnum+ grade;
    }
    
}
