/**
 * Each object of the class has the attributes Category (12 different categories)
 * time record, lane, placement and points)
 */
public class Performance
{

    private String Cat;
    private int Lane;
    private double Time;
    private int Placement;
    private int Points;
    private Date d;
    public Performance(int Lane, double Time,Date d){
        this.Cat=Cat;
        this.Lane=Lane;
        this.Time=Time;
        this.d=d;
        Placement=0;
        Points = 0;
    }

    public void setCategory(String newCat){
        this.Cat=newCat;
    }
    public String getCategory( )
    {
        return Cat;
    }
    
    public void setLane(int newLane){
        this.Lane=newLane;
    }
    public int getLane( )
    {
        return Lane;
    }
    
    public void setTime(double newTime){
        this.Time=newTime;
    }
    public double getTime( )
    {
        return Time;
    }
    
    public void setPlacement(int newPlace){
        this.Placement=newPlace;
    }
    public int getPlacement( )
    {
        return Placement;
    }
    
    public void setPoints(int newPoints){
        this.Points=newPoints;
    }
    public int getPoints( )
    {
        return Points;
    }
     public void setDate(Date d){
        this.d=d;
    }
    public Date getDate( )
    {
        return d;
    }
    
}
