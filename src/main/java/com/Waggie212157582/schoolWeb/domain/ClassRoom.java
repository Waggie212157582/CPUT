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
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author WAGGIE
 */
@Entity
public class ClassRoom implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String location;
    private int roomNumber;
    
    private ClassRoom()
    {
        
    }
    
    private ClassRoom ( Builder builder)
    {
        id = builder.id;
        location = builder.location;
        roomNumber = builder.roomNumber;
        
               
    }
     
     public static class Builder
    {
            private Long id;
            private String location;
            private int roomNumber;
            
            
            
            public Builder(String location)
            {
                this.location = location;
            }
            
            public Builder id(Long value)
            {
                this.id = value;
                return this;
            }
            
            public Builder roomNumber(int value)
            {
                roomNumber = value;
                return this;
            }
            
            
            public Builder classRoom(ClassRoom classRoom)
            {
                id = classRoom.getId();
                location = classRoom.getLocation();
                roomNumber = classRoom.getRoomNumber();
                
                return this;
            }
            
           
            public ClassRoom build()
            {
                return new ClassRoom(this);
            }

 
    }

    public Long getId() {
        return id;
    }

    public String getLocation()
    {
        return location;
    }
    
    public int getRoomNumber()
    {
        return roomNumber;
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
        if (!(object instanceof ClassRoom)) {
            return false;
        }
        ClassRoom other = (ClassRoom) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.waggie212157582.cput.schoolweb.domain.ClassRoom[ id=" + id + " ]";
    }
    
}
