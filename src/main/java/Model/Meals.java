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
public class Meals
{
    
   private String name;
   private String mealType;
   
    public String getName()
   {
       return name;
        
   }
   public String getMealType()
   {
       return mealType;
   }
   
   
   private Meals()
   {
       
   }
   private Meals(Builder build)
    {
        mealType = build.mealType;
        name = build.name;
    }
    public static class Builder
    {
        private String name;
        private String mealType;
        
        //mandatory value
        public Builder(String mealType)
        {
            this.mealType = mealType;
        }
        
        //"SETTERS"
       
        public Builder name(String name)
        {
            this.name = name;
            return this;
        }
        public Builder Job(String mealType)
        {
            this.mealType = mealType;
            return this;
        }
        //LISTS
       
        //RETURN OUTERCLASS IN INNERCLASS
        public Builder ml(Meals meal)
        {
            this.mealType= meal.getMealType();
            return this;
        }
        public Meals build()
        {
            return new Meals(this);
        }
    }
    
    
}