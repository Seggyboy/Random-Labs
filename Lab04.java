import java.io.*;
import java.lang.Math;
import java.util.*;

public class Lab04 {
 

   public static void main(String[] args) {
   
   

      Scanner input = new Scanner(System.in);     
           System.out.println("A random int between 0 and 5 is " + rndInt(0,5) );
           System.out.println("A random double between 0 and 5 is " + rndDbl(0,5));
           int x = 0;
           System.out.println("Welcome to a the converter. Would you like to \n 1.) convert from Celcius to Farenheight \n 2.) convert from  Farenheight to Celcius ");
            x = input.nextInt();
           switch(x)
           {
              case 1:
              int number2 = input.nextInt();
              System.out.println(number2 + " degrees in Farenheight is " +conToFar(number2)+" degrees.");
              break;
              
              case 2:
              System.out.println("input a farenheight number.");
              int number = input.nextInt();
              System.out.println(number +" degrees in Celcius is " +conToCel(number) + " degrees.");
              break;
           }
           
          
           
           
           
           
   
   
   }
   
   
   public static int rndInt(int min, int max){
   
      int number = (int) (Math.random()*(max-min+1))+min;
      return number;
   }
   
   
   
   public static double rndDbl(int min, int max){
   
       double number = (double) (Math.random()*(max-min+1))+min;
       return number;
   
   }
   
   
   public static double conToCel (int far){
   
      double number = Math.floor((far - 32) * 5.0/9.0);
      return number;
   
   }
   
   
   public static double conToFar(int cel){
      double number = Math.floor((cel * 9/5) + 32);

      return number;
   
   }
   








}