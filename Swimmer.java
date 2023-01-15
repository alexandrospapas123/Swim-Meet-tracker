

public class Swimmer
{
    
    private String Name;
    private String Grade;
    private String Gender;
    private Performance [][]perf;

    /**
     * Constructor for objects of class Swimmer
     */
    public Swimmer()
    {
        // initialise instance variables
        this.Name = Name;
        this.Grade = Grade;
        this.Gender = Gender;
        this.perf=perf;
    }

    public void setName(String newName){
        this.Name=newName;
    }
    public String getName( )
    {
        return Name;
    }
    
    public void setGrade(String newGrade){
        this.Grade=newGrade;
    }
    public String getGrade( )
    {
        return Grade;
    }
    
    public void setGender(String newGender){
        this.Gender=newGender;
    }
    public String getGender( )
    {
        return Gender;
    }
    
    public void setPerformance(Performance [][] newperf){
        this.perf=newperf;
    }
    public Performance [][] getPerformance( ){
        return perf;
    }   
}