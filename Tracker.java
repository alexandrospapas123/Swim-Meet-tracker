import java.util.Scanner;
import java.util.*;
import java.awt.*; 
import javax.swing.*;
import java.awt.event.*;

class Tracker
{

   
    static Scanner input =new Scanner(System.in);
   
    public static void main (String [] args){
    {
        System.out.println("Swim Meet Tracker");
        Frame1 frm = new Frame1("North Broward Swim Meet Tracker");
        frm.setSize( 1000, 1000);
        frm.setVisible( true );
        int choice=frm.getCOUNT();
        System.out.println(choice);
        
        System.out.println("press 9999999 to confirm");
            
        
    }
}
}