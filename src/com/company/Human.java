package com.company;

public class Human {

   /*  characteristics
    Height , weight , age and name */

   public float height = 1.5f;
   private byte weight = 80 ;
   protected int age ;
   public String name ;

   /*
   Enum is the special case of Class which contains Constant and many more types.
   All the Enum options must be in Caps . (UpperCase)
    */
   public enum SicknessPossibilities {
      HEALTHY,
      SNEZY,
      FLU
   } ;

   public SicknessPossibilities healthy = SicknessPossibilities.HEALTHY ;
   public SicknessPossibilities Sneazy  = SicknessPossibilities.SNEZY;
   public SicknessPossibilities flu = SicknessPossibilities.FLU ;

   /* Methods , behaviours
   mood = age is teenage? angry
          age adult ? serious
          age child ? sleepy
   sickness = enumerable - This is Reference DataType. Reference Datatype starts with Capital Letter.
   tiredness = name has more than 5 characters and height is greater than
               1.5 meters
    */

   public String getMood() {
      if (age >= 13 && age >= 17 ) {
         return "Angry !" ;
      } else if (age < 13 ) {
         return "Sleepy !";
      } else if (age > 18 && age < 100) {
         return "Serious !";
      } else {
         return "Error !" ;
      }
   }


   public Boolean hasSickness()  {
      return healthy != SicknessPossibilities.HEALTHY ;
   }

   public Boolean isTired() {
      if(name.length() > 5 && height > 1.5 ) {
         return true;
      } else {
         return false;
      }
   }
   /*
   Default Values ============
   int = 0
   boolean = False
   String = Null
    */

   @Override
   public String toString() {
      return String.format("Name is %s, age is %d , height is %f , weight is %d , Health is %s" , name
              , age, height , weight , healthy);
   }
}
