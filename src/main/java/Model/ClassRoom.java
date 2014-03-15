/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author WAGGIE
 */
public class ClassRoom
{
   
    private String location;
    private int roomNum;
    private Teacher teacher;
    
    private ClassRoom()
    {
        
    }
    
    private ClassRoom( Builder builder)
    {
        location = builder.location;
        roomNum = builder.roomNum;
        teacher = builder.teacher;
                   
    }
   
    public String getLocation()
    {
        return location;
    }
    
    public int getRoomNum()
    {
        return roomNum;
    }
    
    public Object getTeacher()
    {
        return teacher;
    }
    
    
    public static class Builder
    {
           private String location;
           private int roomNum;
           private Teacher teacher;
           
 
            public Builder(String location)
            {
                this.location = location;
            }
            
            
                    
            public Builder loaction(String loc)
            {
                this.location = loc;
                return this;
            }
            
            public Builder roomNum(int rm)
            {
                this.roomNum = rm;
                return this;
            }
            
            public Builder teacher(Teacher teach)
            {
                this.teacher = teach;
                return this;
            }
            public Builder cRoom(ClassRoom cRoom)
            {
                this.roomNum = cRoom.getRoomNum();
                return this;
            }
            
            public ClassRoom build()
            {
                return new ClassRoom(this);
            }
            
           

 
    }

}

