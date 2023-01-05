
import java.awt.*; 
import javax.swing.*;
import java.awt.event.*;
public class Frame1 extends JFrame implements ActionListener
{
  JButton a ; // reference to the button object
  JButton b ;
  JButton c ;
  JButton d ;
  JButton e ;
  private int COUNT;
  
  // constructor for ButtonFrame
  Frame1(String title) 
  {
    super( title ); 
    // invoke the JFrame constructor
    // Construct an ImageIcon from an image filename
   String imgFilename = "";
      // Can use an absolute filename such as "c:/project/images/nought.gif"
   ImageIcon icon = new ImageIcon("C:/Users/guska/OneDrive/Υπολογιστής/North-Broward-Preparatory-School-Logo2.jpg");
// OR
// Construct an ImageIcon via an image URL (in the form of file://path/filename)
   icon = null;
   imgFilename = "";
   java.net.URL imgURL = getClass().getClassLoader().getResource(imgFilename);
      // Filename always relative to the root of the project (i.e., bin)
      // can access resource in a JAR file
   if (imgURL != null) {
       icon = new ImageIcon("NBP_logo.jpeg");}
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
    d.addActionListener( this );
    add( d );
    
    a = new JButton("Swim Categories"); // construct a JButton                    
    a.addActionListener( this );
    add( a ); 
    // add the button to the JFrame
    b = new JButton("Data Analytics"); // construct a JButton
    b.addActionListener( this );
    add( b );
    c = new JButton("Swimmer Performance"); // construct a JButton
    c.addActionListener( this );
    add( c );
    e = new JButton("Exit"); // construct a JButton
    e.addActionListener( this );
    add( e );                // add the button to the JFrame
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  }
 
public void actionPerformed( ActionEvent ev)//Listener
  {
   String action = ev.getActionCommand();   
   if (action.equals("North Broward Prep Games")){
      System.out.println("press 1 to confirm");
      setCOUNT(1);}
   else if (action.equals("Swim Categories")){
      System.out.println("press 2 to confirm");
      setCOUNT(2);}
   else if(action.equals("Data Analytics")){
       System.out.println("press 3 to confirm");       
      setCOUNT(3);}
   else if(action.equals("Swimmer Performance")){
       System.out.println("press 4 to confirm");
       setCOUNT(4);}
   else{    
       System.exit( 0 );}
    }
    
    public void buttonClick(ActionEvent event)
    {
    
   String action1 = event.getActionCommand();   
   if (action1.equals("North Broward Prep Games")){
      COUNT=1;}
   else if (action1.equals("Swim Categories")){
      COUNT=2;}
   else if(action1.equals("Data Analytics")){      
      COUNT=3;}
   else if(action1.equals("Swimmer Performance")){
      COUNT=4;}
   //myLabel.setText(Integer.toString(COUNT));
   }
public void setCOUNT(int x){
    this.COUNT=x;}
public int getCOUNT( ){
    return COUNT;}
}