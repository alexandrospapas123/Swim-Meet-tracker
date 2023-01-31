import java.awt.Font;
import java.awt.Color;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.*; 
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

//import org.apache.poi.ss.usermodel.*;    
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
//import java.awt.*; 
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

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
    
    //public static int handleButtonPress(int value) {
        //buttonPressValue = value;
    //
    //public interface ButtonCallback {
        //void onButtonPress(int buttonNumber);
    //}
    public static void main(String[] args) throws IOException
    {
        final int N=2, M=33, P=2,i,k,l,m;
        final Event [][][]events=new Event [N][M][P];
        final Event []events1=new Event [N*M*P];
        final Event [][][]newevents=new Event [N][M][P];
        final Event []events2=new Event [N*M*P];
        final ReadInitialEcxelFile rcc = new ReadInitialEcxelFile();
        final NewExcelFile rcc1 = new NewExcelFile();
        Tracker frm = new Tracker(new ButtonCallback() {
            @Override
            public void onButtonPress(int buttonNumber) {
                //System.out.println("Button " + buttonNumber + " pressed");
                done = true;
                //List<Event[]> eventsList = new ArrayList<>();
                //ArrayList<Event> eventsList = new ArrayList<>(Arrays.asList(eventArray));
                if (buttonNumber == 1){
                   int choice1 = InputYourChoice();
                   Event [][][] events = rcc.InputFromExcelFile();
                   int m=0;
                   for ( int k=0; k<N; k++) {
                        for (int i=0; i<M; i++) {
                            for (int j=0; j< P; j++) {
                                    events1[m]=events[k][i][j];
                                    m++;}}}
                  ArrayList<Event> eventsList = new ArrayList<>(Arrays.asList(events1));
                  for (int i = 0; i < m; i++) {
                        Event event = eventsList.get(i);
                        eventsList.add(event);
                        System.out.println("Game num " + event.getGameNum() + "  " + event.getEvent());
                        System.out.println(event.getName() + "  " + event.getLane() + "  " + event.getTime());}

                   if (choice1==1){
                       Event [][][] newevents = rcc1.InputFromExcelFile();
                       
                   m=0;
                   for ( int k=0; k<N; k++) {
                        for (int i=0; i<M; i++) {
                            for (int j=0; j< P; j++) {
                                    events2[m]=newevents[k][i][j];
                                    m++;}}}
                      for (int i = m; i < 2*m; i++) {
                        Event event = eventsList.get(i);
                        eventsList.add(event);
                        System.out.println("Game num " + event.getGameNum() + "  " + event.getEvent());
                        System.out.println(event.getName() + "  " + event.getLane() + "  " + event.getTime());}}
                   else if (choice1==2){ 
                        // Remove an event from the MeetScoreSheet's event list
                           //scoreSheet.removeEvent(event2);

                        //Print the events in the MeetScoreSheet's event list
                        
                    }
                   else{
                       for(int l=0;l<N;l++){
                                    System.out.println(" ");
                                    System.out.println(" ");
                                    System.out.println(events[l][0][0].getDateSchool());
                                    System.out.println(" ");
                                    System.out.println(" ");
                            for( m=0;m<M;m++){
                                if (m%3==0){ 
                                    System.out.println(" ");
                                    System.out.println(" "); 
                                    System.out.println("Game num    "+events[l][m][0].getGameNum()+"  "+events[l][m][0].getEvent()+"  ");}
                                System.out.println(events[l][m][0].getName()+"  "+events[l][m][0].getLane()+"  "+events[l][m][0].getTime());
                                System.out.println(events[l][m][1].getName()+"  "+events[l][m][1].getLane()+"  "+events[l][m][1].getTime());}}
                        }
                    }  
                else if (buttonNumber==2){
                        JFrame frm = new JFrame();
                        frm.setSize( 1000, 1000 );
                        frm.setVisible( true );
                        SwimMeet meet = new SwimMeet();
                        String firstName = " ";
                        String lastName = " ";
                        double time=0.0;
                        MyFrame f = new MyFrame(); }
                }  
            });
       
    }
}