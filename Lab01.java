import java.io.*;
import java.lang.Math;
import java.util.*;

public class Lab01 {
   public static Scanner input = new Scanner(System.in);
   public static void main(String[] args) {
      boolean keepRunning = true;
      boolean isloggedin = false;
      double coolthing = (Math.random() *100) -75;
   
      String[] dates = new String[5];
      String[] username = new String[5];
      String[] password = new String[5];
      String[] bdesc = new String[5];
   
      username[0] = "drsegway";
      username[1] = "PlayersdontPlay";
      username[2] = "violaeliz";
      username[3] = "trujillo24";
   
      password[0] = "1234";
      password[1] = "password";
      password[2] = "joemama29";
      password[3] = "Lorena27";
   
      dates[1] = "1776";
      dates[2] = "1917";
      dates[3] = "1944";
      dates[4] = "2001";
   
      bdesc[1] =
         "In 1776, the United States of America gained their independence, and began \n preperations for war with england.";
      bdesc[2] = "In 1917, the United States of America entered WW1.";
      bdesc[3] =
         "In 1944, the United States of America and Great Britain began the largest amphibious assault in human history.\n This was the beginning of the end for the german empire.  ";
      bdesc[4] =
         "In 2001, the World Trade Center was attacked \n and destroyed by a terrorist element.";
   
      System.out.println("Welcome to the Archives. Log in to continue.");
   
      while (isloggedin == false) {
      
         boolean useraccepted = false;
         boolean passaccepted = false;
         int usernamepos = 0;
         
         while(useraccepted == false)
         {
            System.out.println("Please input a username");
            String userin = input.nextLine();
            for(int x = 0; x<username.length; x++)
            {
               if (userin.equals(username[x]))
               {
                  System.out.println("username accepted.");
                  useraccepted = true;
                  
                  usernamepos = x;
                  break;
               }
               else{System.out.println("invalid username");
                  break;
               
               
               }
            }
         }
         
         while(passaccepted == false)
         {
            System.out.println("input your password");
            String passin = input.nextLine();
            
         
            if(passin.equals(password[usernamepos]))
            {
               passaccepted = true;
               System.out.println("password accepted.");
               isloggedin = true;
            
            }
         
         }
         
         
      
      
        
      
      }
      while (isloggedin == true) {
         while (keepRunning == true) {
            System.out.println("Select a date to make an inquiry.");
            System.out.println("1. 1776 \n 2. 1914 \n 3. 1944 \n 4. 2001");
            String date = input.nextLine();
         
            if (date.equals(dates[1]) || date.equals(dates[2])
            || date.equals(dates[3]) || date.equals(dates[4])
            || date.equals("1") || date.equals("2") || date.equals("3")
            || date.equals("4")) {
               if (date.equals(dates[1]) || date.equals("1")) {
                  System.out.println(bdesc[1]);
               }
            
               if (date.equals(dates[2]) || date.equals("2")) {
                  System.out.println(bdesc[2]);
               }
            
               if (date.equals(dates[3]) || date.equals("3")) {
                  System.out.println(bdesc[3]);
               }
            
               if (date.equals(dates[4]) || date.equals("4")) {
                  System.out.println(bdesc[4]);
               }
            
            } else
               System.out.println("Please input a valid option.");
         
            boolean run = true;
         
            while (run == true) {
               System.out.println("Would you like to access another date? (Y/N)");
               String response = input.nextLine();
               response = response.toUpperCase();
               if (response.equals("N") || response.equals("Y")) {
                  run = false;
                  if (response.equals("N")) {
                     keepRunning = false;
                     System.out.println("Ending Session...");
                     System.out.println("Logging out......");
                     isloggedin = false;
                     
                  } else {
                     keepRunning = true;
                  }
               } else {
                  System.out.println("Please input a valid response.");
               }
            }
         }
      }
   }
}
