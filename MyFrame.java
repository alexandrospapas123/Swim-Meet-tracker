import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
class MyFrame
    extends JFrame
    implements ActionListener {
 
    // Components of the Form
    private Container c;
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    
    private JLabel mno;
    private JTextField tmno;
    
     private JLabel game;
    private JRadioButton MR200;
    private JRadioButton FR200;
    private JRadioButton IM200;
    private JRadioButton FR50;
    private JRadioButton FL100;
    private JRadioButton FR100;
    private JRadioButton FR500;
    private JRadioButton FRR200;
    private JRadioButton BK100;
    private JRadioButton BR100;
    private JRadioButton FRR400;
    private ButtonGroup games;

    private JLabel dob;
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;
    
    private JLabel add;
    private JTextArea tadd;

    private JButton sub;
    private JButton reset;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;
 
    private String dates[]
        = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    private String months[]
        = { "Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sup", "Oct", "Nov", "Dec" };
    private String years[]
        = {"2022","2023","2024" };
 
    // constructor, to initialize the components
    // with default values.
    public MyFrame()
    {
        setTitle("New Game Form");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
 
        c = getContentPane();
        c.setLayout(null);
 
        title = new JLabel("New Game Form");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);
 
        name = new JLabel("First and Last Name");
        name.setFont(new Font("Arial", Font.PLAIN, 12));
        name.setSize(100, 12);
        name.setLocation(50, 100);
        c.add(name);
 
        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 12));
        tname.setSize(150, 20);
        tname.setLocation(200, 100);
        c.add(tname);
 
        //mno = new JLabel("Lane number");
        //mno.setFont(new Font("Arial", Font.PLAIN, 12));
        //mno.setSize(60,12);
        //mno.setLocation(100, 150);
        //c.add(mno);
        
        //tmno = new JTextField();
        //tmno.setFont(new Font("Arial", Font.PLAIN, 12));
        //tmno.setSize(150, 12);
        //tmno.setLocation(200, 150);
        //c.add(tmno);
 
        game = new JLabel("Category");
        game.setFont(new Font("Arial", Font.PLAIN, 14));
        game.setSize(100, 12);
        game.setLocation(50, 200);
        c.add(game);
 
        MR200 = new JRadioButton("MR200");
        MR200.setFont(new Font("Arial", Font.PLAIN, 10));
        MR200.setSelected(true);
        MR200.setSize(75, 10);
        MR200.setLocation(200, 200);
        c.add(MR200);
 
        FR200 = new JRadioButton("FR200");
        FR200.setFont(new Font("Arial", Font.PLAIN, 10));
        FR200.setSelected(true);
        FR200.setSize(75, 10);
        FR200.setLocation(200, 200);
        c.add(FR200);
        
        IM200 = new JRadioButton("IM200");
        IM200.setFont(new Font("Arial", Font.PLAIN, 10));
        IM200.setSelected(true);
        IM200.setSize(75, 20);
        IM200.setLocation(200, 200);
        c.add(IM200);
        
        FR50 = new JRadioButton("FR50");
        FR50.setFont(new Font("Arial", Font.PLAIN, 10));
        FR50.setSelected(true);
        FR50.setSize(75, 20);
        FR50.setLocation(200, 200);
        c.add(FR50);
        
        FL100 = new JRadioButton("FL100");
        FL100.setFont(new Font("Arial", Font.PLAIN, 10));
        FL100.setSelected(true);
        FL100.setSize(75, 20);
        FL100.setLocation(200, 200);
        c.add(FL100);
 
        FR100 = new JRadioButton("FR100");
        FR100.setFont(new Font("Arial", Font.PLAIN, 10));
        FR100.setSelected(true);
        FR100.setSize(75, 20);
        FR100.setLocation(200, 200);
        c.add(FR100);
        
        FR500 = new JRadioButton("FR500");
        FR500.setFont(new Font("Arial", Font.PLAIN, 10));
        FR500.setSelected(true);
        FR500.setSize(75, 20);
        FR500.setLocation(200, 200);
        c.add(FR500);
        
        FRR200 = new JRadioButton("FRR200");
        FRR200.setFont(new Font("Arial", Font.PLAIN, 10));
        FRR200.setSelected(true);
        FRR200.setSize(75, 20);
        FRR200.setLocation(200, 200);
        c.add(FRR200);
        
        BK100 = new JRadioButton("BK100");
        BK100.setFont(new Font("Arial", Font.PLAIN, 10));
        BK100.setSelected(true);
        BK100.setSize(75, 20);
        BK100.setLocation(200, 200);
        c.add(BK100);
        
        BR100 = new JRadioButton("BR100");
        BR100.setFont(new Font("Arial", Font.PLAIN, 10));
        BR100.setSelected(true);
        BR100.setSize(75, 20);
        BR100.setLocation(200, 200);
        c.add(BR100);
        
        FRR400 = new JRadioButton("FRR400");
        FRR400.setFont(new Font("Arial", Font.PLAIN, 10));
        FRR400.setSelected(true);
        FRR400.setSize(75, 20);
        FRR400.setLocation(200, 200);
        c.add(FRR400);
        
        games = new ButtonGroup();
        games.add(MR200);
        games.add(FR200);
        games.add(IM200);
        games.add(FR50);
        games.add(FL100);
        games.add(FR100);
        games.add(FR500);
        games.add(FRR200);
        games.add(BK100);
        games.add(BR100);
        games.add(FRR400);
 
        dob = new JLabel("Game Date");
        dob.setFont(new Font("Arial", Font.PLAIN, 15));
        dob.setSize(100, 20);
        dob.setLocation(50, 250);
        c.add(dob);
 
        date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(200, 250);
        c.add(date);
 
        month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setLocation(250, 250);
        c.add(month);
 
        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(60, 20);
        year.setLocation(320, 250);
        c.add(year);
 
        add = new JLabel("Lane num");
        add.setFont(new Font("Arial", Font.PLAIN, 15));
        add.setSize(100, 15);
        add.setLocation(50, 300);
        c.add(add);
 
        tadd = new JTextArea();
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setSize(150, 12);
        tadd.setLocation(200, 300);
        tadd.setLineWrap(true);
        c.add(tadd);
 
       
 
        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 450);
        sub.addActionListener(this);
        c.add(sub);
 
        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 450);
        reset.addActionListener(this);
        c.add(reset);
 
        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 400);
        tout.setLocation(500, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);
 
        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 15));
        res.setSize(500, 25);
        res.setLocation(100, 500);
        c.add(res);
 
        resadd = new JTextArea();
        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
        resadd.setSize(200, 75);
        resadd.setLocation(580, 175);
        resadd.setLineWrap(true);
        c.add(resadd);
 
        setVisible(true);
    }
 
    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sub) {
                String data1;
                String data
                    = "Name : "
                      + tname.getText() + "\n";
                if (MR200.isSelected())
                    data1 = "Category : MR200"+ "\n";
                else if (FR200.isSelected())
                    data1 = "Category : FR200"+ "\n";    
                else if (IM200.isSelected())
                    data1 = "Category : IM200"+ "\n";    
                else if (FR50.isSelected())
                    data1 = "Category : FR50"+ "\n";    
                else if (FL100.isSelected())
                    data1 = "Category : FL100"+ "\n";     
                else if (FR100.isSelected())
                    data1 = "Category : FR100"+ "\n";    
                else if (FR500.isSelected())
                    data1 = "Category : FR500"+ "\n";     
                else if (FRR200.isSelected())
                    data1 = "Category : FRR200"+ "\n";    
                else if (BK100.isSelected())
                    data1 = "Category : BK100"+ "\n";    
                else if (BR100.isSelected())
                    data1 = "Category : BR100"+ "\n";     
                else 
                    data1 = "Category : FRR400"+ "\n";    
                
                    String data2
                    = "Game Date : "
                      + (String)date.getSelectedItem()
                      + "/" + (String)month.getSelectedItem()
                      + "/" + (String)year.getSelectedItem()
                      + "\n";
 
                String data3 = "Lane Number" + tadd.getText();
                tout.setText(data + data1 + data2 + data3);
                tout.setEditable(false);
                res.setText("Game Successfully Added");
            }
        else if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);
            tadd.setText(def);
            tmno.setText(def);
            res.setText(def);
            tout.setText(def);
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
            resadd.setText(def);
        }
    }
}