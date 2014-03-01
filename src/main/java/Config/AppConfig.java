/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Config;


import Compliance.ComplianceImpl.OCPCorrectionClasses.StaffmemberImpl;
import Compliance.ComplianceImpl.PLKSchoolImpl;
import Compliance.DIPCorrection.DIPStudentCImpl;
import Compliance.DIPRegisterInterface;
import Compliance.LSPCorrectionClasses.LSPPersonC;
import Compliance.LSPCorrectionClasses.LSPStaffC;
import Compliance.LSPCorrectionClasses.LSPStudentC;
import Compliance.LSPViolationClasses.LSPPersonV;
import Compliance.LSPViolationClasses.LSPStaffV;
import Compliance.LSPViolationClasses.LSPStudentV;
import Compliance.OCPSchoolInterface;
import Compliance.OCPViolationClasses.Person;
import Compliance.OCPViolationClasses.Staffmember;
import Compliance.OCPViolationClasses.Student;
import Compliance.PLKSchoolInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author WAGGIE
 */
@Configuration
public class AppConfig {
    
   
    
    @Bean(name ="OCPschool")
    public Person getOCPStaff(){
    
        
        return new Staffmember("Boniface","Kabaso","8702154869853","0781157896");
    }
    public Person getOCPStudent(){
    
        
        return new Student("Muneem","Waggie","9101295335084","0738899666");
    }
    
    @Bean(name="OCPCorrectschool")
    public OCPSchoolInterface getOCPStaffCorrect()
    {
                return (OCPSchoolInterface) new StaffmemberImpl("Boniface","Kabaso","8702154869853","0781157896");
    }
    public OCPSchoolInterface getOCPStudentCorrect()
    {
                return (OCPSchoolInterface) new Student("Muneem","Waggie","9101295335084","0738899666");
    }
    
    
    @Bean(name="LSPViolate")
    public LSPPersonV getLSPStaffViolation()
    {
                return new LSPStaffV("Boniface","Kabaso","8702154869853","0781157896",2000.00);
    }
    
    public LSPPersonV getLSPStudentViolation()
    {
                return new LSPStudentV("Muneem","Waggie","9101295335084","0738899666");
    }
    
    @Bean(name="LSPCorrect")
    public LSPPersonC getLSPStaffCorrection()
    {
                return new LSPStaffC("Boniface","Kabaso","8702154869853","0781157896");
    }
    public LSPStudentC getLSPStudentCorrection()
    {
                return new LSPStudentC("Muneem","Waggie","9101295335084","0738899666");
    }
    
    @Bean(name="DIPCorrection")
    public DIPRegisterInterface getDipRegCorrect()
    {
                return (DIPRegisterInterface) new DIPStudentCImpl("Muneem","Waggie","9101295335084","0738899666","Grade 12");
    }
    
    @Bean(name="PLKSchool")
    public PLKSchoolInterface getSchool()
    {
                return (PLKSchoolInterface) new PLKSchoolImpl();
    }
    
  
          
    
}
