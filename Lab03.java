import java.io.*;
import java.lang.Math;
import java.util.*;

public class Lab03 {
   
   

   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      boolean keeprunning = true;
      boolean keeprunning2 = true;
      double r;
      
      while( keeprunning == true)
      {
      while(keeprunning2 == true)
      {
         System.out.println("Input the radius of your sphere");
         r = input.nextInt();
      
         if(r>= 0)
         {keeprunning2 = false;}
         else
         { System.out.println("Please input a valid value.");}
         
         System.out.println("The circumfrence of the sphere is " + Circum(r));
         System.out.println("The diameter of the sphere is " + Diam(r));
         System.out.println("The surface area of the sphere is " + surArea(r));
         System.out.println("The Volume of the sphere is " +  Vol(r));
        
         
      
      }
      boolean valid = false;
      
        while(valid = false)
        {
         System.out.println("Run again? (Y/N)");
         
            String yn = input.next();
            yn.toUpperCase();
            if(yn.equals("N") || yn.equals("Y"))
            {
               if(yn.equals("N"))
               {
                  keeprunning = false;
               
               }
            
            
            
            }
            else
            {System.out.println("Input a valid value.");}
            }
            
         
         
         
      
      }
       
      
   }
   
   
   
   public static double Circum( double r )
   {
      
      double output = (2 * Math.PI )* r;
      output = Math.round(output * 100.0) / 100.0;
      return output;
   
   
   }
   
   public static double Diam( double r)
   {
      double output = 2 *r;
      output = Math.round(output * 100.0) / 100.0;
      return output;
   
   }
   
   public static double Vol ( double r )
   {
      double output = (1.333333333 *Math.PI) * Math.pow(r, 3);
      double test = (1.3333333333) * Math.PI;
      output = Math.round(output * 100.0) / 100.0;
      return output;
   }
   
   
   public static double surArea ( double r)
   {
   
      double output = 4 * Math.PI * Math.pow(r, 2);
      output = Math.round(output * 100.0) / 100.0;
      return output;
   
   }
      
}
      
      
      
      
      
      
       
