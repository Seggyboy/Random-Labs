import java.io.*;
import java.lang.Math;
import java.util.*;

public class Lab02 {
   
   

   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      boolean keeprunning = true;
      double sl = 0;
      double area = 0;
      double area1 = 0;
      double areafinal = 0;
       
      while( keeprunning == true)
      {
         for(int x = 1; x == 1; x = x)
         {
            System.out.println("Welcome to cube finder. Input the length of one side of your cube.");
            sl = input.nextInt();
            if(sl>=0)
            {
               x = 2;
               
            }
            else
            {
               System.out.println("Input a valid value. (greater than or equal to 0)");
               
            }
            
            
               
         }
         area1 = sl*sl ;
         areafinal =  area1*6;
         System.out.println("The area of your cube is: " + areafinal + " units^2");
         
         boolean keeprunning2 = true;
         while(keeprunning2 == true)
         {
         
            
            System.out.println("Would you like to input another value? (Y/N)");
            String stringy = input.next();
            stringy = stringy.toUpperCase();
         
               if(stringy.equals("Y") || stringy.equals("N"))
               {
                  if(stringy.equals("N"))
                  {
                     keeprunning = false;
                     keeprunning2 = false;
                     
                     
                  
                  }
                  else
                  {
                     keeprunning2 = false;
                  
                  }
               
               
               }
               else
               {
               
                  System.out.println("input a valid value.");
               
               
               
               
               }
         }
      
      }
      
   }






}