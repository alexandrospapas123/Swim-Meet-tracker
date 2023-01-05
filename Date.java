

public class Date
{
    // instance variables - replace the example below with your own
    private int day;
    private int month;
    private int year;
    private String G;

    /**
     * Constructor for objects of class Date
     */
    public Date(int day,int month, int year,String G)
    {
        this.month=month;
        this.day=day;
        this.year=year;
        this.G=G;
    }

    public void setDay(int day){
        this.day=day;
    }
    public int getDay( )
    {
        return day;
    }
    public void setMonth(int month){
        this.month=month;
    }
    public int getMonth( )
    {
        return month;
    }
    public void setYear(int year){
        this.year=year;
    }
    public int getYear( )
    {
        return year;
    }
    public void setG(String G){
        this.G=G;
    }
    public String getG( )
    {
        return G;
    }
}