import java.util.Scanner;
import java.util.*;
import java.awt.*; 
import javax.swing.*;
import java.awt.event.*;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Tracker
{

   
    static Scanner input =new Scanner(System.in);
   



    public static void main(String[] args) throws IOException
    {
        // declare and initialize the variables
        
        String test1, test2, test3,line;
        double average=0;
        String name;
        FileReader fr = new FileReader("swimmers.txt");
        Scanner inFile = new Scanner(fr);
        PrintWriter outFile = new PrintWriter("testavg.txt");
        while (inFile.hasNext())
        {
         name = inFile.next()+inFile.next();
         
         outFile.println("Student Name: " + name);
         test1 = inFile.next();
         test2 = inFile.next();
         test3 = inFile.next();
         System.out.println(name+"   "+test1+"   "+test2+"   "+test3);       
         average = (Double.parseDouble(test1) + Double.parseDouble(test2) + Double.parseDouble(test3))/ 3.0;
         System.out.println("Average test score:"+average);
          try{                                                                         
          outFile.println("Test scores: "+test1+"  "+test2+"  "+test3); 
          outFile.println("Average test score: "+ average);}
          catch (Exception e){}
          outFile.println();
           
        }
        inFile.close();
        outFile.close();
        FileReader fr1 = new FileReader("testavg.txt");
        Scanner inFile1 = new Scanner(fr1);
         while (inFile1.hasNext())
        {
         line = inFile1.nextLine();
         System.out.println(line);}
        inFile1.close();
        
        
        
        System.out.println("Swim Meet Tracker");
        Frame1 frm = new Frame1("North Broward Swim Meet Tracker");
        frm.setSize( 1000, 1000 );
        frm.setVisible( true );
         
    }
}