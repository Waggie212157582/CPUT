/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Compliance.ComplianceImpl.OCPCorrectionClasses;

import Compliance.OCPSchoolInterface;
import java.util.*;

/**
 *
 * @author WAGGIE
 */
public class PersonCorrection {
    
    List<OCPSchoolInterface> ocp = new ArrayList <OCPSchoolInterface>();
    
    public void createPerson(OCPSchoolInterface ocps)
    {
        ocp.add(ocps);
    }
    
    public void displayPerson()
    {
        for(OCPSchoolInterface ocpschool : ocp)
        {
            ocpschool.toString();
        }
    }
    
}
