/*
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


/**
 *
 * @author WAGGIE
 */
@Entity
public class Tutor implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    
    @Column(unique = true)
    private String tutorId;
    private String firstname;
    private String lastname;
    private int age;
    
    @Embedded
    private Salary salary;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "tutorID")
    private List<Student>student;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "tutorID")
    private List<Books>books;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "tutorID")
    private List<Subject>subjects;
    
    
    private Tutor( Builder builder)
    {
        id = builder.id;
        tutorId = builder.tutorId;
        firstname = builder.firstname;
        lastname = builder.lastname;
        age = builder.age;
        salary = builder.salary;
        books = builder.books;
        student = builder.student;
        subjects = builder.subjects;
                        
    }
    
    private Tutor()
    {
       
    }
    
    
    
    public static class Builder
    {
        private Long id;
        private String tutorId;
        private String firstname;
        private String lastname;
        private int age;
        private Salary salary;
        private List<Student>student;
        private List<Books>books;
        private List<Subject>subjects;
            
            
            public Builder(String value)
            {
                this.tutorId = value;
            }
            
            public Builder id(Long value)
            {
                this.id = value;
                return this;
            }
            
            public Builder firstname(String name)
            {
                this.firstname = name;
                return this;
            }
            
            public Builder lastname(String surname)
            {
                this.lastname = surname;
                return this;
            }
            public Builder age(int age)
            {
                this.age = age;
                return this;
            }
            
            public Builder student(List<Student>value)
            {
                this.student = value;
                return this;
            }
            
            public Builder books(List<Books>value)
            {
                this.books = value;
                return this;
            }
            
            
            public Builder subjects(List<Subject>value)
            {
                this.subjects = value;
                return this;
            }
            
            public Builder salary(Salary value)
            {
                this.salary = value;
                return this;
            }
           
            
            public Builder tutor(Tutor tutor)
            {
                id = tutor.getId();
                tutorId = tutor.getTutorId();
                firstname = tutor.getfirstname();
                lastname = tutor.getlastname();
                age = tutor.getAge();
                salary = tutor.getSalary();  
                books = tutor.getBooks();
                subjects = tutor.getSubjects();
                student = tutor.getStudent();
                
                return this;
            }
            

            public Tutor build()
            {
                return new Tutor(this);
            }
        }
    
    public String getTutorId()
    {
        return tutorId;
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
    
    public Salary getSalary()
    {
        return salary;
    }
    
    public List<Books>getBooks()
    {
        return books;
    }
    public List<Student>getStudent()
    {
        return student;
    }

    public List<Subject>getSubjects()
    {
        return subjects;
    }
    
    public Long getId()
    {
        return id;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tutor)) {
            return false;
        }
        Tutor other = (Tutor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "com.Waggie212157582.cput.domain.Tutor[ tutorId=" + id + " ]";
    }
    
}
