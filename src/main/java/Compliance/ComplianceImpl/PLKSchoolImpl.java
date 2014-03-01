/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Compliance.ComplianceImpl;

import Compliance.PLKSchoolInterface;

/**
 *
 * @author WAGGIE
 */
public class PLKSchoolImpl implements PLKSchoolInterface {

    public static PLKSchoolInterface sch;
    
    public String Name(String name) {
        return name;
    }

    public String Surname(String surname) {
        return surname;
        }

    public int Grade(int grade) {
        
        return grade;
    }
    
}
