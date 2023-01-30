import java.util.List;

public class Event {
    private String name;
    private String event;
    private double time;
    private int lane;
    private int points;
    private int pl;
    private int score;
    private String DateSchool;
    private int GameNum;
    public Event(String name, String event, int lane, double time, String DateSchool, int GameNum ) {
        this.name = name;
        this.event = event;
        this.time = time;
        this.lane = lane;
        this.points = 0;
        this.pl=0;
        this.score=0;
        this.DateSchool=DateSchool;
        this.GameNum = GameNum;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public int getLane() {
        return lane;
    }

    public void setLane(int lane) {
        this.lane = lane;
    }
    public int getPlace() {
        return pl;
    }

    public void setPlace(int pl) {
        this.pl = pl;
    }
     public String getDateSchool() {
        return DateSchool;
    }

    public void setDateSchool(String DateSchool) {
        this.DateSchool = DateSchool;
    }
    public int getGameNum() {
        return GameNum;
    }

    public void setGameNum(int GameNum) {
        this.GameNum = GameNum;
    }
    public int getPoints() {
        return points;
    }

    public void setPoints(int pl, String Type) {
        
        if (Type.equals("R")){ 
            if(pl==1){this.points = 8;}
            else if(pl==2){this.points = 4;}
            else if(pl==3){this.points = 2;}
            else {this.points = 0;}}
        else{
            if(pl==1){this.points = 6;}
            else if(pl==2){this.points = 4;}
            else if(pl==3){this.points = 3;}
            else if(pl==4){this.points = 2;}
            else if(pl==5){this.points = 1;}
            else {this.points = 0;}}
        }
     public int getScore() {
        return pl;
    }

    public void setScore(int score) {
        this.score = score;
    }    
}
            

    //public Athlete getAthlete() {
        //return athlete;
    //}

    //public void setAthlete(Athlete athlete) {
        //this.athlete = athlete;
    //}
//}