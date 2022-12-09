import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.*;
import java.lang.Math;
import java.util.*;

public class readerTest
{
   public static void main(String[] args) throws FileNotFoundException, IOException {
   
   
      String fileName = "C:\\Users\\1856676\\Documents\\School\\Computer Science\\Runtime\\AP Compsci\\SurvivalGame\\Names.txt";
      FileInputStream fis = new FileInputStream(fileName);
      Scanner namer = new Scanner(fis);
    while(namer.hasNextLine())
    {
      System.out.println(namer.nextLine());
    
    }

   
   
   
   }



}








