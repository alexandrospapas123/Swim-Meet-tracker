import java.util.ArrayList;
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
    private static int buttonPressValue;
    //public static int handleButtonPress(int value) {
        //buttonPressValue = value;
    //
   
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
        System.out.println("Button press value: " + Tracker.buttonPressValue);
        
        
        
        
        SwimMeet meet = new SwimMeet();
        String firstName = " ";
        String lastName = " ";
        String gender = " ";
        int yearGroup=0;
        double time=0.0;
        // Read in the categories from a file
        //FileReader fr2 = new FileReader("categories.txt");
        //Scanner inFile2 = new Scanner(fr2);
        //while (inFile2.hasNext()) {
            //meet.addCategory(inFile2.nextLine());
        //}
        //inFile.close();
        
        // Read in the swimmers from a file
        fr = new FileReader("swimmers.txt");
        inFile = new Scanner(fr);
        while (inFile.hasNext()) {
            try{
            firstName = inFile.next();
            lastName = inFile.next();
            gender = inFile.next(); 
            yearGroup = inFile.nextInt();
            time=inFile.nextDouble();}
            catch (Exception e){}
            meet.addSwimmer(new Swimmer(firstName, lastName, gender, yearGroup,time));
        }
        inFile.close();

        // Print out the names of all the swimmers in the meet
        System.out.println("Swimmers:");
        for (Swimmer s : meet.swimmers) {
            System.out.println(s.getFirstName() + " " + s.getLastName());
        }
        
        // Write the times for each swimmer to a file
         PrintWriter fw = new  PrintWriter("swimmer_times.txt");
        for (Swimmer s : meet.swimmers) {
            fw.write(s.getFirstName() + " " + s.getLastName());
            fw.write(Double.toString(s.getTimes()));
            fw.write("\n");
        }
        fw.close();
        MyFrame f = new MyFrame();
    }
}