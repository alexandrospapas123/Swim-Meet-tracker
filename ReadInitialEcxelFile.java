import java.io.FileInputStream;  
import java.io.FileNotFoundException;  
import java.io.IOException;  
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.*;  
import org.apache.poi.ss.usermodel.Sheet;  
import org.apache.poi.ss.usermodel.Workbook;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import javax.swing.JFileChooser;
  
public class ReadInitialEcxelFile   
{  
public static  Event[][][] InputFromExcelFile(  ){     
ReadInitialEcxelFile rc=new ReadInitialEcxelFile();     
int NumberOfGames=4; 
int k =0,l=0,M=33,P=2,h;
int i,j,t2, rows=40, col = 13;
int row,cols, TempLane,TempLane1, GameNum;
double TempTime,t1;
double [] times = new double[6];
int []place = new int [6];
int pl, score;
int NumberOfEvents=33;
int N = NumberOfGames;
int E = NumberOfEvents;
String date,schools;
String TempName,TempName1,DateSchool;
double TempLn, TempLn1,Tempt,Tempt1,TempTime1;
TempName="";
//String []schools=new String [N];
Event [][][]events=new Event [N][M][P];
String event=" ", gender="";
for (k=0;k<N;k++){
    date= rc.ReadCellData(4,0,k);
    schools=rc.ReadCellData(4,5,k);
    gender=rc.ReadCellData(3,12,k);
    row=7;
    for(i=0;i<33;i++){
        if (i%3==0){ 
           event= rc.ReadCellData(row,0,k);
           row=row+3;}
        h=7+i;
        TempName=rc.ReadCellData(h,1,k);
        TempLn=rc.ReadCellNumData(h,2,k);
        TempLane=(int)(TempLn);
        Tempt=rc.ReadCellNumData(h,5,k);
        TempTime = Tempt;
        DateSchool=date+"       "+"NBG vs "+schools+"  "+gender;
        GameNum=NumberOfGames/2;
        events[k][i][0]=new Event(TempName,event,TempLane,TempTime,DateSchool, GameNum); 
        pl=0;
        score=0;
        TempName1=rc.ReadCellData(h,12,k);
        TempLn1=rc.ReadCellNumData(h,11,k);
        TempLane1=(int)(TempLn1);
        Tempt1=rc.ReadCellNumData(h,8,k);
        TempTime1 = Tempt1;
        events[k][i][1]=new Event(TempName1,event,TempLane1,TempTime1,DateSchool, GameNum);}}    
        
        
        //for(i=0;i<33;i++){
           // if (i%3==0){ System.out.println(events[k][i][0].getEvent()+"  ");}
           //System.out.println(events[k][i][0].getName()+"  "+events[k][i][0].getLane()+"  "+events[k][i][0].getTime());
           //System.out.println(events[k][i][1].getName()+"  "+events[k][i][1].getLane()+"  "+events[k][i][1].getTime());}}
       return events;
           //for(i=1;i<6;i++){
           //for(j=5;j>i-1;j--){
               //if (times[j-1]>times[j]){
                   //t1=times[j-1];
                   //times[j-1]=times[j];
                   //times[j]=t1;
                   //t2=place[j-1];
                   //place[j-1]=place[j];
                   //place[j]=t2;} } }
       //for (i=0;i<5;i++){
          //if(place[i]<=3){
               //events[l][place[i]][3].setPlace(i+1);
               //events[l][place[i]][4].setPoints(i+1," ");}
        //else{
               //events[l][place[i]-3][10].setPlace(i+1);
               //events[l][place[i]-3][9].setPoints(i+1," ");}
    //System.out.println(date[k]+schools[k]);   
        }

public String ReadCellData(int vRow, int vColumn, int shiit)  
{  
    String value = null;
    Workbook wb = null;
    try {
        //JFileChooser j = new JFileChooser();
 
        // Open the save dialog
    
        
        // while (j.showOpenDialog(null) != JFileChooser.APPROVE_OPTION) {
            // java.io.File f = j.getSelectedFile();
            // System.err.println(f.getPath());
        // }
        
        //FileInputStream fis = new FileInputStream(j.getSelectedFile().getPath());
         FileInputStream fis = new FileInputStream("/Users/alexpap/GitHub/Swim Meet Tracker/Βιβλίο2.xlsx");
        wb = new XSSFWorkbook(fis);
        Sheet sheet = wb.getSheetAt(shiit);    
        Row row = sheet.getRow(vRow);
        Cell cell = row.getCell(vColumn);
        if (row == null || cell == null) {
            return null;
        }
        value = cell.getStringCellValue();
        return value;
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e1) {
        e1.printStackTrace();
    }
    return value;}
    
 public double ReadCellNumData(int vRow, int vColumn, int shiit)  
{  
    double value = 0.0;
    Workbook wb = null;
    try {
        FileInputStream fis = new FileInputStream("/Users/alexpap/GitHub/Swim Meet Tracker/Βιβλίο copy.xlsx");
        wb = new XSSFWorkbook(fis);
        Sheet sheet = wb.getSheetAt(shiit);    
        Row row = sheet.getRow(vRow);
        Cell cell = row.getCell(vColumn);
        if (row == null || cell == null) {
            return 0.0;
        }
        value = cell.getNumericCellValue();
        return value;
    } catch (FileNotFoundException e) {
       e.printStackTrace();
    } catch (IOException e1) {
        e1.printStackTrace();
    }
    return value;}
} 