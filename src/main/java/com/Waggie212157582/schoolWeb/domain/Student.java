/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Waggie212157582.schoolWeb.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


/**
 *
 * @author WAGGIE
 */
@Entity
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(unique = true)
    private String studentID;
    
    private String firstname;
    private String lastname;
    private int age;
    
    
    
    @Embedded
    private Registration reg;
    
    @Embedded
    private StudentBalance bal;
    
    
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="student_id")
    private ClassGrade grade;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="student_id")
    List<Meals> meals;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    private List<Books>books;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    private List<Exam> exam;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_ID")
    private List <ExtraMuralActivity> ema;
    
    /*@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_ID")
    private List <Results> result;*/
    
    /*@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="student_id")
    private PeriodTimeTable timetable;*/
    

    private Student() {
    }
    
    
   /* @Embedded
    private Registration reg;
    
    @Embedded
    private Exam exam;
    @Embedded
    private PeriodTimeTable timetable;
    @Embedded
    private StudentBalance balance;
    @Embedded
    private StudyTimeTable studTimeTable;
    
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_ID")
    private List<StudentLevel> level;
    
  
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_ID")
    private List<Subject> subject;*/
    
    private Student( Builder builder)
    {
        id=builder.id;
        studentID = builder.studentID;
        firstname = builder.firstname;
        lastname = builder.lastname;
        age = builder.age;
        reg = builder.reg;
        meals = builder.meals;
        books = builder.books;
        grade = builder.grade;
        exam = builder.exam;
        ema = builder.ema;
        bal= builder.bal;
        
      //  result = builder.result;
       // timetable = builder.timetable;
        
        
       /* reg = builder.reg;
        
        
        
        balance = builder.balance;
        studTimeTable = builder.studTimeTable;
        ema = builder.ema;
        meals = builder.meals;
        
        
        level = builder.level;
        subject = builder.subject;*/
                   
    }
    
    /*private Student()
    {
        
    }*/
    
    public static class Builder
    {
            private Long id;
            private String studentID;
            private String firstname;
            private String lastname;
            private int age;
            private Registration reg;
            private List<Meals> meals;
            private List<Books>books;
            private ClassGrade grade;
            private List<Exam> exam ;
            private List <ExtraMuralActivity> ema;
            private StudentBalance bal;
            
            
           // private List <Results> result;
          //  private PeriodTimeTable timetable;
            
           /* private Registration reg;
            
            
            
            private StudentBalance balance;
            private StudyTimeTable studTimeTable;*/
            
            
           /* private List <ExtraMuralActivity> ema;
            private List <Meals> meals;
            
            
            private List<StudentLevel> level;
            private List<Subject> subject;*/
            
            
            public Builder(String studentID)
            {
                this.studentID = studentID;
            }
            
            public Builder id(Long value)
            {
                this.id = value;
                return this;
            }
            
            public Builder firstname(String value)
            {
                this.firstname = value;
                return this;
            }
            
            public Builder lastname(String value)
            {
                this.lastname = value;
                return this;
            }
            
            public Builder age(int value)
            {
                this.age = value;
                return this;
            }
            
            public Builder registration(Registration value)
            {
                this.reg = value;
                return this;
            }
            
            public Builder meals(List<Meals> value) {
                this.meals = value;
                return this;
            }
            
            public Builder books(List <Books> value)
            {
               
                books = value;
                return this;
            }
            
            public Builder classGrade(ClassGrade value)
            {
               
                this.grade = value;
                return this;
            }
            
            public Builder exam(List<Exam> value)
            {
                this.exam = value;
                return this;
            }
            
            public Builder extraMuralActivities(List <ExtraMuralActivity> value)
            {
               
                ema = value;
                return this;
            }
            
            public Builder studentBalance(StudentBalance value)
            {
                this.bal = value;
                return this;
            }
            
           /* public Builder results(List <Results> value)
            {
               
                result = value;
                return this;
            }*/
            
            
            
           /* public Builder timeTable(PeriodTimeTable value)
            {
               
                timetable = value;
                return this;
            }*/
            
            
           /* public Builder registration(Registration value)
            {
               
                reg = value;
                return this;
            }
            
            
            
            
            
            
            
            public Builder balance(StudentBalance value)
            {
               
                balance = value;
                return this;
            }
            
            public Builder studTimeTable(StudyTimeTable value)
            {
               
                studTimeTable = value;
                return this;
            }
            
           
            
           
            
            
           
            
            
            public Builder level(List <StudentLevel> value)
            {
               
                level = value;
                return this;
            }
            public Builder subject(List <Subject> value)
            {
               
                subject = value;
                return this;
            }*/
            
            public Builder student(Student student)
            {
                id = student.getId();
                studentID = student.getStudentID();
                firstname = student.getfirstname();
                lastname = student.getlastname();
                age = student.getAge();
                reg = student.getRegistration();
                meals = student.getMeals();
                books = student.getBooks();
                grade = student.getClassGrade();
                exam = student.getExam();
                ema = student.getExtraMuralActivity();
                bal = student.getBalance();
                //result = student.getResults();
                
               // timetable = student.getPeriodTimeTable();
                
                
                
                /*reg = student.getRegistration();
                
                exam = student.getExam();
               
                balance = student.getStudentBalance();
                studTimeTable = student.getStudyTimeTable();
                
                meals = student.getMeals();
                
                
                level = student.getStudentLevel();
                subject = student.getSubject();*/
                
                return this;
            }
            
           
            public Student build()
            {
                return new Student(this);
            }

 
    }

    public Long getId() {
        return id;
    }
    
    public Registration getRegistration() {
        return reg;
    }

    public String getStudentID()
    {
        return studentID;
    }
    
    public String getfirstname()
    {
        return firstname;
    }
    
    public String getlastname()
    {
        return lastname;
    }
    
    public int getAge()
    {
        return age;
    }
    
     public List<Meals> getMeals() {
        return meals;
    }
     
    public List <Books> getBooks()
    {
        return books;
    }  
    
    public ClassGrade getClassGrade()
    {
        return grade;
    }
    
     public List<Exam> getExam() 
     {
        return exam;
     }
     
    public List <ExtraMuralActivity> getExtraMuralActivity()
    {
        return ema;
    }
    
    public StudentBalance getBalance()
    {
        return bal;
    }
    
   /* public List <Results> getResults()
    {
                return result;
    } */  
     
   /* public PeriodTimeTable getPeriodTimeTable()
    {
        return timetable;
    }*/
     

    /*
    
    
    
    public Exam  getExam()
    {
        return exam;
    }
    
    
     
    public StudentBalance getStudentBalance()
    {
        return balance;
    }
    
    public StudyTimeTable getStudyTimeTable()
    {
        return studTimeTable;
    }
        
    
           
    public List <Meals> getMeals()
    {
        return meals;
    }        
      
    
            
    public List <Results> getResults()
    {
        return result;
    }          
            
    public List <StudentLevel> getStudentLevel()
    {
        return level;
    }  
    
    public List <Subject> getSubject()
    {
        return subject;
    }  */

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Student)) {
            return false;
        }
        Student other = (Student) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.waggie212157582.cput.schoolweb.domain.Students[ id=" + id + " ]";
    }
    
}
