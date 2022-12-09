import java.io.*;
import java.util.*;

public class Lab05 {

    public static void main(String[] args) {
        double base = 0;
        double exp = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to POWER!!!!");
        
        boolean s1 = false;
        boolean s2 = false;
        while (s1 == false) {
         System.out.println("Input a Base");
            try {
                base = input.nextInt();
                if (base != 0) {
                    s1 = true;


                }
                } catch (InputMismatchException e) {
                    System.out.println(e);
                    s1 = false;
                }

            }

         
        while(s2 == false)
          {
            System.out.println("Input a power");
            try {
                exp = input.nextInt();
                if(exp != 0)
                {
                  s2 =true;
                
                
                }
            } catch (InputMismatchException e) {
                System.out.println(e);
            }
            
          }

            Power(base, exp);



        }

        public static double Power(double base, double pwr) {
            double multiplier = base;
            double output = 1;
            for (int x = 1; x < pwr; x++) {

                 output = base * multiplier;



            }
            System.out.println(base + " To the power of " + pwr + " Is " + output);



            return base;
        }






    }