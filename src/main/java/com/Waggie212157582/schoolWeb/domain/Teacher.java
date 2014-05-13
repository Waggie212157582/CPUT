/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Waggie212157582.schoolWeb.domain;

/**
 *
 * @author WAGGIE
 */


import java.io.Serializable;
import java.util.*;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Teacher implements Serializable
{
    
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(unique = true)
    private String staffNum;
    
    
    private String firstname;
    private String lastname;
    private int age;
    
    @Embedded
    private Salary salary;
    
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "staff_ID")
    private List <Meals> meals;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "staff_ID")
    private List<Books>books;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "staff_ID")
    private List <ClassRoom> classRoom;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "staff_ID")
    private List<Student> student;
    
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "staff_ID")
    private List<Subject> subject;
    
   /* @Embedded
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "staff_ID")
    private List <Results> result;
 
    
    
   */
    
    
    
    
    
    private Teacher( Builder builder)
    {
        id = builder.id;
        staffNum = builder.staffNum;
        firstname = builder.firstname;
        lastname = builder.lastname;
        age = builder.age;
        meals = builder.meals;
        books = builder.books;
        classRoom = builder.classRoom;
        salary = builder.salary;
        subject = builder.subject;
        
        
      /*  grade = builder.grade;
        
        timetable = builder.timetable;
        
        meals = builder.meals;
        
        result = builder.result;
        
        student = builder.student;*/
    }
    
    private Teacher()
    {
       
    }
    
    public static class Builder
    {
        private Long id;
        private String staffNum;
        private String firstname;
        private String lastname;
        private int age;
        private List <Meals> meals;
        private List<Books>books;
        private List <ClassRoom> classRoom;
        private Salary salary;
        private List<Student> student;
        private List<Subject> subject;
        
      /*  private PeriodTimeTable timetable;
        
        private ClassRoom classroom; 
        
        
        
        private List <Results> result;
        
        */
            
            
            public Builder(String value)
            {
                this.staffNum = value;
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
            
            public Builder meals(List <Meals> value)
            {
               
                this.meals = value;
                return this;
            }
            
            public Builder books(List <Books> value)
            {
               
                this.books = value;
                return this;
            }
            
            public Builder classroom(List <ClassRoom> value)
            {
               
                this.classRoom = value;
                return this;
            }
            
            public Builder salary(Salary value)
            {
               
                this.salary = value;
                return this;
            }
            
            public Builder student(List <Student> value)
            {
               
                this.student = value;
                return this;
            }
            
            public Builder subject(List <Subject> value)
            {
               
                this.subject = value;
                return this;
            }
            
          /*  public Builder timeTable(PeriodTimeTable value)
            {
               
                timetable = value;
                return this;
            }
            
            
            
            
            
            public Builder classGrade(List <ClassGrade> value)
            {
               
                grade = value;
                return this;
            }
            
           
            
            
            
            
            public Builder results(List <Results> value)
            {
               
                result = value;
                return this;
            }
            
            
            
            */
            
            
         public Builder teacher(Teacher teacher)
            {
                id = teacher.getId();
                staffNum = teacher.getStaffNum();
                firstname = teacher.getfirstname();
                lastname = teacher.getlastname();
                age = teacher.getAge();
                meals = teacher.getMeals();
                books = teacher.getBooks();
                classRoom = teacher.getClassRoom();
                salary = teacher.getSalary();
                student = teacher.getStudent();
                subject = teacher.getSubject();
               /* grade = teacher.getClassGrade();
                timetable = teacher.getPeriodTimeTable();
                
                
                
                result = teacher.getResults();
                
                */
                
                return this;
            }

            public Teacher build()
            {
                return new Teacher(this);
            }
        }
    
    public Long getId() {
        return id;
    }
   
    public String getStaffNum()
    {
        return staffNum;
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
    
    public List <Meals>  getMeals()
    {
        return meals;
    }
    
    public List <Books>  getBooks()
    {
        return books;
    }
    
    public List <ClassRoom> getClassRoom()
    {
        return classRoom;
    }
    
    
    public Salary getSalary()
    {
        return salary;
    }
    
    public List <Student>  getStudent()
    {
        return student;
    } 
    
    public List <Subject>  getSubject()
    {
        return subject;
    }
   /* 
    
    
     
    
     
    public List<Results>  getResults()
    {
        return result;
    }
    
    
    
     */
    
     @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Teacher)) {
            return false;
        }
        Teacher other = (Teacher) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "com.Waggie212157582.cput.domain.Teacher[ staffID=" + id + " ]";
    }
    
}

