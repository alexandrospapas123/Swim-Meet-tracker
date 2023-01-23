import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
import java.awt.*; 
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.*;


public class Tracker extends JFrame{
  private JButton a ; // reference to the button object
  private JButton b ;
  private JButton c ;
  private JButton d ;
  private JButton e ;
  public static int buttonPessed=0;
  private static boolean done = false;
  private static ButtonCallback callback;
  // constructor for ButtonFrame
  public Tracker(ButtonCallback callback) {
    this.callback = callback;
    // invoke the JFrame constructor
    // Construct an ImageIcon from an image filename
   String imgFilename = "";
      // Can use an absolute filename such as "c:/project/images/nought.gif"
   ImageIcon icon = new ImageIcon("North-Broward-Preparatory-School-Logo2.jpg");
// OR
// Construct an ImageIcon via an image URL (in the form of file://path/filename)
   icon = null;
   imgFilename = "";
   java.net.URL imgURL = getClass().getClassLoader().getResource(imgFilename);
      // Filename always relative to the root of the project (i.e., bin)
      // can access resource in a JAR file
   if (imgURL != null) {
       icon = new ImageIcon("North-Broward-Preparatory-School-Logo2.jpg");}
 else {
       System.err.println("Couldn't find file: " + imgFilename);
 }
   
      Container cp = getContentPane();
      cp.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
 
      // Create a JLabel with text and icon and set its appearances
      JLabel label = new JLabel("", icon, SwingConstants.CENTER);
      label.setFont(new Font(Font.DIALOG, Font.ITALIC, 14));
      label.setOpaque(true);  // needed for JLabel to show the background color
      label.setBackground(new Color(204, 238, 241));  // light blue
      label.setForeground(Color.RED);                 // foreground text color
      label.setPreferredSize(new Dimension(2000, 400));
      cp.add(label);
  
 
    setLayout( new FlowLayout() );      // set the layout manager
    d = new JButton("North Broward Prep Games"); 
    add( d );
    
    a = new JButton("Swim Categories"); // construct a JButton                    
    add( a ); 
    // add the button to the JFrame
    b = new JButton("Data Analytics"); // construct a JButton
    add( b );
    c = new JButton("Swimmer Performance"); // construct a JButton
    add( c );
    e = new JButton("Exit"); // construct a JButton
    add( e );                // add the button to the JFrame
    

    a.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            callback.onButtonPress(2);
            }
        });
    b.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            callback.onButtonPress(3);
            }
        });        
    c.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            callback.onButtonPress(4);
            }
        });       
    d.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            callback.onButtonPress(1);
            }
        });
     e.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            System.exit( 0 );
            }
        });
   setSize( 1000, 1000 );
   setVisible( true ); 
   setTitle("Button Frame"); 
    }       
  public interface ButtonCallback {
        void onButtonPress(int buttonNumber);
    }
   
    static Scanner input =new Scanner(System.in);
    private static int buttonPressValue;
    //public static int handleButtonPress(int value) {
        //buttonPressValue = value;
    //
    //public interface ButtonCallback {
        //void onButtonPress(int buttonNumber);
    //}
    public static int InputYourChoice(){
     String Choice;
     int choice2;
     Choice=JOptionPane.showInputDialog("1.Add Game   2. Remove Game  3. Show Games");
     choice2 = Integer.parseInt(Choice);
     while ((choice2<1)||(choice2>3)){
         Choice=JOptionPane.showInputDialog("invalid choice type correct choice (1,2,3)");
         choice2 = Integer.parseInt(Choice);}
     return choice2;}
    
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
        Tracker frm = new Tracker(new ButtonCallback() {
            @Override
            public void onButtonPress(int buttonNumber) {
                System.out.println("Button " + buttonNumber + " pressed");
                done = true;
                if (buttonNumber == 1){
                   int choice1 = InputYourChoice();
                        Athlete athlete1 = new Athlete("John Doe", 12, "Male");
                        Athlete athlete2 = new Athlete("Jane Smith", 11, "Female");
        
                        // Create Event objects
                        Event event1 = new Event("200 M.R.", "NBP", 122.3, 1, 15, athlete1);
                        Event event2 = new Event("200 FR", "NBP", 124.8, 3, 20, athlete2);

                        // Add events to a list
                        List<Event> eventList = new ArrayList<>();
                        eventList.add(event1);
                        eventList.add(event2);
                        // Create MeetScoreSheet object
                        GameList scoreSheet = new GameList("NBP", "", eventList);
                        if (choice1==1){
                           // Add an event to the MeetScoreSheet's event list
                            Event event3 = new Event("50 FR", "NBP", 61.2, 2, 10, athlete1);
                            scoreSheet.addEvent(event3);}
                       else if (choice1==2){ 
                        // Remove an event from the MeetScoreSheet's event list
                           scoreSheet.removeEvent(event2);

                        //Print the events in the MeetScoreSheet's event list
                        
                    }
                   else{
                     for (Event e : scoreSheet.getEvents()) {
                                System.out.println("Event: " + e.getEvent() + " Athlete: " + e.getAthlete().getName());
                        }  
                   }
                    
                    
                    
                    
                    
                    
                    
                    
                   
                   
                   
                   
                   
                   
                   
                   
                   
                }
                
                
                
                
                
                
                
                
            }
        });
        frm.setSize( 1000, 1000 );
        frm.setVisible( true );
       
        
        
        
        
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